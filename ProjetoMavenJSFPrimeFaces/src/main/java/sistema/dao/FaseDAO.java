package sistema.dao;

import sistema.dao.generic.GenericDAO;
import sistema.modelos.Fase;
public class FaseDAO extends GenericDAO<Fase,Integer>{

	@Override
	protected Class<Fase> getClasseEntidade() {
		// TODO Auto-generated method stub
		return Fase.class;
	}

}
