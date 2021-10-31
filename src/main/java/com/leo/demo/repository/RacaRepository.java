package com.leo.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.leo.demo.domain.Raca;

@Repository
public interface RacaRepository extends JpaRepository<Raca, Integer>{

}