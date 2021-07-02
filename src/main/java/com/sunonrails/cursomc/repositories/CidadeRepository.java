package com.sunonrails.cursomc.repositories;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.sunonrails.cursomc.domain.Cidade;
import com.sunonrails.cursomc.domain.Cliente;
import com.sunonrails.cursomc.services.exceptions.ObjectNotFoundException;

@Repository
public interface CidadeRepository extends JpaRepository<Cidade, Integer> {

	
	
}
