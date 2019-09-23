package br.com.bandtec.AgendaDeObjetivos.controller;

import java.time.LocalDate;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LoginController {
	
	private TodosUsuarios todosUsuarios;
	
	
	
	public LoginController(TodosUsuarios todosUsuarios) {
		super();
		this.todosUsuarios = todosUsuarios;
	}



	@PostMapping("/login")
	public ResponseEntity<String> validarLogin(@RequestBody Credenciais credenciais) {
		if (credenciais.getSenha().equals(credenciais.getLogin())) {
			return ResponseEntity.ok("Sucessão");

		}
		return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Error");
	}
}
