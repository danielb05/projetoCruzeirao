package sistema.dao;

import sistema.dao.generic.GenericDAO;
import sistema.modelos.Chaves;

public class ChavesDAO extends GenericDAO<Chaves,Integer>{

	@Override
	protected Class<Chaves> getClasseEntidade() {
		// TODO Auto-generated method stub
		return Chaves.class;
	}

	
}
