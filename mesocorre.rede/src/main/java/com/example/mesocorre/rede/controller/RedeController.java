package com.example.mesocorre.rede.controller;

import java.util.List;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.mesocorre.rede.model.domain.Rede;
import com.example.mesocorre.rede.model.service.RedeService;


@RestController
@RequestMapping("/api/rede")
public class RedeController {
	
	@Autowired
	private RedeService redeService;
	
	@GetMapping(value = "/")
	public List<Rede> telaLista() {

		return redeService.GetCollection();
	}
	
	@GetMapping(value = "/{id}")
	public Rede searchForId(@PathVariable Integer id) {

		return redeService.findById(id);
	}
	
	@PostMapping(value = "/")
	public void incluirPost(@RequestBody Rede rede) {
		redeService.Add(rede);
	}

	@DeleteMapping(value = "/{id}")
	public void Excluir(@PathVariable Integer id) {
		redeService.ExcluirUm(id);
	}

}
