package br.jus.trf1.aletheia.model;

import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotBlank;

public class Contagem {
	
	@NotBlank
	private String nome;
	
	@NotBlank
	private String sistema;
	
	@Size(min = 1, max = 200)
	private String observacao;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSistema() {
		return sistema;
	}
	public void setSistema(String sistema) {
		this.sistema = sistema;
	}
	
}
