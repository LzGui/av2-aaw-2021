package com.aaqweb.av2.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.aaqweb.av2.api.RecursosEmpresaDto;
import com.aaqweb.av2.domain.entity.RecursosEmpresa;
import com.aaqweb.av2.service.RecursosEmpresaService;

public class RecursosEmpresaController {
	private final RecursosEmpresaService recursosEmpresaService;
	
	public RecursosEmpresaController(RecursosEmpresaService recursosEmpresaService) {
		this.recursosEmpresaService = recursosEmpresaService;
	}
	
	@GetMapping("/users/{id}")
	public RecursosEmpresaDto getById(@PathVariable String id) {
		var recursos = recursosEmpresaService.get(id);
		
		return new RecursosEmpresaDto(recursos);
	}
	
	@GetMapping("/users")
	public List<RecursosEmpresaDto> getAll() {
		var recursos = recursosEmpresaService.getAll();
		
		var recursosEmpresaDto = new ArrayList<RecursosEmpresaDto>();
		
		for (var recurso: recursos) {
			recursosEmpresaDto.add(new RecursosEmpresaDto(recurso));
		}
		
		return recursosEmpresaDto;
	}
	
	@PostMapping("/users")
	public RecursosEmpresaDto create(@RequestBody RecursosEmpresaDto re) {
		var recurso = new RecursosEmpresa(re); 
		
		recurso = recursosEmpresaService.create(recurso);
		
		return new RecursosEmpresaDto(recurso); 
	}
	
	@PutMapping("/users/{id}")
	public RecursosEmpresaDto update(@PathVariable String id, @RequestBody RecursosEmpresaDto re) {
		var recurso = new RecursosEmpresa(re);

		recurso = recursosEmpresaService.update(id, recurso);
		
		return new RecursosEmpresaDto(recurso);
	}
	
	@DeleteMapping("/users/{id}")
	public ResponseEntity<Void> delete(@PathVariable String id) {
		recursosEmpresaService.delete(id);
		
		return new ResponseEntity<Void>(HttpStatus.NO_CONTENT);
	}
}
