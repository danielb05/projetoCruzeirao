package sistema.dao;

import sistema.dao.generic.GenericDAO;
import sistema.modelos.Campeonato;

public class CampeonatoDAO extends GenericDAO<Campeonato, Integer>{

	@Override
	protected Class<Campeonato> getClasseEntidade() {
		// TODO Auto-generated method stub
		return Campeonato.class;
	}

}
