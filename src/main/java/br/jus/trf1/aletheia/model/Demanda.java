package br.jus.trf1.aletheia.model;

import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotBlank;

public class Demanda {
	
	@NotBlank(message = "Nome da demanda é obrigatório")
	private String nome;
	
	@NotBlank(message = "Nome do Sistema é obrigatório")
	private String sistema;
	
	@Size(min = 1, max = 200, message = "O tamanho da descrição deve estar entre 1 e 200")
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
	public String getObservacao() {
		return observacao;
	}
	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}
	
}
