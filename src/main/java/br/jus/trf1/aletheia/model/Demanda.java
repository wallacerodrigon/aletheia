package br.jus.trf1.aletheia.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import org.hibernate.validator.constraints.NotBlank;

@Entity
@Table(name = "demanda")
public class Demanda {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long codigo;
	
	@NotBlank(message = "Nome da demanda é obrigatório")
	private String nome;	

	@NotNull(message = "A identificação do Sistema é obrigatório")
	@ManyToOne
	@JoinColumn(name = "codigo_sistema")
	private Sistema sistema;
	
	@NotNull(message = "A identificação do Lote é obrigatório")
	@ManyToOne
	@JoinColumn(name = "codigo_lote")
	private Lote lote;
	
	@NotNull(message = "A plataforma tecnológica é obrigatória")
	@Enumerated(EnumType.STRING)
	private Plataforma plataforma;
	
	@Column(name = "tipo_demanda")
	private String tipoDemanda;
		
	@Size(min = 1, max = 200, message = "O tamanho da descrição deve estar entre 1 e 200")
	private String observacao;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Sistema getSistema() {
		return sistema;
	}

	public void setSistema(Sistema sistema) {
		this.sistema = sistema;
	}

	public Lote getLote() {
		return lote;
	}

	public void setLote(Lote lote) {
		this.lote = lote;
	}

	public Plataforma getPlataforma() {
		return plataforma;
	}

	public void setPlataforma(Plataforma plataforma) {
		this.plataforma = plataforma;
	}

	public String getTipoDemanda() {
		return tipoDemanda;
	}

	public void setTipoDemanda(String tipoDemanda) {
		this.tipoDemanda = tipoDemanda;
	}

	public String getObservacao() {
		return observacao;
	}

	public void setObservacao(String observacao) {
		this.observacao = observacao;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((codigo == null) ? 0 : codigo.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Demanda other = (Demanda) obj;
		if (codigo == null) {
			if (other.codigo != null)
				return false;
		} else if (!codigo.equals(other.codigo))
			return false;
		return true;
	}

}
