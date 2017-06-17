package sistema.dao;

import java.util.List;

import sistema.dao.generic.GenericDAO;
import sistema.modelos.Gol;
import sistema.modelos.Partida;
import sistema.modelos.PartidaFutebol;


public class PartidaFutebolDAO extends GenericDAO<PartidaFutebol,Integer>{

	
	@Override
	protected Class<PartidaFutebol> getClasseEntidade() {
		// TODO Auto-generated method stub
		return PartidaFutebol.class;
	}
	
}
