package sistema.dao;
import sistema.dao.generic.GenericDAO;
import sistema.modelos.Juiz;
public class JuizDAO extends GenericDAO<Juiz,Integer>{

	@Override
	protected Class<Juiz> getClasseEntidade() {
		// TODO Auto-generated method stub
		return Juiz.class;
	}

	
}
