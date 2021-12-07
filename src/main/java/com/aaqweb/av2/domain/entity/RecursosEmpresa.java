package com.aaqweb.av2.domain.entity;

import java.time.LocalDateTime;

import org.springframework.data.annotation.Id;

import com.aaqweb.av2.api.RecursosEmpresaDto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.With;

@Data
@With
@AllArgsConstructor
@NoArgsConstructor
public class RecursosEmpresa {

	@Id
	private String id;
	
	private String nome;
	
	private String cnpj; 
	
	private String email;
	
	private LocalDateTime dataDeCadastro;
	
	public RecursosEmpresa(RecursosEmpresaDto RecursoEmpresaDto) {
		this.id = RecursoEmpresaDto.getId();
		this.nome = RecursoEmpresaDto.getNome();
		this.cnpj = RecursoEmpresaDto.getCnpj();
		this.email = RecursoEmpresaDto.getEmail();
		this.dataDeCadastro = RecursoEmpresaDto.getDataDeCadastro();
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public LocalDateTime getDataDeCadastro() {
		return dataDeCadastro;
	}

	public void setDataDeCadastro(LocalDateTime dataDeCadastro) {
		this.dataDeCadastro = dataDeCadastro;
	}
	
	
}
