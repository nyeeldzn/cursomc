package com.sunonrails.cursomc.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sunonrails.cursomc.domain.Categoria;
import com.sunonrails.cursomc.repositories.CategoriaRepository;
import com.sunonrails.cursomc.services.exceptions.ObjectNotFoundException;

@Service
public class CategoriaService {

	@Autowired
	private CategoriaRepository repo;
	
	public Categoria find(Integer id) {
		Optional<Categoria> obj = repo.findById(id);
		
		
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto não encontrado! ID: " + id  + ", Tipo: " + Categoria.class.getName()));
	
	}
	public Categoria insert(Categoria obj) {
		obj.setId(null);
		//method save insere se o id for nulo
		return repo.save(obj);
	}
	
	public Categoria update(Categoria obj) {
		//method save atualiza se o id nao for nulo
		find(obj.getId());
		return repo.save(obj);
	}
	
}
