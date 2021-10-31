package com.leo.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.leo.demo.domain.Estado;

@Repository
public interface EstadoRepository extends JpaRepository<Estado, Integer>{

}