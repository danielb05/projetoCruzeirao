package sistema.dao;

import java.util.List;

import javax.persistence.EntityManager;

import sistema.dao.generic.GenericDAO;
import sistema.modelos.Time;
import sistema.modelos.Usuario;

public class TimeDAO extends GenericDAO<Time,Integer>{

	@Override
	protected Class<Time> getClasseEntidade() {
		// TODO Auto-generated method stub
		return Time.class;
	}
	
	public List<Usuario> getDiretoresTime(Time Time) {
		
		List<Usuario> usuarios = null;
		EntityManager em = getEntityManager();
		Time FindTime = em.find(Time.class, Time.getTimeID());
		em.refresh(FindTime);
		usuarios = FindTime.getDiretores();
		em.close();

		return usuarios;
	}

}
