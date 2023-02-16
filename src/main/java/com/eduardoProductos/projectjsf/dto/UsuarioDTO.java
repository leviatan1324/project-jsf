/**
 * 
 */
package com.eduardoProductos.projectjsf.dto;

/**
 * @author leviatan
 * Clase que permitira contener la informacion del usurio en sesion 
 */
public class UsuarioDTO {

	/*
	 * Nickname
	 */
	private String usuario;
	/*
	 * Contraseña.
	 */
	private String password;
	
	
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
