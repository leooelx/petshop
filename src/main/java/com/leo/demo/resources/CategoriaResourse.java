package com.leo.demo.resources;

import java.util.List;

import org.spingframework.web.bind.annotation.RequestMapping;
import org.spingframework.web.bind.annotation.RequestMethod;
import org.spingframework.web.bind.annotation.RestController;

import com.leo.demo.Categoria;

@RestController
@RequestMapping(value = "/categorias")
public class CategoriaResourse {
	
	@RequestMapping(met = RequestMethod.GET)
	public List<Categoria> mostrar() {
		
		Categoria cat = new Categoria(1, "Alimento");
		Categoria cat = new Categoria(1, "Alimento");
		Categoria cat = new Categoria(1, "Alimento");
		
		List<Categoria> list = new ArrayList<>();
		
		lista.add(cat1);
		lista.add(cat2);
		lista.add(cat3);
		
		return lista;
	}

}
