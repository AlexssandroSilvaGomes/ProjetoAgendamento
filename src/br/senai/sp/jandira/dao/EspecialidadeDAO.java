package br.senai.sp.jandira.dao;

import br.senai.sp.jandira.model.Especialidade;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class EspecialidadeDAO {

    private final static String URL = "C:\\Users\\22282169\\java\\Especialidade.txt";
    private final static String URL_TEMP = "C:\\Users\\22282169\\java\\Especialidade-temp.txt";

    private final static Path PATH = Paths.get(URL);
    private final static Path PATH_TEMP = Paths.get(URL_TEMP);

    private static ArrayList<Especialidade> especialidades = new ArrayList<>();

    public static ArrayList<Especialidade> getEspecialidades() {
        return especialidades;
    }

    public static Especialidade getEspecialidades(Integer codigo) {
        for (Especialidade e : especialidades) {
            if (e.getCodigo().equals(codigo)) {
                return e;
            }
        }

        return null;
    }

    //CRUD
    public static void gravar(Especialidade e) {
        especialidades.add(e);

        //Gravar em arquivo
        try {
            BufferedWriter escritor = Files.newBufferedWriter(
                    PATH,
                    StandardOpenOption.APPEND,
                    StandardOpenOption.WRITE);
            escritor.write(e.getEspecialidadeSeparadaPorPontoEVirgula());
            escritor.newLine();
            escritor.close();

        } catch (IOException erro) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro");
        }
    }

    public static void excluir(Integer codigo) {
        for (Especialidade e : especialidades) {
            if (e.getCodigo().equals(codigo)) {
                especialidades.remove(e);
                break;
            }
        }
        
        atualizarArquivo();
        
    }

    private static void atualizarArquivo() {
        // PASSO 01 - Criar uma representação dos arquivos que serão manipulados
        File arquivoAtual = new File(URL);
        File arquivoTemp = new File(URL_TEMP);

        try {
            //criar o arquivo temporario
            arquivoTemp.createNewFile();

            //Abrir arquivo temporario para escrita
            BufferedWriter bwTemp = Files.newBufferedWriter(
                    PATH_TEMP,
                    StandardOpenOption.APPEND,
                    StandardOpenOption.WRITE);
            
            //Iterar na lista para adicionar as especialidades no arquivo temporario
            //exceto o registro que não queremos mais
            for (Especialidade e : especialidades) {
                bwTemp.write(e.getEspecialidadeSeparadaPorPontoEVirgula());
                bwTemp.newLine();
            }
            
            bwTemp.close();
            
            //Excluir arquivo atual
            arquivoAtual.delete();
            //Renomear arquivo temp
            arquivoTemp.renameTo(arquivoAtual);
            
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void atualizar(Especialidade correta) {
        for (Especialidade e : especialidades) {
            if (e.getCodigo().equals(correta.getCodigo())) {
                int posicao = especialidades.indexOf(e);
                especialidades.set(posicao, correta);
                break;
            }
        }
        
        atualizarArquivo();
       
    }

    //Criar Lista Inicial de especialidades
    public static void criarlistaDeEspecialidades() {

        try {
            BufferedReader leitor = Files.newBufferedReader(PATH);
            String linha = leitor.readLine();

            while (linha != null) {
                //transformar os dados da linha em uma especialidade
                String[] vetor = linha.split(";");
                Especialidade e = new Especialidade(
                        vetor[1],
                        vetor[2],
                        Integer.valueOf(vetor[0]));

                //guardar a especialidade na lista
                especialidades.add(e);

                //ler a próxima linha
                linha = leitor.readLine();
            }

            leitor.close();

        } catch (IOException erro) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro ao ler o arquivo");
        }
    }

    public static DefaultTableModel getEspecialidadesModel() {
        String[] titulos = {"CÓDIGO", "NOME DA ESPECIALIDADE", "DESCRIÇÃO"};

        String[][] dados = new String[especialidades.size()][3];

        for (Especialidade e : especialidades) {
            dados[especialidades.indexOf(e)][0] = e.getCodigo().toString();
            dados[especialidades.indexOf(e)][1] = e.getNome();
            dados[especialidades.indexOf(e)][2] = e.getDescriçao();
        }

        DefaultTableModel model = new DefaultTableModel(dados, titulos);

        return model;
    }
}
