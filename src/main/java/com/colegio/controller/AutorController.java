package com.colegio.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.colegio.entity.Autor;
import com.colegio.service.AutorService;

@RestController
@RequestMapping("/api/colegio/autor")
public class AutorController {
	
	@Autowired
	private AutorService service;
	
	@GetMapping("/")
	public ResponseEntity<List<Autor>> lista(){
		return ResponseEntity.ok(service.listaAutor());
	}

	@GetMapping("/porNombre/{filtro}")
	public ResponseEntity<List<Autor>> listaPorNombre(@PathVariable("filtro") String fil){
		return ResponseEntity.ok(service.listaAutorPorNombre(fil + "%"));
	}
}
