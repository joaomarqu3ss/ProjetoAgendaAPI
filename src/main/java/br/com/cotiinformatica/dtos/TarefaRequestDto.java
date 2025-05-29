package br.com.cotiinformatica.dtos;

import java.util.UUID;

import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import jakarta.validation.constraints.Size;

public class TarefaRequestDto {
	@Size(min = 8, max  = 150, message = "O título da tarefa deve ter entre 8 e 150 caracteres.")
	@NotEmpty(message = "Por favor, informe o título da tarefa.")
	private String titulo;
	
	@Pattern(regexp = "^\\d{4}-\\d{2}-\\d{2}$", message = "A data deve estar no formato aaaa-mm-dd.")
	@NotEmpty(message = "Por favor, informe a data da tarefa.")
	private String data;
	
	@Pattern(regexp = "^\\d{2}:\\d{2}$", message = "A hora deve estar no formato hh:mm.")
	@NotEmpty(message = "Por favor, informe a hora da tarefa.")
	private String hora;
	
	@NotNull(message = "Por favor, informe se a tarefa foi finalizada ou não.")
	private Boolean finalizado;
	
	@NotNull(message = "Por favor, informe o id da categoria da tarefa.")
	private UUID categoriaId;

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getData() {
		return data;
	}

	public void setData(String data) {
		this.data = data;
	}

	public String getHora() {
		return hora;
	}

	public void setHora(String hora) {
		this.hora = hora;
	}

	public Boolean getFinalizado() {
		return finalizado;
	}

	public void setFinalizado(Boolean finalizado) {
		this.finalizado = finalizado;
	}

	public UUID getCategoriaId() {
		return categoriaId;
	}

	public void setCategoriaId(UUID categoriaId) {
		this.categoriaId = categoriaId;
	}

}
