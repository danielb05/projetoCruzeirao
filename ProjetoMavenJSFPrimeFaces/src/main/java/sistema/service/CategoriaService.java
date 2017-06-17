package sistema.service;

import java.util.ArrayList;
import java.util.List;

import sistema.modelos.Categoria;

import sistema.dao.CategoriaDAO;
public class CategoriaService {

CategoriaDAO CategoriaAO = new CategoriaDAO();
 	
	public Categoria salvar(Categoria categoria)
	{
		categoria = CategoriaAO.save(categoria);
		CategoriaAO.closeEntityManager();
		return categoria;
		
	}
	
	public List <Categoria> getCategorias()
	{
		List <Categoria> list = CategoriaAO.getAll(Categoria.class);
		CategoriaAO.closeEntityManager();
		return list;
	}

	public void alterar(Categoria categoria) {
		CategoriaAO.save(categoria);
		CategoriaAO.closeEntityManager();
	}

	
	public void remover(Categoria categoria) {
		
		categoria = CategoriaAO.getById(Categoria.class, categoria.getCategoriaID());
		CategoriaAO.remove(categoria);
		CategoriaAO.closeEntityManager();
	}
	
}
