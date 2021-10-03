package com.api.fu.controller;


import com.api.fu.entity.UF;
import com.api.fu.service.UFServico;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;

@RestController
@RequestMapping("/ufs")
public class UFRecurso {

	@Autowired
	private UFServico uFServico;
	
	/**
	 * Retorna os todas as unidades federativas.
	 **/
	@GetMapping(path = "", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public ResponseEntity<Collection<UF>> listarTodos(@RequestParam(defaultValue = "") String nome) {
		return ResponseEntity.ok().body(uFServico.buscarTodos(nome));
	}
	
	/**
	 * Retorna as unidades federativas da requisição passada como parâmetro.
	 **/
	@GetMapping(path = "/id/{id}", produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
	public ResponseEntity<UF> listarPorId(@PathVariable Long id) {
		return ResponseEntity.ok().body(uFServico.buscarPorId(id));
	}
}
