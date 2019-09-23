package br.com.bandtec.AgendaDeObjetivos.controller;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface TodosUsuarios extends JpaRepository<UsuarioRequest, Long>{
	
	@Query("select o from UsuarioRequest o where o.credenciais = :credenciais")
	public UsuarioRequest existe(@Param("credenciais") Credenciais credenciais );
	
}
