package com.leo.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.leo.demo.domain.Categoria;

@Repository
public interface CategoriaRepository extends JpaRepository<Categoria, Interger> {
	

}