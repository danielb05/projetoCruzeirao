package sistema.dao;

import sistema.dao.generic.GenericDAO;
import sistema.modelos.Estadio;

public class EstadioDAO extends GenericDAO<Estadio,Integer>{

	@Override
	protected Class<Estadio> getClasseEntidade() {
		// TODO Auto-generated method stub
		return Estadio.class;
		
	}

}
