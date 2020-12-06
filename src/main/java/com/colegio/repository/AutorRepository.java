package com.colegio.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.colegio.entity.Autor;

public interface AutorRepository extends JpaRepository<Autor, Integer>{
	
	@Query("select a from Autor a where a.nombres like :var_fil")
	public List<Autor> listaPorNombre(@Param("var_fil") String filtro);
}
