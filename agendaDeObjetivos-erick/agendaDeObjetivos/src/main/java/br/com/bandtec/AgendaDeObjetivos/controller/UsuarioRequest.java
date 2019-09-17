package br.com.bandtec.AgendaDeObjetivos.controller;

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
	
	@JsonProperty
	private String login;
	
	@JsonProperty
	private String senha;
	
	public UsuarioRequest() {}
	
	public UsuarioRequest(String login, String senha) {
		super();
		this.login = login;
		this.senha = senha;
	}
}
