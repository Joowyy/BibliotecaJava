package GestionArray;

import java.util.ArrayList;

import Usuario.Usuario;

public class GestionUsuario {
    
    private static ArrayList<Usuario> usuarios = new ArrayList<Usuario>();

	public static ArrayList<Usuario> getUsuarios() {
		return usuarios;
	}

	public void setUsuarios(ArrayList<Usuario> usuarios) {
		GestionUsuario.usuarios = usuarios;
	}



}
