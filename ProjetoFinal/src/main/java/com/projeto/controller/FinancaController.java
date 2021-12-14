package com.projeto.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.entity.Financa;
import com.project.service.FinancaService;

@RestController
@RequestMapping("financa")
public class FinancaController {
	
	@Autowired
	private FinancaService financaService;
	
	@GetMapping("/")
	public ResponseEntity<?> getAll(@PathVariable Long id){
		return new ResponseEntity<>(financaService.getAll(), HttpStatus.OK);
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<?> getById(@PathVariable Long id){
		return new ResponseEntity<>(financaService.getById(id), HttpStatus.OK);
	}
	
	@PostMapping()
	public ResponseEntity<?> create(@RequestBody Financa financa, BindingResult result){
		Financa transactionSaved = financaService.createOrUpdate(null, financa);
		return new ResponseEntity<Financa>(financa, HttpStatus.CREATED);
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<?> update(@PathVariable Long id, @RequestBody Financa financa, BindingResult result){
		financa.setId(id);
		Financa financaSaved = financaService.createOrUpdate(null, financa);
		return new ResponseEntity<Financa>(financaSaved, HttpStatus.OK);
	}
	

	@DeleteMapping("/{id}")
	public ResponseEntity<?> delete(@PathVariable Long id){
		financaService.delete(id);
		return new ResponseEntity(HttpStatus.OK);
	}

}
