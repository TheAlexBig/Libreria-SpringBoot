package com.biblioteca.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.biblioteca.dao.LibroDAO;
import com.biblioteca.domain.Libro;

@Service
public class LibroServiceImpl implements LibroService {
	@Autowired
	LibroDAO libroDao;

	@Override
	public List<Libro> findAllTitulo(String search) {
		return libroDao.findAllTitulo(search);
	}

	@Override
	public List<Libro> findAllAutor(String search) {
		return libroDao.findAllAutor(search);
	}

	@Override
	public List<Libro> findAllISBN(String search) {
		return libroDao.findAllISBN(search);
	}

	@Override
	public List<Libro> findAllGenero(String search) {
		return libroDao.findAllGenero(search);
	}

	@Override
	public List<Libro> findAllMore(Integer amount) {
		return libroDao.findAllMore(amount);
	}

	@Override
	public List<Libro> findAll() {
		return libroDao.findAll();
	}

	@Override
	public String numberAutors() {
		return libroDao.numberAutors();
	}

}
