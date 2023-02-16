/**
 * 
 */
package com.eduardoProductos.projectjsf.controllers;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import com.eduardoProductos.projectjsf.dto.UsuarioDTO;

/**
 * @author leviatan
 * Clase que se encarga de mantener la informacion de usuario que ingresa al aplicativo
 */

@ManagedBean
@SessionScoped  //para generar la sesion del usuario una sola vez cada que ingresa
public class SessionController {
	
	/*
	 * Usuario que se mantendra en sesion.
	 */
	private UsuarioDTO usuarioDTO;

	
	/*
	 * Inicializa la sesion del usuario.
	 */
	@PostConstruct
	public void init() {
		System.out.println("Cargando informacion del usuario en la sesiín ");
	}
	
	
	public UsuarioDTO getUsuarioDTO() {
		return usuarioDTO;
	}

	public void setUsuarioDTO(UsuarioDTO usuarioDTO) {
		this.usuarioDTO = usuarioDTO;
	}
	
	
}
