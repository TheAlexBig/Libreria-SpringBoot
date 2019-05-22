package com.biblioteca.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(schema = "public", name = "libro")
public class Libro {
	@Id
	@GeneratedValue(generator = "student_id_student_seq", strategy = GenerationType.AUTO)
	@SequenceGenerator(name = "student_id_student_seq", sequenceName = "public.student_id_student_seq", allocationSize = 1)
	@Column(name = "id_libro")
	private Integer idLibro;

	@Column(name = "l_titulo")
	private String lTitulo;

	@Column(name = "l_autor")
	private String lAutor;

	@Column(name = "l_cbarra")
	private String lISBN;

	@Column(name = "l_genero")
	private String lGenero;

	@Column(name = "l_cantidad")
	private Integer lCantidad;

	public Integer getIdLibro() {
		return idLibro;
	}

	public void setIdLibro(Integer idLibro) {
		this.idLibro = idLibro;
	}

	public String getlTitulo() {
		return lTitulo;
	}

	public void setlTitulo(String lTitulo) {
		this.lTitulo = lTitulo;
	}

	public String getlAutor() {
		return lAutor;
	}

	public void setlAutor(String lAutor) {
		this.lAutor = lAutor;
	}

	public String getlISBN() {
		return lISBN;
	}

	public void setlISBN(String lISBN) {
		this.lISBN = lISBN;
	}

	public String getlGenero() {
		return lGenero;
	}

	public void setlGenero(String lGenero) {
		this.lGenero = lGenero;
	}

	public Integer getlCantidad() {
		return lCantidad;
	}

	public void setlCantidad(Integer lCantidad) {
		this.lCantidad = lCantidad;
	}

}
