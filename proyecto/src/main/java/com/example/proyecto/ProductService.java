
package com.example.proyecto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class ProductService {

	@Autowired
	ProductRepository repository;
	
	
	public Iterable<Product> findAll() {
		
		return repository.findAll();
	}
	
	public void insertProduct(Product product) {
		
		repository.save(product);
	}
	public Product findbyId(String id){
		return repository.findById(id).orElse(null);
	}
	
	public Iterable<Product> findbyCategory(String category){
		return repository.findbyCategory(category);
	}
	
	public Iterable<Product> findbyEmail (String email){
		System.out.println(email);
		return repository.findbyEmail(email);
	}
}