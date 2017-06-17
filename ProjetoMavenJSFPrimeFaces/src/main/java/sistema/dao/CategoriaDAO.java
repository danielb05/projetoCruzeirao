package sistema.dao;

import java.io.Serializable;

import sistema.dao.generic.GenericDAO;
import sistema.modelos.Categoria;

public class CategoriaDAO extends GenericDAO<Categoria, Integer>{

	@Override
	protected Class<Categoria> getClasseEntidade() {
		// TODO Auto-generated method stub
		return Categoria.class;
	}

}
