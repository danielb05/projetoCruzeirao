package sistema.beans;

import java.util.List;

import sistema.modelos.Usuario;
import sistema.service.UsuarioService;




public class UsuarioManagedBean {
	
	private Usuario usuario = new Usuario();
	private UsuarioService service = new UsuarioService();
	
	public void salvar(){
		service.salvar(usuario);
		usuario = new Usuario();
	}
	
	public List<Usuario> getUsuarios(){
		
		return service.getUsuarios();
	}
	

}
