package Logica;

import java.io.Serializable;

public class Usuario implements Serializable{
		
	/**
	 * Crea un nuevo usuario dados los siguientes par�metros 
	 * @nombre
	 * @dni
	 * @contrase�a
	 */
	
	private String dni;
	private String nom;
	private String apellido;
	private String contrase�a;
	public Usuario(String dni, String nom, String contrase�a) {
		super();
		this.dni = dni;
		this.nom = nom;
		this.apellido = apellido;
		this.contrase�a = contrase�a;
	}
	
	
	/*Getters y Setters*/
	
	/**
	 * Devuelve el DNI del usuario
	 * @return dni
	 */
	
	public String getDni() {
		return dni;
	}
	/**
	 * Cambia el DNI del usuario
	 * @param dni
	 */
	public void setDni(String dni) {
		this.dni = dni;
	}
	
	/**
	 * Devuelve el Nombre del usuario
	 * @param nom
	 */
	
	public String getNom() {
		return nom;
	}
	
	/**
	 * Cambia el Nombre del usuario
	 * @return nom
	 */
	
	public void setNom(String nom) {
		this.nom = nom;
	}	
	
	/**
	 * Devuelve la Contrase�a del usuario
	 * @return contraseina
	 */
	public String getContrase�a() {
		return contrase�a;
	}
	
	/**
	 * Cambia la Contrase�a del usuario
	 * @param contrasenia
	 */
	public void setContrase�a(String contrase�a) {
		this.contrase�a = contrase�a;
	}
	
	
}
