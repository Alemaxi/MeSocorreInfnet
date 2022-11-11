package br.edu.infnet.mesocorre.model.repository;

import org.springframework.stereotype.Repository;

import br.edu.infnet.mesocorre.model.domain.Clinica;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.repository.CrudRepository;

@Repository
@EntityScan("br.edu.infnet.mesocorre.model.domain")
public interface ClinicaRepository extends CrudRepository<Clinica,Integer> {
	
}
