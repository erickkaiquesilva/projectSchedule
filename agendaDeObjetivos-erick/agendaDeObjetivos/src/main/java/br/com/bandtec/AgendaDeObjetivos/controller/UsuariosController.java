package br.com.bandtec.AgendaDeObjetivos.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsuariosController {
	
	private TodosUsuarios todosusuarios;

	public UsuariosController(TodosUsuarios tds) {
		this.todosusuarios = tds;
	}
	
	@GetMapping("/usuarios/nome/{nomeDoUsuario}")
	public ResponseEntity<List<Usuario>> obterPorNome(@PathVariable("nomeDoUsuario") String nome) {
		
		List<Usuario> usuarios = todosusuarios.porNome(nome);
		
		if(usuarios.isEmpty()) {
			return ResponseEntity.noContent().build();
		}
		
		return ResponseEntity.ok(usuarios);
	}

	private ArrayList<Usuario> obterTodosUsuarios() {
		ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
		usuarios.add(new Usuario("Ana",19));
		usuarios.add(new Usuario("Caio",28));
		usuarios.add(new Usuario("Lucas",23));
		usuarios.add(new Usuario("Victor",20));
		usuarios.add(new Usuario("Gustavo",20));
		usuarios.add(new Usuario("Erick",22));
		
		return usuarios;
	}
	
	@PostMapping("/usuarios")
	public ResponseEntity<UsuarioRequest> cadastraUsuario(
			@RequestBody UsuarioRequest usuario) {
		todosusuarios.save(usuario);
		return ResponseEntity.ok(usuario);
	}
}


