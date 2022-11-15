package br.edu.infnet.mesocorre.model.repository;

import org.springframework.stereotype.Repository;

import br.edu.infnet.mesocorre.model.domain.Clinica;
import br.edu.infnet.mesocorre.model.domain.Usuario;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.repository.CrudRepository;

@Repository
@EntityScan("br.edu.infnet.mesocorre.model.domain")
public interface UsuarioRepository extends CrudRepository<Usuario,Integer> {
	
	Usuario findByEmail(String email);
}
