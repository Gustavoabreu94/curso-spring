package com.educandoweb.cursospring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.educandoweb.cursospring.entities.Category;


public interface CategoryRepository extends JpaRepository<Category, Long> {
	
	
	
}
