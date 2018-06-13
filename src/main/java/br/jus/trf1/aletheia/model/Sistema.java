package br.jus.trf1.aletheia.model;

public enum Sistema {

	SARH("Sarh"),
	FOLHA_PAGAMENTO("Folha de Pagamento"),
	SICAM("Sicam"),
	SIREC("Sirec"),
	SISTRA("Sistra");
	
	private String descricao;
	
	Sistema(String descricao) {
		this.descricao = descricao;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
}
