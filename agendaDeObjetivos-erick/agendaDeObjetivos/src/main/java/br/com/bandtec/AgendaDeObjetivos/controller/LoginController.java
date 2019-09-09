package br.com.bandtec.AgendaDeObjetivos.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {
	@PostMapping("/login")
	public ResponseEntity<String> validarLogin(@RequestBody Credenciais credenciais) {
		// TODO Auto-generated method stub
		if (credenciais.getSenha().equals(credenciais.getLogin())) {
			return ResponseEntity.ok("Sucessão");

		}
		return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Error");
	}

}
