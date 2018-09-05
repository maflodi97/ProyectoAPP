/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Andrea
 */

public class Usuario {
//atributos
	private String nombre;
	private String apellido;
	private String usuario;
	private String contrasena;

	//Constructor
	public Usuario(){
		nombre = "";
		apellido = "";
		usuario = "";
		contrasena = "";

	}
	//metodos
	/**
	*Ingresa los datos de un nuevo usuario
	*@param name Nombre del usuario
	*@param ape apellido del usuario
	*@param userame  usuario
	*@param contra Contrasena del usuario
	*/	
	public void setUsuario(String name, String username, String ape, String contra){
		nombre = name;
		usuario = username;
		apellido = ape;
		contrasena = contra;
	}
	/**
	*Devuelve el nombre del usuario
	*@return Nombre del usuario
	*/	
	public String getNombre(){
		return nombre;
	}
	/**
	*Devuelve la contrasena del usuario
	*@return Contrasena del usuario
	*/	
	public String getContrasena(){
		return contrasena;
	}
	/**
	*Devuelve el carnet del usuario
	*@return Carnet del usuario
	*/	
	public String getApe(){
		return apellido;
	}
	/**
	*Devuelve el correo del usuario
	*@return Correo del usuario
	*/	
	public String getUsername(){
            
		return usuario ;
	}
}
    
