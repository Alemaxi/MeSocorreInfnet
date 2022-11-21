package com.example.mesocorre.rede.model.repository;

import org.springframework.stereotype.Repository;

import com.example.mesocorre.rede.model.domain.Rede;

import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.repository.CrudRepository;

@Repository
@EntityScan("br.edu.infnet.mesocorre.model.domain")
public interface RedeRepository extends CrudRepository<Rede,Integer> {
}
