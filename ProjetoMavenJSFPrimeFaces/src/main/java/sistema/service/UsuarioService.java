package sistema.service;

import java.util.List;

import sistema.modelos.Usuario;

import sistema.dao.UsuarioDAO;
public class UsuarioService {
	
	UsuarioDAO UsuarioDAO = new UsuarioDAO();
 	
	public void salvar(Usuario usuario)
	{
		UsuarioDAO.salvar(usuario);
		UsuarioDAO.closeEntityManager();	
		
	}
	
	public List <Usuario> getUsuarios()
	{
		List <Usuario> list = (List<Usuario>) UsuarioDAO.getAll();
		UsuarioDAO.closeEntityManager();
		return list;
	}

	public void alterar(Usuario usuario) {
		UsuarioDAO.salvar(usuario);
		UsuarioDAO.closeEntityManager();
	}

	
	public void remover(Usuario usuario) {
		
		usuario = UsuarioDAO.getById((long) usuario.getIdUsuario());
		UsuarioDAO.remover(usuario);
		UsuarioDAO.closeEntityManager();
	}

	
	
	
}
