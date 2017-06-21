package sistema.dao.generic;

import java.io.Serializable;
import java.util.List;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.NoResultException;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaQuery;

public abstract class GenericDAO <T,I extends Serializable> {


	private static EntityManagerFactory emf;
	protected EntityManager em;
	protected Class<T> classeEntidade;
	
	public GenericDAO()
	{
		
		final String nomeProjeto = "Cruzeirao1.0";
		
		emf = Persistence.createEntityManagerFactory(nomeProjeto);
		
		em = emf.createEntityManager();
	}
	
	@PostConstruct
	public void init()
	{
		
		classeEntidade = getClasseEntidade();
		
	}
	
	protected abstract Class<T> getClasseEntidade();

	public EntityManager getEntityManager() {
	  
	 if(em == null)
	 	em = emf.createEntityManager();
	  
	  return em;
	}
	
	@SuppressWarnings({ "unchecked", "rawtypes" })
	protected T pesquisarUm(String namedQuery, Map parametros) {
		T resultado = null;

		try {
			Query query = em.createNamedQuery(namedQuery);
			if (parametros != null && !parametros.isEmpty()) {
				popularParametrosQuery(query, parametros);
			}
			resultado = (T) query.setMaxResults(1).getSingleResult();
		} catch (NoResultException e) {
			System.out.println(e);
		} catch (Exception e) {
			System.out.println(e);
		}

		return resultado;
	}
	
	protected void popularParametrosQuery(Query query,	Map<String, Object> parametros) {
		for (Map.Entry<String, Object> parametro : parametros.entrySet()) {
			query.setParameter(parametro.getKey(), parametro.getValue());
		}
	}
	public void closeEntityManager(){
		
		if(em != null)
			em.close();
		
		em = null;
	}
	
	public T update(T entity){
		T ent = null;
		
		getEntityManager().getTransaction().begin();
		ent = getEntityManager().merge(entity);
		getEntityManager().getTransaction().commit();
		
		return ent;
	}
	
	public T save(T entity)
	{
		
		T saved = null;
		
		getEntityManager().getTransaction().begin();
		saved = getEntityManager().merge(entity);
		getEntityManager().getTransaction().commit();
		return saved;
		
	}
	
	public void remove(T entity) {
		getEntityManager().getTransaction().begin();
		getEntityManager().remove(entity);
		getEntityManager().getTransaction().commit();

	}


	public T getById(Class<T> classe, I pk) {
		
		try {
			return getEntityManager().find(classe, pk);
		} catch (NoResultException e) {
			return null;
		}

	}

	@SuppressWarnings("unchecked")
	public List<T> getAll(Class<T> classe) {
		
		return getEntityManager().createQuery("select l from " + classe.getSimpleName() + " l").getResultList();
	}


}
