  

package com.example.proyecto;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;


public interface ProductRepository  extends CrudRepository<Product, String> {
	@Query("select u from Product u where u.category = ?1")
	public Iterable<Product> findbyCategory(String category);
	
	@Query("select u from Product u where u.email = ?1")
	public Iterable<Product> findbyEmail(String email);
	
	@Query("select u from Product u where u.id = ?1")
	public Product findbyIdint(int id);

}