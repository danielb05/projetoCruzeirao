package sistema.beans;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import org.primefaces.event.RowEditEvent;

import sistema.modelos.Usuario;
import sistema.service.UsuarioService;

@ManagedBean
@ViewScoped
public class UsuarioManagedBean {
	private Usuario usuario = new Usuario();
	private UsuarioService service = new UsuarioService();
	private List<Usuario> usuarios = new ArrayList<Usuario>();
	public static Usuario usuarioAtual=new Usuario();

	// Editar
	public void onRowEdit(RowEditEvent event) {

		Usuario u = ((Usuario) event.getObject());
		service.alterar(u);
	}

	// Salvar
	public String salvar() {
		usuarioAtual = service.salvar(usuario);
		usuarioAtual = usuario;
		//if (usuarios != null)
			//usuarios.add(usuario);

		usuario = new Usuario();
		usuarios = service.getUsuarios();
		return "perfil.xhtml";

	}
	
	public String alterar(){
		service.alterar(usuarioAtual);
		return "perfil.xhtml";
	}

	// Retorna a lista para a tabela
	public List<Usuario> getUsuarios() {
		//if (usuarios == null)
			usuarios = service.getUsuarios();

		return usuarios;
	}
	
	// Remover
	public void remover(Usuario usuario) {
		service.remover(usuario);
		usuarios.remove(usuario);

	}

	// Getters & Setters
	public Usuario getUsuario() {
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public Usuario getUsuarioAtual() {
		return usuarioAtual;
	}

	public static void setUsuarioAtual(Usuario user) {
		usuarioAtual = user;
	}

}
