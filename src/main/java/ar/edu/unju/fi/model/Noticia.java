package ar.edu.unju.fi.model;

import java.time.LocalDate;

import org.springframework.stereotype.Component;

/**
 * Clase para representar una noticia.
 * @author Benicio, Adriel Rehsiy
 *
 */
@Component
public class Noticia {
	/*
	 * Fecha de creacion de la noticia.
	 */
	private LocalDate fecha;
	/*
	 * Titulo de la noticia.
	 */
	private String titulo;
	/*
	 * Resumen de la noticia.
	 */
	private String resumen;
	
	//-------------CONSTRUCTORES-------------------
	/**
	 * constructor sin parametros.
	 */
	public Noticia() {
		super();///////////////////////******************//////////////////
	}
	/**
	 * Constructor sobre-cargado.
	 * @param fecha
	 * @param titulo
	 * @param resumen
	 */
	public Noticia(LocalDate fecha, String titulo, String resumen) {
		super();
		this.fecha = fecha;
		this.titulo = titulo;
		this.resumen = resumen;
	}
	
	//-------------------METODOS ACCESORES-----------------
	
	/**
	 * @return the fecha
	 */
	public LocalDate getFecha() {
		return fecha;
	}
	/**
	 * @param fecha the fecha to set
	 */
	public void setFecha(LocalDate fecha) {
		this.fecha = fecha;
	}
	/**
	 * @return the titulo
	 */
	public String getTitulo() {
		return titulo;
	}
	/**
	 * @param titulo the titulo to set
	 */
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	/**
	 * @return the resumen
	 */
	public String getResumen() {
		return resumen;
	}
	/**
	 * @param resumen the resumen to set
	 */
	public void setResumen(String resumen) {
		this.resumen = resumen;
	}
	
	
	
	
	
	

}
