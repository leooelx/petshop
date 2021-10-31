package com.leo.demo.domain;

import java.io.Serializable;

import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

import java.util.ArrayList;
import java.util.List;

@Entity
public class Produto implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	private Integer id;
	private String nome;
	private Double preco;
	
	@ManyToMany
	@JoinTable(name = "PRODUTO_CATEGORIA",
			joinColumns = @JoinColumn(name = "id_produto"),
			inverseJoinColumns = @JoinColumn(name = "id_categoria"))
	private List<Categorias> categorias = new ArrayList<>();
	
	public Produto() {
		
	}

	public Produto(Integer id, String nome, Double preco) {
		super();
		this.id = id;
		this.nome = nome;
		this.preco = preco;
	}
	
	

	@Override
	public int hashCode() {
		return Objects.hash(id, nome, preco);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Produto other = (Produto) obj;
		return Objects.equals(id, other.id) && Objects.equals(nome, other.nome) && Objects.equals(preco, other.preco);
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}

	public List<Categorias> getCategorias() {
		return categorias;
	}

	public void setCategorias(List<Categorias> categorias) {
		this.categorias = categorias;
	}
	
	

}
