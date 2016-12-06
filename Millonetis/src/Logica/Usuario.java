package Logica;

import java.io.Serializable;

public class Usuario implements Serializable{
		
	/**
	 * Crea un nuevo usuario dados los siguientes parámetros 
	 * @nombre
	 * @dni
	 * @contraseña
	 */
	
	private String dni;
	private String nom;
	private String apellido;
	private String contraseña;
	public Usuario(String dni, String nom, String contraseña) {
		super();
		this.dni = dni;
		this.nom = nom;
		this.apellido = apellido;
		this.contraseña = contraseña;
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
	 * Devuelve la Contraseña del usuario
	 * @return contraseina
	 */
	public String getContraseña() {
		return contraseña;
	}
	
	/**
	 * Cambia la Contraseña del usuario
	 * @param contrasenia
	 */
	public void setContraseña(String contraseña) {
		this.contraseña = contraseña;
	}
	
	
}
