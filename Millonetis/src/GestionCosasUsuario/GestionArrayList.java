package GestionCosasUsuario;

import java.util.ArrayList;

import Logica.Usuario;

//import logicaUsuario;

public class GestionArrayList{

	public static Usuario obtenerUsuario(ArrayList<Usuario> aUsuarios,String dni){
		boolean enc=false;
		int pos=0;
		Usuario u=null;
		
		while(!enc && pos<aUsuarios.size()){
		
			u = aUsuarios.get(pos);
			if(u.getDni().equals(dni))
				enc=true;
			else pos++;
		}
		
		if(enc)
			return u;
		else return null;
	}
	
	//Metodo para buscar posicion de los Usuarios en la ArrayList
	public static int buscarPosicionUsuarioEnLista(ArrayList<Usuario> a, String nom, String con){
		boolean enc=false;
		int pos=0,resul=-2;
		while(!enc && pos<a.size()){
			
			Usuario u = a.get(pos);
			if(u.getNom().equalsIgnoreCase(nom) && u.getContraseña().equals(con)){	
				enc=true;
				resul=pos;
			}
			else if(u.getNom().equalsIgnoreCase(nom) && !u.getContraseña().equals(con)){	
				resul=-1;
				enc=true;
			}
			else
				pos++;
		}
		if(enc)
			return resul;
		else
			return -2;
	}
}
