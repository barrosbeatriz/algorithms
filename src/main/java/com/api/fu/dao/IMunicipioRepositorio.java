package com.api.fu.dao;

import com.api.fu.entity.Municipio;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IMunicipioRepositorio extends JpaRepository<Municipio, Long> {

}
