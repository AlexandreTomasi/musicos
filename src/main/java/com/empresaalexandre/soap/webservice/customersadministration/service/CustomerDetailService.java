package com.empresaalexandre.soap.webservice.customersadministration.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;
import org.springframework.beans.factory.annotation.Autowired;

import com.empresaalexandre.soap.webservice.customersadministration.helper.Status;
import com.empresaalexandre.soap.webservice.customersadministration.model.Artista;
import com.empresaalexandre.soap.webservice.customersadministration.repository.CustomerRepository;

@Component
public class CustomerDetailService {
	
	@Autowired
	private CustomerRepository customerRepository;
	
	public List<Artista> findArtistaNome(String nome, String ordena){
		List<Artista> lista = null;
		if(ordena.equalsIgnoreCase("ASC")) {
			lista= customerRepository.findByNomeOrderByNomeAsc(nome);
		}else {
			lista= customerRepository.findByNomeOrderByNomeDesc(nome);
		}
		return lista;
	}
	
	public List<Artista> findArtistaTamanho(int tamanho, String ordena){
		List<Artista> lista = null;
		if(ordena.equalsIgnoreCase("ASC")) {
			lista= customerRepository.findAll();
		}else {
			lista = customerRepository.findAll();
		}
		if(lista != null) {
			List<Artista> resposta = new ArrayList<Artista>();
			for (Artista atual : lista) {
				if(atual.getNome().length() == tamanho) {
					resposta.add(atual);
				}
			}
			return resposta;
		}
		return null;
	}
}
