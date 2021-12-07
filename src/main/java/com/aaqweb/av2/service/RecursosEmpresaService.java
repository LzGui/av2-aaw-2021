package com.aaqweb.av2.service;

import java.time.LocalDateTime;
import java.util.List;

import com.aaqweb.av2.domain.entity.RecursosEmpresa;
import com.aaqweb.av2.domain.repository.RecursosEmpresaRepository;
import com.aaqweb.av2.exception.NotFoundException;

public class RecursosEmpresaService {
	private final RecursosEmpresaRepository recursosEmpresaRepository;

	public RecursosEmpresaService(RecursosEmpresaRepository recursosEmpresaRepository) {
		this.recursosEmpresaRepository = recursosEmpresaRepository;
	}
	
	public RecursosEmpresa create(RecursosEmpresa re) {
		re.setDataDeCadastro(LocalDateTime.now());

		recursosEmpresaRepository.save(re);
		
		return re;
	}
	
	public RecursosEmpresa update(String id, RecursosEmpresa re) {

		var existing = get(id);
		existing.setNome(re.getNome());
		existing.setCnpj(re.getCnpj());
		existing.setEmail(re.getEmail());

		recursosEmpresaRepository.save(existing);
		
		return existing;
	}
	
	public RecursosEmpresa get(String id) {
		
		var recursos = recursosEmpresaRepository.findById(id);
		
		if (recursos.isEmpty()) {
			throw new NotFoundException("User with ID " + id + " not found");
		} 
		
		return recursos.get();
	}
	
	public List<RecursosEmpresa> getAll() {
		return recursosEmpresaRepository.findAll();
	}
	
	public void delete(String id) {

		get(id);
		
		recursosEmpresaRepository.deleteById(id);
	}
	
}
