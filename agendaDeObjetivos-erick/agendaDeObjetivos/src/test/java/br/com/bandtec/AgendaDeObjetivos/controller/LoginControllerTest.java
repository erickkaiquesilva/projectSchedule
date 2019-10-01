package br.com.bandtec.AgendaDeObjetivos.controller;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mockito;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;


public class LoginControllerTest {

	@Test
	public void loginSucesso() {
		Credenciais c = new Credenciais("igual", "igual");
		Mockito.when(todosUsuarios.existe(c)).thenReturn(new UsuarioRequest("nome", 27));
		LoginController controller = new LoginController(todosUsuarios);
		
		ResponseEntity<String> resposta = controller.validarLogin(c);

		assertEquals(HttpStatus.OK, resposta.getStatusCode());
		assertEquals("Sucesso", resposta.getBody());
	}

	@Test
	public void loginComFalha() {
		Credenciais c = new Credenciais("login", "senha");
		Mockito.when(todosUsuarios.existe(c)).thenReturn(null);
		LoginController controller = new LoginController(todosUsuarios);

		ResponseEntity<String> resposta = controller.validarLogin(c);

		assertEquals(HttpStatus.UNAUTHORIZED, resposta.getStatusCode());
		assertEquals("Erro", resposta.getBody());

	}
	
	
	private LoginController controller;
	private TodosUsuarios todosUsuarios;
	
	@Before
	public void setUP() {
		todosUsuarios = Mockito.mock(TodosUsuarios.class);
		controller = new LoginController(todosUsuarios);
	}

}
