package br.com.bandtec.AgendaDeObjetivos.controller;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface TodosUsuarios {
	
	@Query("select o from UsuarioRequest o where o.login = :login AND	o.senha = :senha")
	public UsuarioRequest existe(@Param("login")String login, @Param("senha")String senha);
	
}
