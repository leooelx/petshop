package com.leo.demo.resources;

import org.spingframework.web.bind.annotation.RequestMapping;
import org.spingframework.web.bind.annotation.RequestMethod;
import org.spingframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/categorias")
public class CategoriaResourse {
	
	@RequestMapping(met = RequestMethod.GET)
	public String mostrar() {
		return "Teste REST Categorias";
	}

}
