package br.senai.sp.jandira.dao;

import br.senai.sp.jandira.model.Medico;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.time.LocalDate;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class MedicoDAO {
    private final static String URL = "C:\\Users\\22282169\\Java\\Medico.txt";
    private final static String URL_TEMP = "C:\\Users\\22282169\\Java\\Medico-temp.txt";
    
    private final static Path PATH = Paths.get(URL);
    private final static Path PATH_TEMP = Paths.get(URL_TEMP);
    
    private static ArrayList<Medico> medicos = new ArrayList<>();
    
    public static ArrayList<Medico> getMedicos() {
        return medicos;
    }
    
    public static Medico getMedicos(Integer codigo) {
        for (Medico m : medicos) {
            if (m.getCodigo().equals(codigo)) {
                return m;
            }
        }
        
        return null;
    }
    
    //CRUD
    public static void gravar(Medico m) {
        medicos.add(m);
        
        //Gravar em arquivo
        try {
            BufferedWriter escritor = Files.newBufferedWriter(
                    PATH,
                    StandardOpenOption.APPEND,
                    StandardOpenOption.WRITE);
            escritor.write(m.getMedicoSeparadoPorPontoEVirgula());
            escritor.newLine();
            escritor.close();
            
        } catch (IOException erro) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro");
        }
    }
    
    public static void excluir(Integer codigo) {
        for (Medico m : medicos) {
            if (m.getCodigo().equals(codigo)) {
                medicos.remove(m);
                break;
            }
        }
        
        atualizarArquivo();
        
    }
    
    private static void atualizarArquivo() {
        //Passo 01 - Crair uma representação dos arquivos que serão manipulados
        File arquivoAtual = new File(URL);
        File arquivoTemp = new File(URL_TEMP);
        
        try {
            //Criar o arquivo temporario
            arquivoTemp.createNewFile();
            
            //Abrir arquivo temporario para escrita
            BufferedWriter bwTemp = Files.newBufferedWriter(
                    PATH_TEMP,
                    StandardOpenOption.APPEND,
                    StandardOpenOption.WRITE);
            
            //iterar na lista para adicionar as especialidades no arquivo temporario
            //exceto o registro que não queremos mais
            for (Medico m : medicos) {
                bwTemp.write(m.getMedicoSeparadoPorPontoEVirgula());
                bwTemp.newLine();
            }
            
            bwTemp.close();
            
            //Excluir arquivo atual
            arquivoAtual.delete();
            //Renomear arquivo temp
            arquivoTemp.renameTo(arquivoAtual);
            
        } catch (Exception erro) {
            erro.printStackTrace();
        }
        
    }
    
    public static void atualizar(Medico correta) {
        for (Medico m : medicos) {
            if (m.getCodigo().equals(correta.getCodigo())) {
                int posicao = medicos.indexOf(m);
                medicos.set(posicao, correta);
                break;
            }
        }
        
        atualizarArquivo();
        
    }
    
    //Criar lista inicial de medicos
    public static void criarListaDeMedicos() {
        
        try {
            BufferedReader leitor = Files.newBufferedReader(PATH);
            String linha = leitor.readLine();
            
            while (linha != null) {
                //transformar os dados da linha em um medico
                String[] vetor = linha.split(";");
                Medico m = new Medico(
                        Integer.valueOf(vetor[0]),
                        vetor[1],
                        vetor[2],
                        vetor[3],
                        vetor[4],
                        LocalDate.parse(vetor[5]));
                
                //Guardar o medico na lista
                medicos.add(m);
                
                //Ler o medico na lista
                linha = leitor.readLine();
            }
            
            leitor.close();
            
        } catch (IOException erro) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro ao ler o arquivo!");
        }
    }
    
    public static DefaultTableModel getMedicosModel() {
        String[] titulos = {"CÓDIGO", "CRM", "NOME", "TELEFONE"};
        
        String[][] dados = new String[medicos.size()][4];
        
        for (Medico m : medicos) {
            dados[medicos.indexOf(m)][0] = m.getCodigo().toString();
            dados[medicos.indexOf(m)][1] = m.getCrm();
            dados[medicos.indexOf(m)][2] = m.getNome();
            dados[medicos.indexOf(m)][3] = m.getTelefone();
        }
        
        DefaultTableModel model = new DefaultTableModel(dados, titulos);
        
        return model;
    }
}
