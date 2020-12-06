package com.colegio.service;

import java.util.List;

import com.colegio.entity.Autor;

public interface AutorService {
	
	public List<Autor> listaAutor();
	public List<Autor> listaAutorPorNombre(String filtro);
}

