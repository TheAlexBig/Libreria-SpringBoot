package com.biblioteca.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.dao.DataAccessException;
import org.springframework.stereotype.Repository;

import com.biblioteca.domain.Libro;

@Repository
public class LibroDAOImpl implements LibroDAO {
	@PersistenceContext(unitName = "biblioteca")
	private EntityManager entityManager;


	@Override
	public List<Libro> findAllTitulo(String search) throws DataAccessException {
		StringBuffer sb = new StringBuffer();
		sb.append("SELECT * FROM public.libro WHERE l_titulo LIKE CONCAT('%',?,'%')");

		Query query = entityManager.createNativeQuery(sb.toString(), Libro.class);
		query.setParameter(1, search);

		return query.getResultList();
	}

	@Override
	public List<Libro> findAllAutor(String search) throws DataAccessException {
		StringBuffer sb = new StringBuffer();
		sb.append("SELECT * FROM public.libro WHERE l_autor LIKE CONCAT('%',?,'%')");

		Query query = entityManager.createNativeQuery(sb.toString(), Libro.class);
		query.setParameter(1, search);

		return query.getResultList();
	}

	@Override
	public List<Libro> findAllISBN(String search) throws DataAccessException {
		StringBuffer sb = new StringBuffer();
		sb.append("SELECT * FROM public.libro WHERE l_cbarra LIKE CONCAT('%',?,'%')");

		Query query = entityManager.createNativeQuery(sb.toString(), Libro.class);
		query.setParameter(1, search);

		return query.getResultList();
	}

	@Override
	public List<Libro> findAllGenero(String search) throws DataAccessException {
		StringBuffer sb = new StringBuffer();
		sb.append("SELECT * FROM public.libro WHERE l_genero LIKE CONCAT('%',?,'%')");

		Query query = entityManager.createNativeQuery(sb.toString(), Libro.class);
		query.setParameter(1, search);

		return query.getResultList();
	}

	@Override
	public List<Libro> findAllMore(Integer amount) throws DataAccessException {
		StringBuffer sb = new StringBuffer();
		sb.append("SELECT * FROM public.libro WHERE l_cantidad >= ?");

		Query query = entityManager.createNativeQuery(sb.toString(), Libro.class);
		query.setParameter(1, amount);

		return query.getResultList();
	}

	@Override
	public List<Libro> findAll() throws DataAccessException {
		StringBuffer sb = new StringBuffer();
		sb.append("SELECT * FROM public.libro");

		Query query = entityManager.createNativeQuery(sb.toString(), Libro.class);
		return query.getResultList();
	}

	@Override
	public String numberAutors() throws DataAccessException {
		StringBuffer sb = new StringBuffer();
		sb.append("SELECT COUNT(DISTINCT(l_autor)) FROM public.libro");
		Query query = entityManager.createNativeQuery(sb.toString());
		String result = query.getSingleResult().toString();
		return result;
	}
	

}
