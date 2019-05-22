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
	public List<Libro> findAll() {
		return libroDao.findAll();
	}

	@Override
	public String numeroAutors() {
		return libroDao.numeroAutors();
	}

	@Override
	public String numeroExistencias() {
		return libroDao.numeroExistencias();
	}
	
	@Override
	public List<Libro> findSearchByColumn(String column, String search) {
		return libroDao.findSearchByColumn(column, search);
	}

	@Override
	public List<Libro> findAllMore(Integer amount) {
		return libroDao.findAllMore(amount);
	}



}
