package sistema.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaQuery;

import sistema.dao.generic.GenericDAO;
import sistema.dao.generic.GenericoDAO;
import sistema.modelos.Usuario;

public class UsuarioDAO extends GenericDAO<Usuario, Integer> {

	protected Class<Usuario> getClasseEntidade() {
		return Usuario.class;
	}

	public Usuario pesquisarPorEmail(String email) {
		Map<String, Object> parametros = new HashMap<String, Object>();
		parametros.put("email", email);

		return super.pesquisarUm(Usuario.PESQUISAR_POR_EMAIL, parametros);
	}
	public Usuario getById(Long id) {
		return em.find(classeEntidade, id);
	}
	
	public List<Usuario> GetUsers(){
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("Cruzeirao1.0");
		EntityManager em = factory.createEntityManager();
		Query q = em.createQuery("from Usuario u", Usuario.class);
		return q.getResultList();
	}

	public List<?> getAll() {
		CriteriaQuery<Object> cq = em.getCriteriaBuilder().createQuery();
		cq.select(cq.from(classeEntidade));
		return em.createQuery(cq).getResultList();
	}
		

}
