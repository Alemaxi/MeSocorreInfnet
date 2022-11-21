package com.example.mesocorre.unidadesaude.model.repository;

import org.springframework.stereotype.Repository;

import com.example.mesocorre.unidadesaude.model.domain.Clinica;
import com.example.mesocorre.unidadesaude.model.domain.Laboratorio;

import java.util.List;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.repository.CrudRepository;

@Repository
@EntityScan("br.edu.infnet.mesocorre.model.domain")
public interface LaboratorioRepository extends CrudRepository<Laboratorio,Integer> {
	List<Laboratorio> findByIdPlano(Integer id);
}
