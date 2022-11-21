package com.example.mesocorre.plano.model.repository;

import org.springframework.stereotype.Repository;

import com.example.mesocorre.plano.model.domain.Plano;

import java.util.List;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.repository.CrudRepository;

@Repository
@EntityScan("br.edu.infnet.mesocorre.model.domain")
public interface PlanoRepository extends CrudRepository<Plano,Integer> {
	List<Plano> findByIdUsuario(Integer idUsuario);
}
