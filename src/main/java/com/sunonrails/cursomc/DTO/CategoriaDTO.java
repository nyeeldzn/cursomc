package com.sunonrails.cursomc.DTO;

import java.io.Serializable;
import javax.validation.constraints.NotEmpty;

import org.hibernate.validator.constraints.Length;

import com.sunonrails.cursomc.domain.Categoria;

public class CategoriaDTO implements Serializable{
	private static final long serialVersionUID = 1L;
	
	private Integer id;
	
	@NotEmpty(message="O nome não pode ser vazio")
	@Length(min=5, max=20, message="O tamanho deve ser entre 5 e 20 caracteres")
	private String nome;

	public CategoriaDTO() {
	}
	
	public CategoriaDTO (Categoria cat) {
		this.id = cat.getId();
		this.nome = cat.getNome();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	
	
}
