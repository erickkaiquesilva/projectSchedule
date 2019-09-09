package br.com.bandtec.AgendaDeObjetivos.controller;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UsuariosIdadeController {

	private List<Usuario> usuarios;

	public UsuariosIdadeController() {
		this.usuarios = obterTodosUsuarios();
	}
	
	@GetMapping("/usuarios/idade/{idadeDoUsuario}")
	public ResponseEntity<List<Usuario>> obterPorIdade(@PathVariable("idadeDoUsuario") Integer Idade) {
		List<Usuario> usuariosPorIdade = new ArrayList<Usuario>();
		for (Usuario u : usuarios) {
			if (u.getIdade().equals(Idade)) {
				usuariosPorIdade.add(u);
			}
		}
		if (usuariosPorIdade.isEmpty()) {
			return ResponseEntity.noContent().build();
		}
		return ResponseEntity.ok(usuariosPorIdade);
	}

	private List<Usuario> obterTodosUsuarios() {
		return Arrays.asList(new Usuario("Matheus", 21), new Usuario("Lemes", 22), new Usuario("Matheus", 21));
	}
	
	
	
}
