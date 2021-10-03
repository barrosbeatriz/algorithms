package com.api.fu.service;

import java.util.Collection;

import com.api.fu.dao.IUFRepositorio;
import com.api.fu.entity.UF;
import com.api.fu.util.StringUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UFServico {

	@Autowired
	private IUFRepositorio dao;

	public UF buscarPorId(Long id) {
		return dao.findById(id).get();
	}

	public Collection<UF> buscarTodos(String nome) {
		return dao.buscarUnidadesFederativas(StringUtil.removerAcentosUpperCase(nome));
	}
}
