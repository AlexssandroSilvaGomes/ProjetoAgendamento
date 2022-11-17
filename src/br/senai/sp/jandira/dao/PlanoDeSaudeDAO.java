package br.senai.sp.jandira.dao;

import br.senai.sp.jandira.model.PlanoDeSaude;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import jdk.dynalink.StandardOperation;

public class PlanoDeSaudeDAO {
    
    private final static String URL = "C:\\Users\\22282169\\java\\PlanoDeSaude.txt";
    private final static String URL_TEMP = "C:\\Users\\22282169\\java\\PlanoDeSaude-temp.txt";
    
    private final static Path PATH = Paths.get(URL);
    private final static Path PATH_TEMP = Paths.get(URL_TEMP);

    private static ArrayList<PlanoDeSaude> planosDeSaude = new ArrayList<>();

    public static ArrayList<PlanoDeSaude> getPlanoDeSaude() {
        return planosDeSaude;
    }

    public static PlanoDeSaude getPlanoDeSaude(Integer codigo) {
        for (PlanoDeSaude p : planosDeSaude) {
            if (codigo == p.getCodigo()) {
                return p;
            }
        }

        return null;
    }

    //CRUD
    public static void gravar(PlanoDeSaude p) {
        planosDeSaude.add(p);
        
        //gravar em arquivo
        try {
            BufferedWriter escritor = Files.newBufferedWriter(
                    PATH,
                    StandardOpenOption.APPEND,
                    StandardOpenOption.WRITE);
            escritor.write(p.getPlanoDeSaudeSeparadaPorPontoEVirgula());
            escritor.newLine();
            escritor.close();
            
        } catch (IOException erro) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro");
        }
    }

    public static void excluir(Integer codigo) {
        for (PlanoDeSaude p : planosDeSaude) {
            if (p.getCodigo().equals(codigo)) {
                planosDeSaude.remove(p);
                break;
            }
        }
        
        atualizarArquivo();
        
    }
    
    private static void atualizarArquivo() {
        //PASSO 01 - Criar uma representação dos arquivos que serão manipulados
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
            for (PlanoDeSaude p : planosDeSaude) {
                bwTemp.write(p.getPlanoDeSaudeSeparadaPorPontoEVirgula());
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

    public static void atualizar(PlanoDeSaude correta) {
        for (PlanoDeSaude p : planosDeSaude) {
            if (correta.getCodigo() == p.getCodigo()) {
                int posicao = planosDeSaude.indexOf(p);
                planosDeSaude.set(posicao, correta);
                break;
            }
        }
        
        atualizarArquivo();
        
    }

    //criar lista inicial de planos de saude
    public static void criarListaDePlanosDeSaude() {
        
        try {
            BufferedReader leitor = Files.newBufferedReader(PATH);
            String linha = leitor.readLine();
            
            while (linha != null) {
                //transformar os dados da linha em um plano de saude
                String[] vetor = linha.split(";");
                PlanoDeSaude p = new PlanoDeSaude(
                        vetor[1],
                        vetor[2],
                        vetor[3],
                        LocalDate.parse(vetor[4]),
                        Integer.valueOf(vetor[0]));
                
                //guardar o plano de saude na lista
                planosDeSaude.add(p);
                
                //ler próxima linha
                linha = leitor.readLine();
            }
            
            leitor.close();
            
        } catch (IOException erro) {
            JOptionPane.showMessageDialog(null, "Ocorreu um erro ao ler o arquivo");
        }
    }
    
    public static DefaultTableModel getPlanosDeSaudeModel() {
        String[] titulos = {"CÓDIGO", "OPERADORA", "CATEGORIA", "NUMERO", "VALIDADE"};
        
        String[][] dados = new String[planosDeSaude.size()][5];
        
        for (PlanoDeSaude p: planosDeSaude) {
            dados[planosDeSaude.indexOf(p)][0] = p.getCodigo().toString();
            dados[planosDeSaude.indexOf(p)][1] = p.getOperadora();
            dados[planosDeSaude.indexOf(p)][2] = p.getCategoria();
            dados[planosDeSaude.indexOf(p)][3] = p.getNumero();
            DateTimeFormatter barra = DateTimeFormatter.ofPattern("dd/MM/yyyy");
            dados[planosDeSaude.indexOf(p)][4] = p.getValidade().format(barra);
        }
        
        DefaultTableModel model = new DefaultTableModel(dados, titulos);
        
        return model;
        
    }

}
