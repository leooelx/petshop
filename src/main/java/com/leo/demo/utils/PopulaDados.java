package com.leo.demo.utils;

import java.util.Arrays;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.leo.demo.domain.Categorias;
import com.leo.demo.domain.Produto;
import com.leo.demo.repository.CategoriaRepository;
import com.leo.demo.repository.ProdutoRepository;

@Component
public class PopulaDados {
	
	@Autowired
	CategoriaRepository categoriaRepository;
	
	@Autowired
	ProdutoRepository produtoRepository;
	
	@PostConstruct
	public void cadastrar() {
		
		Categorias cat1 = new Categorias(null, "Alimento");
		Categorias cat2 = new Categorias(null, "Cosmético");
		Categorias cat3 = new Categorias(null, "Remédio");
		
		Produto p1 = new Produto(null, "Ração", 100.0);
		Produto p2 = new Produto(null, "Sache", 80.0);
		Produto p3 = new Produto(null, "Shampoo", 50.0);
		Produto p4 = new Produto(null, "Vermifugo", 20.0);
		
		cat1.getProdutos().addAll(Arrays.asList(p1, p2));
		cat2.getProdutos().addAll(Arrays.asList(p3, p4));
		cat3.getProdutos().addAll(Arrays.asList(p4));
		
		p1.getCategorias().addAll(Arrays.asList(cat1));
		p2.getCategorias().addAll(Arrays.asList(cat1));
		p3.getCategorias().addAll(Arrays.asList(cat2));
		p4.getCategorias().addAll(Arrays.asList(cat2,cat3));
		
		categoriaRepository.saveAll(Arrays.asList(cat1, cat2,cat3));
		produtoRepository.saveAll(Arrays.asList(p1,p2,p3,p4));
		
	}

}
