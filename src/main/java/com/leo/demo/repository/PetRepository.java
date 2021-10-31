package com.leo.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.leo.demo.domain.Pet;

@Repository
public interface PetRepository extends JpaRepository<Pet, Integer>{

}