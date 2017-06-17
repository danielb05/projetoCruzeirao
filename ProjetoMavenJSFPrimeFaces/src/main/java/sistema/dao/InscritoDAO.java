package sistema.dao;

import sistema.dao.generic.GenericDAO;
import sistema.modelos.Inscrito;

public class InscritoDAO extends GenericDAO<Inscrito,Integer>{

	@Override
	protected Class<Inscrito> getClasseEntidade() {
		// TODO Auto-generated method stub
		return Inscrito.class;
	}

}
