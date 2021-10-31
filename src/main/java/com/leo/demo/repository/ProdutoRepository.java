package com.leo.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.leo.demo.domain.Produto;


@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Integer> {

}
