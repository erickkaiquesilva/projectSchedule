package br.com.bandtec.AgendaDeObjetivos.controller;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface TodosUsuarios extends JpaRepository<UsuarioRequest, Long>{
	
	@Query("select o from UsuarioRequest o where o.credenciais = :credenciais")
	public UsuarioRequest existe(@Param("credenciais") Credenciais credenciais );
	
	@Query("select u from UsuarioRequest u where u.nome = :nome")
	public List<Usuario> porNome(@Param("nome") String nome);
	
}
