package br.senai.sp.jandira.model;

import java.time.LocalDate;

public class Medico {

	private String nome;
	private String telefone;
	private String email;
	private String crm;
        private LocalDate dataDeNascimento;
	private Especialidade[] especialidade;
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
                LocalDate dataDeNascimento) {
            this.crm = crm;
            this.nome = nome;
            this.telefone = telefone;
            this.email = email;
            this.dataDeNascimento = dataDeNascimento;
            this.codigo = codigo;
            this.contador = codigo;
            
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

	public Especialidade[] getEspecialidade() {
		return especialidade;
	}

	public void setEspecialidade(Especialidade[] especialidade) {
		this.especialidade = especialidade;
	}
        
        public String getMedicoSeparadoPorPontoEVirgula() {
            return this.codigo + ";" + this.crm + ";" + this.nome + ";" + this.telefone + ";" + this.email + ";" + this.dataDeNascimento;
        }
}
