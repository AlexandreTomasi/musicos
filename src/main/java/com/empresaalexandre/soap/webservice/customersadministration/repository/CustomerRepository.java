package com.empresaalexandre.soap.webservice.customersadministration.repository;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.data.domain.Sort;
import com.empresaalexandre.soap.webservice.customersadministration.model.Artista;


@RepositoryRestResource(collectionResourceRel = "artista", path = "artistas")
public interface CustomerRepository extends PagingAndSortingRepository<Artista, Integer> {

    /**
     * Método que retorna uma lista de artistas fazendo a busca pelo nome passado 
     como parâmetro e ordenando os artistas pelo nome.
     *  
     * @param name
     * @return lista de clientes
     */
    List<Artista> findByNomeOrderByNomeAsc(@Param("name") String name);
    
    List<Artista> findByNomeOrderByNomeDesc(@Param("name") String name);
    
    List<Artista> findById(@Param("id") int id);
    
    void deleteById(@Param("id") int id);
    
    //busca todos os artistas do banco
    List<Artista> findAll();
    
    List<Artista> findAll(Sort sort);
    void save(@Param("name") String name);
}