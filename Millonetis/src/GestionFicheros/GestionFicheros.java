package GestionFicheros;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

import Logica.Usuario;

//import logicaUsuario;

public class GestionFicheros{
	
	//Metodo para introducir un usuario nuevo en el fichero de registro de usuarios
	public static void insertarUsuario(Usuario u){
		try {
			ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("USUARIOS!.DAT"));
			oos.writeObject(u);
			oos.writeObject(null);
			oos.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	//Metodo que avisa si ya se encuentra registrado el usuario nuevo a introducir
	public static Usuario existeUsuario(String nom, String con){
		boolean enc=false;
		Usuario aux=null;
		try {
			ObjectInputStream ois = new ObjectInputStream(new FileInputStream("USUARIOS!.DAT"));
			aux = (Usuario)ois.readObject();
			while(!enc && aux!=null)
			{
				if(nom.equalsIgnoreCase(aux.getNom()) && con.equals(aux.getContraseña()))
					enc=true;
				else
					aux=(Usuario)ois.readObject();
			}
			ois.close();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		if(enc)
			return aux;
		else
			return null;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
