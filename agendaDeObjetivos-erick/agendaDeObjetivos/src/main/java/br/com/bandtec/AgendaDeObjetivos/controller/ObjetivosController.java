package br.com.bandtec.AgendaDeObjetivos.controller;

import java.util.List;
import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ObjetivosController {
	
	TodosObjetivos todosObjetivo;
	
	@Autowired
	public ObjetivosController(TodosObjetivos to) {
		this.todosObjetivo = to;
	}
	
	@PostMapping("/objetivos")
	public ResponseEntity<String> cadastrarObjetivo(@RequestBody Objetivo objetivo) {
		this.todosObjetivo.save(objetivo);
		return ResponseEntity.ok("success");
	}
	
	@GetMapping("/objetivo/data/{data}")
	public ResponseEntity<List<Objetivo>> listaPorData(@PathVariable("data") String dataString) {
		LocalDate data = LocalDate.parse(dataString);
		List<Objetivo> objetivos = todosObjetivo.ate(data);
		
		if(objetivos.isEmpty()) {
			return ResponseEntity.noContent().build();
		}
		return ResponseEntity.ok(objetivos);
	}
}
