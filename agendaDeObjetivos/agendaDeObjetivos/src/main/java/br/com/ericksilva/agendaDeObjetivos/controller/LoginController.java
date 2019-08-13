package br.com.ericksilva.agendaDeObjetivos.controller;

import org.springframework.http.ResponseEntity;

public class LoginController {

	public ResponseEntity<String> validarLogin(Credenciais credenciais) {
		// TODO Auto-generated method stub
		
		return ResponseEntity.ok("Sucesso");
	}

}
