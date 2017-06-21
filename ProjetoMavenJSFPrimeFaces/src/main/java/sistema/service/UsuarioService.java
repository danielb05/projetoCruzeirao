package sistema.service;

import java.util.List;

import sistema.modelos.Usuario;

import sistema.dao.UsuarioDAO;
public class UsuarioService {
	
	UsuarioDAO UsuarioDAO = new UsuarioDAO();
 	
	public Usuario salvar(Usuario usuario)
	{
		usuario=UsuarioDAO.save(usuario);
		UsuarioDAO.closeEntityManager();	
		return usuario;
	}
	
	
	
	public List <Usuario> getUsuarios()
	{
		//List <Usuario> list = (List<Usuario>) UsuarioDAO.getAll();
		//UsuarioDAO.closeEntityManager();
		return UsuarioDAO.GetUsers();
	}

	public Usuario alterar(Usuario usuario) {
		//usuario=UsuarioDAO.save(usuario);
		usuario = UsuarioDAO.update(usuario);
		UsuarioDAO.closeEntityManager();
		return usuario;
	}

	
	public void remover(Usuario usuario) {
		
		usuario = UsuarioDAO.getById((long) usuario.getIdUsuario());
		UsuarioDAO.remove(usuario);
		UsuarioDAO.closeEntityManager();
	}

	
	
	
}
