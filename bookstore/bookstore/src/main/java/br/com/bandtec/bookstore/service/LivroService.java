package br.com.bandtec.bookstore.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import br.com.bandtec.bookstore.domain.Livro;

@Service
public class LivroService {
	
	private List<Livro> livros;
	
	public List<Livro> buscarPorTema(String tema) {
		List<Livro> resultados = new ArrayList<Livro>();
		for(Livro livro : todosOsLivros()) {
			if(livro.comTema(tema)) {
				resultados.add(livro);
			}
		}
		return resultados;
	}
	
	private List<Livro> todosOsLivros() {
		List<Livro> livros = new ArrayList<Livro>();
		livros.add(new Livro("A morte do JS", "religiao"));
		livros.add(new Livro("Palmeiras a espera de um mundial", "comedia"));
		livros.add(new Livro("Kotlin ou Java", "TI"));
		livros.add(new Livro("50 tons de azul", "comedia"));
		return livros;
	}
}
