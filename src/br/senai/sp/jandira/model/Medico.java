package br.senai.sp.jandira.model;

import java.time.LocalDate;
import java.util.ArrayList;

public class Medico {

    private String nome;
    private String telefone;
    private String email;
    private String crm;
    private LocalDate dataDeNascimento;
    private ArrayList<Especialidade> especialidade;
    private Integer codigo;
    private static int contador = 99;

    //Construtores da classe
    public Medico() {
        gerarCodigo();
    }

    public Medico(
            String crm,
            String nome,
            String telefone,
            String email,
            LocalDate dataDeNascimento) {
        this.crm = crm;
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.dataDeNascimento = dataDeNascimento;
        gerarCodigo();

    }

    public Medico(
            Integer codigo,
            String crm,
            String nome,
            String telefone,
            String email,
            LocalDate dataDeNascimento,
            ArrayList<Especialidade> especialidade) {
        this.crm = crm;
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
        this.dataDeNascimento = dataDeNascimento;
        this.codigo = codigo;
        this.contador = codigo;
        this.especialidade = especialidade;

    }

    private void gerarCodigo() {
        this.contador++;
        this.codigo = contador;
    }

    //Métodos de acesso aos atributos
    public static int getContador() {
        return contador;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public LocalDate getDataDeNascimento() {
        return dataDeNascimento;
    }

    public void setDataDeNascimento(LocalDate dataDeNascimento) {
        this.dataDeNascimento = dataDeNascimento;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }

    public ArrayList<Especialidade> getEspecialidade() {
        return especialidade;
    }

    public void setEspecialidade(ArrayList<Especialidade> especialidade) {
        this.especialidade = especialidade;
    }
    
    public String listaToString(ArrayList<Especialidade> lista) {
        ArrayList<String> codigosEspecialidade = new ArrayList<>();
        for (Especialidade e : lista) {
            codigosEspecialidade.add(e.getCodigo().toString());
        }
        
        return String.join(";", codigosEspecialidade);
    }

    public String getMedicoSeparadoPorPontoEVirgula() {
        return this.codigo + ";" 
                + this.crm + ";" 
                + this.nome + ";" 
                + this.telefone + ";" 
                + this.email + ";" 
                + this.dataDeNascimento + ";"
                + listaToString(this.especialidade);
    }
}
