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
		Empleado empleadonetflix = new Empleado();
		Empleado empleadoamazon = new Empleado();
		Empleado empleadohp = new Empleado();
		Empleado empleadoApple = new Empleado();
		Empleado empleadoOracle = new Empleado();
		Empleado empleadoDocker = new Empleado();
		Empleado empleadoDisney = new Empleado();
		
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
		
		empleadoamazon.setNombre("Raul");
		empleadoamazon.setPrimerApellido("paniagua");
		empleadoamazon.setSegundoApellido("López");
		empleadoamazon.setPuesto("developer-javaScript");
		empleadoamazon.setEstatus(true);
		
		empleadohp.setNombre("Rair");
		empleadohp.setPrimerApellido("Gomez");
		empleadohp.setSegundoApellido("Pérez");
		empleadohp.setPuesto("developer-python-jr");
		empleadohp.setEstatus(true);
		
		empleadonetflix.setNombre("Marcos");
		empleadonetflix.setPrimerApellido("paniagua");
		empleadonetflix.setSegundoApellido("Ruiz");
		empleadonetflix.setPuesto("developer-C#-Sr");
		empleadonetflix.setEstatus(true);
		
		empleadoOracle.setNombre("Elver");
		empleadoOracle.setPrimerApellido("paniagua");
		empleadoOracle.setSegundoApellido("Lóopez");
		empleadoOracle.setPuesto("developer-Ruzt");
		empleadoOracle.setEstatus(true);
		
		empleadoDocker.setNombre("Whicho");
		empleadoDocker.setPrimerApellido("Gomez");
		empleadoDocker.setSegundoApellido("Pérez");
		empleadoDocker.setPuesto("developer-Architect");
		empleadoDocker.setEstatus(true);
		
		empleadoDisney.setNombre("Alan");
		empleadoDisney.setPrimerApellido("paniagua");
		empleadoDisney.setSegundoApellido("Ruiz");
		empleadoDisney.setPuesto("General");
		empleadoDisney.setEstatus(true);
		
		empleados.add(empleadoApple);
		empleados.add(empleadoIBM);
		empleados.add(empleadoMicrosoft);
		empleados.add(empleadonetflix);
		empleados.add(empleadoamazon);
		empleados.add(empleadohp);
		empleados.add(empleadoOracle);
		empleados.add(empleadoDocker);
		empleados.add(empleadoDisney);
		
		return empleados;
		
	}
}
