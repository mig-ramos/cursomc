package com.uptecsi.cursomc.sevices;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uptecsi.cursomc.domain.Categoria;
import com.uptecsi.cursomc.repositories.CategoriaRepository;
import com.uptecsi.cursomc.sevices.exceptions.ObjectNotFoundException;

@Service
public class CategoriaService {
	
	@Autowired
	CategoriaRepository repo;

	public Categoria find(Integer id) {
		Optional<Categoria> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado! Id: " + id +", Tipo: " + Categoria.class.getName()));
	}
}
