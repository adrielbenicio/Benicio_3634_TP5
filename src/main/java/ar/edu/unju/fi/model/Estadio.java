package ar.edu.unju.fi.model;

import java.time.LocalDate;

import org.springframework.stereotype.Component;

/**
 * Clase para representar un estadio.
 * @author Benicio,Adriel Rehsiy.
 *
 */
@Component
public class Estadio {
	//---------------ATRIBUTOS----------------
	/*
	 * Nombre del Estadio
	 */
	private String nombre;
	/*
	 * Fecha de fundación el Estadio
	 */
	private LocalDate fechaFundacion;
	/*
	 * Ciudad donde se localiza el estadio.
	 */
	private String ciudad;
	/*
	 * Capacidad del estadio(cantidad de expectadores).
	 */
	private int capacidad;
	/*
	 * Direccion del Estadio.
	 */
	private String direccion;
	
	//---------------CONSTRUCTORES-----------
	/**
	 * Constructore sobre-cargado.
	 * @param nombre
	 * @param fechaFundacion
	 * @param ciudad
	 * @param capacidad
	 * @param direccion
	 */
	
	public Estadio(String nombre, LocalDate fechaFundacion, String ciudad, int capacidad, String direccion) {
		
		this.nombre = nombre;
		this.fechaFundacion = fechaFundacion;
		this.ciudad = ciudad;
		this.capacidad = capacidad;
		this.direccion = direccion;
	}
	/**
	 * Constructor sin parametros.
	 */
	public Estadio() {
		
	}
	
	//-----------------METODOS ACCESORES-----------------

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
	 * @return the fechaFundacion
	 */
	public LocalDate getFechaFundacion() {
		return fechaFundacion;
	}

	/**
	 * @param fechaFundacion the fechaFundacion to set
	 */
	public void setFechaFundacion(LocalDate fechaFundacion) {
		this.fechaFundacion = fechaFundacion;
	}

	/**
	 * @return the ciudad
	 */
	public String getCiudad() {
		return ciudad;
	}

	/**
	 * @param ciudad the ciudad to set
	 */
	public void setCiudad(String ciudad) {
		this.ciudad = ciudad;
	}

	/**
	 * @return the capacidad
	 */
	public int getCapacidad() {
		return capacidad;
	}

	/**
	 * @param capacidad the capacidad to set
	 */
	public void setCapacidad(int capacidad) {
		this.capacidad = capacidad;
	}

	/**
	 * @return the direccion
	 */
	public String getDireccion() {
		return direccion;
	}

	/**
	 * @param direccion the direccion to set
	 */
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
	
	



}
