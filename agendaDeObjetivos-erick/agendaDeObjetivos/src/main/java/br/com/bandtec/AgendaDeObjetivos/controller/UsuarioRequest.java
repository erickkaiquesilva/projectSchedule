package br.com.bandtec.AgendaDeObjetivos.controller;

import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name="Usuario")
public class UsuarioRequest {
	
	@Id
	@GeneratedValue
	private Long id;
	
	@Embedded
	private Credenciais credenciais;
	private String nome;
	private Integer idade;
	
	public UsuarioRequest() {}
	
	public UsuarioRequest(String nome, Integer idade) {
		super();
		this.nome = nome;
		this.idade = idade;
	}

	public String getNome() {
		return nome;
	}

	public Integer getIdade() {
		return idade;
	}
}
