package br.senai.sp.jandira.model;

import java.time.LocalDate;

public class PlanoDeSaude {
	
	private String operadora;
	private String categoria;
	private String numero;
	private LocalDate validade;
	private Integer codigo;
        private static int contador = 99;
	
        //construtores da classe
	public PlanoDeSaude(){
            gerarCodigo();
	}
	
	public PlanoDeSaude(String operadora, String categoria, String numero, LocalDate validade) {
		this.operadora = operadora;
                this.categoria = categoria;
                this.numero = numero;
                this.validade = validade;
		gerarCodigo();
	}
	
        private void gerarCodigo() {
            this.contador++;
            this.codigo = contador;
        }
        
        //métodos de acesso aos atributos
	public void setOperadora(String operadora) {
		this.operadora = operadora;
	}
	
	public String getOperadora() {
		return operadora;
	}
	
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	public String getCategoria() {
		return categoria;
	}
	
	public void setNumero(String numero) {
		this.numero = numero;
	}
	public String getNumero() {
		return numero;
	}
	
	public void setValidade(LocalDate validade) {
		this.validade = validade; 
	}
	public LocalDate getValidade() {
		return validade;
	}
	
	public Integer getCodigo() {
		return codigo;
	}
	
}
