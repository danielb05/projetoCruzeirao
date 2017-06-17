package sistema.dao;

import sistema.dao.generic.GenericDAO;
import sistema.modelos.Inscricao;

public class InscricaoDAO extends GenericDAO<Inscricao,Integer>{

	@Override
	protected Class<Inscricao> getClasseEntidade() {
		// TODO Auto-generated method stub
		return Inscricao.class;
	}

}
