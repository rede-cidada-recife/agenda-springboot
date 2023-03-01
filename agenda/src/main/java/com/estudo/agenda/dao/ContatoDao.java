package com.estudo.agenda.dao;

import org.springframework.stereotype.Repository;
import com.estudo.agenda.entity.Contato;

@Repository
public class ContatoDao
{
	public void save(Contato contato) {
		System.out.println("Contato salvo no Dao: " + cliente.getNome());

	}
}
