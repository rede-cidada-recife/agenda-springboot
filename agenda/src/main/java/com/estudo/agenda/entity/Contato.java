package com.estudo.agenda.entity;

import org.springframework.stereotype.Component;

@Component
public class Contato {

	private String nome;

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}


}