package sistema.dao;

import sistema.dao.generic.GenericDAO;
import sistema.modelos.Partida;
public class PartidaDAO extends GenericDAO<Partida,Integer>{

	@Override
	protected Class<Partida> getClasseEntidade() {
		// TODO Auto-generated method stub
		return Partida.class;
	}

}
