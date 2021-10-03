package com.api.fu.service;

import com.api.fu.dao.IMunicipioRepositorio;
import com.api.fu.entity.Municipio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MunicipioServico {

	@Autowired
	private IMunicipioRepositorio municipioDao;

	public boolean naoExistePorId(Long id) {
		return !municipioDao.existsById(id);
	}

	public void salvar(Municipio municipio) {
		municipioDao.save(municipio);
	}

}