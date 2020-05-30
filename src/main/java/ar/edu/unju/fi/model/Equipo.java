package ar.edu.unju.fi.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * Clase Equipo de Futbol, representa al objeto equipo.
 * @author Benicio,Adriel Rehsiy.
 *
 */
@Component
public class Equipo {
	/*
	 * Nombre del equipo
	 */
	private String nombre;
	/*
	 * Estadio donde esta el equipo.
	 */
	@Autowired
	private Estadio estadio;

	//-----------------CONSTRUCTORES----------------
	/**
	 * Constructor con parametros.
	 * @param nombre
	 * @param estadio
	 */
	public Equipo(String nombre, Estadio estadio) {
		this.nombre = nombre;
		this.estadio = estadio;
	}
	
	/**
	 * Constructor sin parametros.
	 */
	public Equipo() {
	 estadio = new Estadio();
	}
	
	//-------------METODOS ACCESORES--------------
	
	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * @return the estadio
	 */
	public Estadio getEstadio() {
		return estadio;
	}
	/**
	 * @param estadio the estadio to set
	 */
	public void setEstadio(Estadio estadio) {
		this.estadio = estadio;
	}
	
	
	

}
