package sistema.dao;

import sistema.dao.generic.GenericDAO;
import sistema.modelos.Cartao;

public class CartaoDAO extends GenericDAO<Cartao,Integer>{

	@Override
	protected Class<Cartao> getClasseEntidade() {
		// TODO Auto-generated method stub
		return Cartao.class;
	}

}
