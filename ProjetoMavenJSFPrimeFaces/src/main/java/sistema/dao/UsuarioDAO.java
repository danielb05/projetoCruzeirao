package sistema.dao;
import java.util.HashMap;
import java.util.Map;

import sistema.dao.generic.GenericDAO;
import sistema.dao.generic.GenericoDAO;
import sistema.modelos.Usuario;

public class UsuarioDAO extends GenericoDAO<Usuario> {

	protected Class<Usuario> getClasseEntidade() {
		// TODO Auto-generated method stub
		return Usuario.class;
	}
	
	public Usuario pesquisarPorEmail(String email) {
		Map<String, Object> parametros = new HashMap<String, Object>();
		parametros.put("email", email);

		return super.pesquisarUm(Usuario.PESQUISAR_POR_EMAIL, parametros);
}

}
