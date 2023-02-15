/**
 * 
 */
package com.eduardoProductos.projectjsf.entity;

/**
 * @author eduar
 *Clase que reprecenta entidades de empleados
 */
public class Empleado {
	
	/*
	 * Nombre del empleado
	 */
	private String nombre;
	/*
	 * primer apellido
	 */
	private String primerApellido;
	/*
	 * segundo apellido
	 */
	private String segundoApellido;
	/*
	 * puesto del empleado
	 */
	private String puesto;
	/*
	 * estatus del empleado
	 */
	private boolean estatus;
	
	
	
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getPrimerApellido() {
		return primerApellido;
	}
	public void setPrimerApellido(String primerApellido) {
		this.primerApellido = primerApellido;
	}
	public String getSegundoApellido() {
		return segundoApellido;
	}
	public void setSegundoApellido(String segundoApellido) {
		this.segundoApellido = segundoApellido;
	}
	public String getPuesto() {
		return puesto;
	}
	public void setPuesto(String puesto) {
		this.puesto = puesto;
	}
	public boolean isEstatus() {
		return estatus;
	}
	public void setEstatus(boolean estatus) {
		this.estatus = estatus;
	}
	
	
	
	

}
