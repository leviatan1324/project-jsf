/**
 * 
 */
package com.eduardoProductos.projectjsf.controllers;

import java.io.IOException;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.context.ExternalContext;
import javax.faces.context.FacesContext;

import com.eduardoProductos.projectjsf.dto.UsuarioDTO;

/**
 * @author eduardoproductos
 * Clase que permite controlar el funcionamiento de la pantalla loion.xhtml
 *
 */

@ManagedBean
public class LoginController {
	
	
	/*
	 * Usuario que ingresa en el loguin.
	 */
	private String usuario;
	
	/*
	 * contraseña que ingresa en el loguin.
	 */
	private String password;
	
	
	/*
	 * Bean que mantiene la informacion en session
	 */
	@ManagedProperty("#{sessionController}") //para tener un controlador de JSF en otro controlador 
	private SessionController sessionController;
	
	public SessionController getSessionController() {
		return sessionController;
	}

	public void setSessionController(SessionController sessionController) {
		this.sessionController = sessionController;
	}


	/*
	 * Método que permite ingresar a la pantalla principal del proyecto
	 */
	public void ingresar() {
		System.out.println("Usuario: " + usuario);
		
		if (usuario.equals("eduardo" ) && password.equals("12345")) {
			
			try {
				UsuarioDTO usuarioDTO = new UsuarioDTO();
				usuarioDTO.setUsuario(this.usuario);
				usuarioDTO.setPassword(this.password);
				this.sessionController.setUsuarioDTO(usuarioDTO);
				this.redireccionar("principal.xhtml");
			} catch (IOException e) {
				FacesContext.getCurrentInstance().addMessage("formlogin:txtPassword",
						new FacesMessage(FacesMessage.SEVERITY_FATAL, "La pagina no existe" ,""));
				e.printStackTrace();
			}
			
		}else {
			FacesContext.getCurrentInstance().addMessage("formlogin:txtPassword",
					new FacesMessage(FacesMessage.SEVERITY_ERROR, "Usuario y/o contraleña incorrectos", ""));
		}
		
	}
	
	
	private void redireccionar(String pagina) throws IOException {
		ExternalContext ec = FacesContext.getCurrentInstance().getExternalContext();
		ec.redirect(pagina);
	}
	
	public String getUsuario() {
		return usuario;
	}
	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
	

}
