package br.com.cotiinformatica.controllers;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.cotiinformatica.dtos.CategoriaResponseDto;
import br.com.cotiinformatica.repositories.CategoriaRepository;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;

@RestController
@RequestMapping("/api/v1/categorias")
@Tag(name = "Categorias", description = "Serviço para operações relacionadas a categorias.")
public class CategoriasController {
	// Anotação pro Spring boot já inicializar um determinado objeto de forma automática, sem "new".
	@Autowired CategoriaRepository categoriaRepository;
	@Autowired ModelMapper mapper;
	
	@Operation(summary = "Consulta de categorias", description = "Retorna todas as categorias cadastradas.")
	@GetMapping
	public List<CategoriaResponseDto> get() {
		
		var categorias = categoriaRepository.findAll();
		
		
		return categorias.stream().map(categoria -> mapper.map(categoria, CategoriaResponseDto.class)).toList();
		
	}

}
