package com.uptecsi.cursomc.sevices;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uptecsi.cursomc.domain.Cliente;
import com.uptecsi.cursomc.repositories.ClienteRepository;
import com.uptecsi.cursomc.sevices.exceptions.ObjectNotFoundException;

@Service
public class ClienteService {
	
	@Autowired
	ClienteRepository repo;

	public Cliente find(Integer id) {
		Optional<Cliente> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado! Id: " + id +", Tipo: " + Cliente.class.getName()));
	}
}
