package com.biblioteca.dao;

import java.util.List;

import org.springframework.dao.DataAccessException;

import com.biblioteca.domain.Libro;

public interface LibroDAO {
	
	public List<Libro> findAllTitulo(String search) throws DataAccessException;
	
	public List<Libro> findAllAutor(String search) throws DataAccessException;
	
	public List<Libro> findAllISBN(String search) throws DataAccessException;

	public List<Libro> findAllGenero(String search) throws DataAccessException;
	
	public List<Libro> findAllMore(Integer amount) throws DataAccessException;
	
	public List<Libro> findAll() throws DataAccessException;

	public String numberAutors() throws DataAccessException;
}
