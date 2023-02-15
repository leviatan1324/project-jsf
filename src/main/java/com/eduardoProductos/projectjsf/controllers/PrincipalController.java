/**
 * 
 */
package com.eduardoProductos.projectjsf.controllers;

import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import com.eduardoProductos.projectjsf.entity.Empleado;
import com.eduardoProductos.projectjsf.services.EmpleadoService;

/**
 * @author leviatan
 * Clase cotroller que se encarga de procesar informacion para la pantalla principal .xhtml
 */

@ManagedBean
@ViewScoped
public class PrincipalController {
	/*
	 * Lista de empleados para la tabla
	 */
	private List<Empleado> empleados;
	
	/*
	 * Servicio con los metodos que realiza la logica de negocio de empleados
	 */
	private EmpleadoService empleadoService = new EmpleadoService();
			
	/*
	* Método que se encarga de inicializar la infomacion de la pantalla principal
	*/
	@PostConstruct
	public void init() {
	this.ConsultarEmpleado();
	}
			
	/*
	 * Método que consulta la lista de empledos 
	 */
;	public void ConsultarEmpleado() {
		this.empleados = this.empleadoService.consultarEmpleados();
	}

	public List<Empleado> getEmpleados() {
		return empleados;
	}

	public void setEmpleados(List<Empleado> empleados) {
		this.empleados = empleados;
	}

}
