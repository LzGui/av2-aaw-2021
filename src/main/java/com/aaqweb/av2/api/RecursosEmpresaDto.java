package com.aaqweb.av2.api;

import java.time.LocalDateTime;

import org.springframework.data.annotation.Id;

import com.aaqweb.av2.domain.entity.RecursosEmpresa;

import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import lombok.ToString;

@AllArgsConstructor
@NoArgsConstructor
@ToString
public class RecursosEmpresaDto {
	
	@Id
	private String id;
	
	private String nome;
	
	private String cnpj; 
	
	private String email;
	
	private LocalDateTime dataDeCadastro;
	
	public RecursosEmpresaDto(RecursosEmpresa re) {
		this.id = re.getId();
		this.nome = re.getNome();
		this.cnpj = re.getCnpj();
		this.email = re.getEmail();
		this.dataDeCadastro = re.getDataDeCadastro();
		
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
