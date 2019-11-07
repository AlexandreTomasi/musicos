package com.empresaalexandre.soap.webservice.customersadministration.model;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;

@Entity
public class Artista {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)    
    private int id;
    private String nome;
    
    public int getId() {
        return id;
	  }
	
	  public void setId(int id) {
	        this.id = id;
	  }
	
	  public String getNome() {
	        return nome;
	  }
	
	  public void setNome(String nome) {
	        this.nome = nome;
	  }
	  
	  @OneToMany(targetEntity=Albuns.class, fetch=FetchType.EAGER)
      @JoinColumn(name="artista_id")
      private List<Albuns> albuns;
	  
	  public List<Albuns> getAlbuns() {
          return albuns;
	  }

	  public void setAlbuns(List<Albuns> albuns) {
          this.albuns = albuns;
	  }
}
