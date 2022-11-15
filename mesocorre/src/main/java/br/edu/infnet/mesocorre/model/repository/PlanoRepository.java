package br.edu.infnet.mesocorre.model.repository;

import org.springframework.stereotype.Repository;

import br.edu.infnet.mesocorre.model.domain.Clinica;
import br.edu.infnet.mesocorre.model.domain.Plano;
import br.edu.infnet.mesocorre.model.domain.Rede;
import br.edu.infnet.mesocorre.model.domain.Usuario;

import java.util.List;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.repository.CrudRepository;

@Repository
@EntityScan("br.edu.infnet.mesocorre.model.domain")
public interface PlanoRepository extends CrudRepository<Plano,Integer> {
	
	List<Plano> findByUsuarioId(Integer id);
}
