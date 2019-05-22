package com.biblioteca.controller;

import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.biblioteca.domain.Libro;
import com.biblioteca.service.LibroService;

@Controller
public class LibroController {

	@Autowired
	public LibroService libroService;

	@RequestMapping("/buscarTexto")
	public ModelAndView buscarTexto(@RequestParam(name = "search") String s,
			@RequestParam(name = "selected") int select) {
		ModelAndView mav = new ModelAndView();
		StringBuffer sb = new StringBuffer();
		String x;
		sb.append("Busqueda por ");
		List<Libro> libros;
		switch (select) {
		case 0:
			libros = libroService.findAllTitulo(s);
			x="titulo";
			break;
		case 1:
			libros = libroService.findAllAutor(s);
			x="autor";
			break;
		case 2:
			libros = libroService.findAllISBN(s);
			x="ISBN";
			break;
		case 3:
			libros = libroService.findAllGenero(s);
			x="genero";
			break;
		default:
			libros = libroService.findAll();
			x="todo";
			break;
		}
		sb.append(x);
		mav.addObject("libros", libros);
		mav.addObject("criterio", x);
		mav.addObject("nLibros", libros.size());
		mav.addObject("buscado", s);
		mav.setViewName("buscar");
		return mav;
	}
	
	@RequestMapping("/buscarExistencia")
	public ModelAndView buscarExistencia(@RequestParam(name="amount") Integer a) {
		ModelAndView mav = new ModelAndView();
		StringBuffer sb = new StringBuffer();
		sb.append("Busqueda por existencias");
		List<Libro> libros = libroService.findAllMore(a);
		mav.addObject("libros", libros);
		mav.addObject("busqueda", sb.toString());
		mav.setViewName("buscar");
		return mav;
	}
	
	@RequestMapping("/buscarTodos")
	public ModelAndView buscarTodos() {
		Integer nLibros=0;
		String nAutores;
		ModelAndView mav = new ModelAndView();

		List<Libro> libros = libroService.findAll();
		nLibros = libros.size();
		System.out.println(libroService.numberAutors());
		nAutores = libroService.numberAutors();
		mav.addObject("libros", libros);
		mav.addObject("nLibros", nLibros);
		mav.addObject("nAutores", nAutores);
		mav.setViewName("todos");
		return mav;
	}
}
