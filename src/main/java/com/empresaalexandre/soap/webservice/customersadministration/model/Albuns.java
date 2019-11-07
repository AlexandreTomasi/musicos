package com.empresaalexandre.soap.webservice.customersadministration.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Albuns {
	 @Id
	 @GeneratedValue(strategy=GenerationType.AUTO)    
	 private int id;
	 private String nomeAlbun;
	 
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNomeAlbun() {
		return nomeAlbun;
	}
	public void setNomeAlbun(String nomeAlbun) {
		this.nomeAlbun = nomeAlbun;
	}
}
