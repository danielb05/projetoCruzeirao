package sistema.dao;

import sistema.dao.generic.GenericDAO;
import sistema.modelos.Rodada;

public class RodadaDAO extends GenericDAO<Rodada,Integer>{

	@Override
	protected Class<Rodada> getClasseEntidade() {
		// TODO Auto-generated method stub
		return Rodada.class;
	}

}
