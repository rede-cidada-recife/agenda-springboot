package com.estudo.agenda.entity;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.estudo.agenda.dao.ContatoDao;
import com.estudo.agenda.entity.Contato;

@Service
public class ContatoService {

	@Autowired
	ContatoDao contatoDAO;
	@Autowired
	Contato contato;

	public void save() {
		contato.setNome("Claudiany");
		System.out.println("O Contato foi manipulado no Service");
		contatoDAO.save(contato);
 	}
}

