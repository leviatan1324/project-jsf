/**
 * 
 */
package com.eduardoProductos.projectjsf.services;

import java.util.ArrayList;
import java.util.List;

import com.eduardoProductos.projectjsf.entity.Empleado;

/**
 * @author leviatan
 * Clase que permite realizar la logica de negocios para empleados.
 */


public class EmpleadoService {
	
	/*
	 * Método que permite consultar la lista de empleados de empresas de TI.
	 * @return {@link Empledo} lista de empleados
	 */
	public List<Empleado> consultarEmpleados(){
		
		List<Empleado> empleados = new ArrayList<Empleado>();
		Empleado empleadoIBM = new Empleado();
		Empleado empleadoMicrosoft = new Empleado();
		Empleado empleadoApple = new Empleado();
		
		empleadoIBM.setNombre("diego");
		empleadoIBM.setPrimerApellido("paniagua");
		empleadoIBM.setSegundoApellido("Lóopez");
		empleadoIBM.setPuesto("developer-java");
		empleadoIBM.setEstatus(true);
		
		empleadoMicrosoft.setNombre("Eduardo");
		empleadoMicrosoft.setPrimerApellido("Gomez");
		empleadoMicrosoft.setSegundoApellido("Pérez");
		empleadoMicrosoft.setPuesto("developer-java-jr");
		empleadoMicrosoft.setEstatus(true);
		
		empleadoApple.setNombre("Gorge");
		empleadoApple.setPrimerApellido("paniagua");
		empleadoApple.setSegundoApellido("Ruiz");
		empleadoApple.setPuesto("developer-java-Sr");
		empleadoApple.setEstatus(true);
		
		empleados.add(empleadoApple);
		empleados.add(empleadoIBM);
		empleados.add(empleadoMicrosoft);
		
		return empleados;
		
	}
}
