package br.jus.trf1.aletheia.model;

public enum Plataforma {

	MOBILE("Mobile"),
	PYTHON("Python"),
	PERL("Perl"),
	UNIX_SHELL("Unix Shell"),
	JAVASCRIPT("JavaScript"),
	VBSCRIPT("Vb Script"),
	ORACLE_FORMS("Oracle Forms"),
	JAVA("Java");
	
	private String descricao;
	
	Plataforma(String descricao) {
		this.descricao = descricao;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
}