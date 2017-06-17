package sistema.dao;

import sistema.dao.generic.GenericDAO;
import sistema.modelos.Gol;

public class GolDAO extends GenericDAO<Gol,Integer>{

	@Override
	protected Class<Gol> getClasseEntidade() {
		// TODO Auto-generated method stub
		return Gol.class;
	}

}
