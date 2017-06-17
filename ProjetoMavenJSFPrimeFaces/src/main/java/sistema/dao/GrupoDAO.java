package sistema.dao;

import sistema.dao.generic.GenericDAO;
import sistema.modelos.Grupo;

public class GrupoDAO extends GenericDAO<Grupo,Integer>{

	@Override
	protected Class<Grupo> getClasseEntidade() {
		// TODO Auto-generated method stub
		return Grupo.class;
	}

}
