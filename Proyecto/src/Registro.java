
import java.awt.HeadlessException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Andrea
 */
public class Registro {
    private ArrayList<Usuario> users;
    private ArrayList<Reporte> report;
    private ArrayList<Restaurante> restaurant;
    private double rating;
    private double promedioCola;
    
    

public Registro(){
    users = new ArrayList<Usuario>();
   report = new ArrayList<Reporte>();
   restaurant = new ArrayList<Restaurante>();
   
    
}

public List<Reporte> getReporte(){

return report;
}

public List<Restaurante> getRestaurante(){
    return restaurant;
}
/**
	*Busca un usuario dentro de los usuario registrados y devuelve un numero que ayudara mostrarle al usuario si esta registrado o no
	*@param correo Correo del usuario registrado
	*@param contrasena Contrasena del usuario registrado 
	*@return Un 1 si el usuario esta registrado y un 0 si el usuario no esta registrado
	*/	
	public int buscarUsuario(String username, String contrasena){
		Iterator<Usuario> iterator = users.iterator();
		int verificacion = 0;
		while (iterator.hasNext()){
			Usuario prueba = iterator.next();
			String name = prueba.getUsername();
			String contra = prueba.getContrasena();
			if ((name.equals(username)) && (contra.equals(contrasena))){
				verificacion = 1;
				return verificacion;			
			}
		}
		return verificacion;	
	}
        /**
	*Busca a un usuario dentro del registro para guardarlo en una variable para ser devuelta y se usada como la cuenta a la que se cobrara la orden
	*@param correo Correo del usuario registrado
	*@param contrasena Contrasena del usuario registrado
	*@return El dato tipo usuario al que se le cobrara la orden
	*/	
	public Usuario buscarUsuario2(String username, String contrasena){ 
		Iterator <Usuario> iterator = users.iterator();
		Usuario prueba = new Usuario();
		while (iterator.hasNext()){
			prueba = iterator.next();
			String name = prueba.getUsername();
			String contra = prueba.getContrasena();
			if ((name.equals(username)) && (contra.equals(contrasena))){
				return prueba;
			}else{
				System.out.print("");
			}
		}
		return prueba;
	}
        
	

}
