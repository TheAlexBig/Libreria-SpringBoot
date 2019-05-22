package com.biblioteca.service;

import java.util.List;

import com.biblioteca.domain.Libro;

public interface LibroService {

	public List<Libro> findSearchByColumn(String column, String search);

	public List<Libro> findAll();

	public List<Libro> findAllMore(Integer amount);
	
	public String numeroAutors();
	
	public String numeroExistencias();
}
