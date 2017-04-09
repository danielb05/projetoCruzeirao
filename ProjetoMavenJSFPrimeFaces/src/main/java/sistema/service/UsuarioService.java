package sistema.service;

import java.util.ArrayList;

import sistema.modelos.Usuario;


public class UsuarioService {
	

	private ArrayList<Usuario> usuarios = new ArrayList<Usuario>();
	
	public void salvar(Usuario usuario){
		usuarios.add(usuario);
	}
	
	public ArrayList<Usuario> getUsuarios() {
		return usuarios;
	}

	
	
	
}
