package com.biblioteca.service;

import java.util.List;

import org.springframework.dao.DataAccessException;

import com.biblioteca.domain.Libro;

public interface LibroService {
	
	public List<Libro> findAllTitulo(String search);
	
	public List<Libro> findAllAutor(String search);
	
	public List<Libro> findAllISBN(String search);

	public List<Libro> findAllGenero(String search);
	
	public List<Libro> findAllMore(Integer amount);

	public List<Libro> findAll();

	public String numberAutors();
}
