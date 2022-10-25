package br.senai.sp.jandira.dao;

import br.senai.sp.jandira.model.PlanoDeSaude;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeFormatterBuilder;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class PlanoDeSaudeDAO {

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
    }

    public static void excluir(Integer codigo) {
        for (PlanoDeSaude p : planosDeSaude) {
            if (codigo == p.getCodigo()) {
                planosDeSaude.remove(p);
                break;
            }
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
    }

    //criar lista inicial de planos de saude
    public static void criarListaDePlanosDeSaude() {
        PlanoDeSaude p1 = new PlanoDeSaude("NotreDame", "Básico", "123-456", LocalDate.of(2022,2, 12));
        PlanoDeSaude p2 = new PlanoDeSaude("Amil Médicas", "intermediário", "343-466",LocalDate.of(2022,4, 23));
        PlanoDeSaude p3 = new PlanoDeSaude("Bradesco Intermédicas", "completo", "763-496",LocalDate.of(2022,10, 17));
        PlanoDeSaude p4 = new PlanoDeSaude("Porto Seguo", "Especialista", "673-786",LocalDate.of(2022,3, 13));
    
        planosDeSaude.add(p1);
        planosDeSaude.add(p2);
        planosDeSaude.add(p3);
        planosDeSaude.add(p4);
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
