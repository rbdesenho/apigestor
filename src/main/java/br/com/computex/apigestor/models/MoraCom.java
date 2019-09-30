package br.com.computex.apigestor.models;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;


@Entity
@Table(name="mora_com")
@SequenceGenerator(name="mora_com_sequence", sequenceName="mora_com_seq", allocationSize=1)
public class MoraCom implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO, generator="mora_com_sequence")
	private long id;
	
	@NotNull
	private String descricao;
	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
}
