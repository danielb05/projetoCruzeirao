package sistema.service;

import java.util.ArrayList;
import java.util.List;

import sistema.modelos.Usuario;

import sistema.dao.UsuarioDAO;
public class UsuarioService {
	
	UsuarioDAO UsuarioDAO = new UsuarioDAO();
 	
	public void salvar(Usuario usuario)
	{
		usuario = UsuarioDAO.save(usuario);
		UsuarioDAO.closeEntityManager();
		
		
	}
	
	public List <Usuario> getUsuarios()
	{
		List <Usuario> list = UsuarioDAO.getAll(Usuario.class);
		UsuarioDAO.closeEntityManager();
		return list;
	}

	public void alterar(Usuario usuario) {
		UsuarioDAO.save(usuario);
		UsuarioDAO.closeEntityManager();
	}

	
	public void remover(Usuario usuario) {
		
		usuario = UsuarioDAO.getById(Usuario.class, usuario.getIdUsuario());
		UsuarioDAO.remove(usuario);
		UsuarioDAO.closeEntityManager();
	}

	
	
	
}
