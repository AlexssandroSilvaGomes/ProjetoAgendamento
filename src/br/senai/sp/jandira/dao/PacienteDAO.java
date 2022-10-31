package br.senai.sp.jandira.dao;

import br.senai.sp.jandira.model.Paciente;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;

public class PacienteDAO {
    private static ArrayList<Paciente> pacientes = new ArrayList<>();

    public ArrayList<Paciente> getPacientes() {
        return pacientes;
    }
    
    public static Paciente getPacientes(Integer codigo) {
        for(Paciente p: pacientes) {
            if(codigo == p.getCodigo()) {
                return p;
            }
        }
        
        return null;
    }
    
    //CRUD
    public static void gravar(Paciente p) {
        pacientes.add(p);
    }
    
    public static void excluir(Integer codigo) {
        for(Paciente p: pacientes) {
            if(codigo == p.getCodigo()) {
                pacientes.remove(p);
                break;
            }
        }
    }
    
    public static void atualizar(Paciente correta) {
        for(Paciente p: pacientes) {
            if(correta.getCodigo() == p.getCodigo()) {
                int posicao = pacientes.indexOf(p);
                pacientes.set(posicao, correta);
                break;
            }
        }
    }
    
    //criar lista inicial de pacientes
    public static void criarListaDePacientes() {
        Paciente p1 = new Paciente("Alberto", "157.452.848-21");
        Paciente p2 = new Paciente("Maria", "233.656.328-63");
        Paciente p3 = new Paciente("Gustavo", "898.768.344-34");
        Paciente p4 = new Paciente("Mirele", "853.245.634-13");
    
        pacientes.add(p1);
        pacientes.add(p2);
        pacientes.add(p3);
        pacientes.add(p4);
    }
    
    public static DefaultTableModel getPacientesModel() {
        String[] titulos = {"CÓDIGO", "NOME", "CPF"};
        
        String[][] dados = new String[pacientes.size()][3];
        
        for (Paciente p: pacientes) {
            dados[pacientes.indexOf(p)][0] = p.getCodigo().toString();
            dados[pacientes.indexOf(p)][1] = p.getNome();
            dados[pacientes.indexOf(p)][2] = p.getCpf();
        }
        
        DefaultTableModel model = new DefaultTableModel(dados, titulos);
        
        return model;
    }
}
