package com.uptecsi.cursomc.sevices;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uptecsi.cursomc.domain.Pedido;
import com.uptecsi.cursomc.repositories.PedidoRepository;
import com.uptecsi.cursomc.sevices.exceptions.ObjectNotFoundException;

@Service
public class PedidoService {
	
	@Autowired
	PedidoRepository repo;

	public Pedido find(Integer id) {
		Optional<Pedido> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException("Objeto não encontrado! Id: " + id +", Tipo: " + Pedido.class.getName()));
	}
}
