package com.doug.learning.model.repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.ListPagingAndSortingRepository;

import com.doug.learning.model.entities.Produto;

public interface ProdutoRepository extends CrudRepository<Produto, Integer>, ListPagingAndSortingRepository<Produto, Integer> {
	
	
	public Iterable<Produto> findByNameContainingIgnoreCase(String name);
}
