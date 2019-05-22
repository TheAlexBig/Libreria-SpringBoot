package com.biblioteca.dao;

import java.util.List;

import org.springframework.dao.DataAccessException;

import com.biblioteca.domain.Libro;

public interface LibroDAO {
	
	public List<Libro> findSearchByColumn(String column, String search) throws DataAccessException;
	
	public List<Libro> findAll() throws DataAccessException;

	public List<Libro> findAllMore(Integer amount) throws DataAccessException;
	
	public String numeroAutors() throws DataAccessException;
	
	public String numeroExistencias() throws DataAccessException;
	
}
