package br.com.cotiinformatica.entities;

import java.util.Date;
import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;

@Entity
@Table(name = "tb_tarefa")

public class Tarefa {

	@Id
	@Column
	private UUID id;
	
	
	@Column(length = 150, nullable = false)
	private String titulo;
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(nullable = false)
	private Date dataHora;
	
	@Column(nullable = false)
	private Boolean finalizada;
	
	@ManyToOne   		// colocar o Delete CASCADE
	@JoinColumn(name = "categoria_id", nullable = false)
	private Categoria categoria;

	public Tarefa() {
		// TODO Auto-generated constructor stub
	}

	public Tarefa(UUID id, String titulo, Date dataHora, Boolean finalizada, Categoria categoria) {
		super();
		this.id = id;
		this.titulo = titulo;
		this.dataHora = dataHora;
		this.finalizada = finalizada;
		this.categoria = categoria;
	}

	public UUID getId() {
		return id;
	}

	public void setId(UUID id) {
		this.id = id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public Date getDataHora() {
		return dataHora;
	}

	public void setDataHora(Date dataHora) {
		this.dataHora = dataHora;
	}

	public Boolean getFinalizada() {
		return finalizada;
	}

	public void setFinalizada(Boolean finalizada) {
		this.finalizada = finalizada;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

}
