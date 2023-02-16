/**
 * 
 */
package com.eduardoProductos.projectjsf.controllers;

import java.io.IOException;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;

/**
 * @author leviatan
 *clase que se encarga de cerrar la sesion del usuario 
 */

@ManagedBean
public class SessionClosedController {
	
	@PostConstruct
	public void init() {
		System.out.println("Cerrar sesión...");
	}
	
	
	/*
	 * Metodo que nos permite cerrar la session del usuario y regresar ala pantalla de loguin
	 */
	public void cerrarSession() {
		ExternalContext externalContext = FacesContext.getCurrentInstance().getExternalContext();
		externalContext.invalidateSession();
		
		try{
			this.redireccionar("login.xhtml");
		}catch(IOException e){
			e.printStackTrace();
		}
		
	}
	
	/*
	 * Metodo que nos permite redireccionar a una pantalla 
	 * @param pagina {@link string} pagina a redireccionarse.
	 * @throws IOExeption Exception en caso de error al encontrar la pagina
	 */
	private void redireccionar(String pagina) throws IOException {
		ExternalContext ec = FacesContext.getCurrentInstance().getExternalContext();
		ec.redirect(pagina);
	}
	
	

	
}
