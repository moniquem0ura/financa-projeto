package com.project.service;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.entity.Financa;
import com.project.repository.FinancaRepository;


@Service
public class FinancaService {

	@Autowired
	 private FinancaRepository financaRepository;
	 
	 public List<Financa> getAll(){
		return financaRepository.findAll();
		 
	 }
	 
	 public Financa getById(Long id) {
		 
		 Optional<Financa> financa = financaRepository.findById(id);
		 if (financa.isPresent()) {
			 return financa.get();
		 }
		 return null;
	 }
	 
	 public Financa createOrUpdate(Long id, Financa financaRequest) {
		 Optional<Financa> financa = financaRepository.findById(id);
		 if(financa.isPresent()) {
			 financaRepository.save(financaRequest);
			 return financaRequest;
		 }
		 financaRepository.save(financaRequest);
		 return null;
	 }
	 
	 public boolean delete (Long id) {
		 Optional<Financa> financa = financaRepository.findById(id);
		 if(financa.isPresent()) {
			 financaRepository.delete(financa.get());
		 }
		 return true;
	 }
}
