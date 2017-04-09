package sistema.service;

import java.util.ArrayList;

import sistema.modelos.Categoria;


public class CategoriaService {

	private ArrayList<Categoria> categorias = new ArrayList<Categoria>();

	public CategoriaService(){
		
	}
	
	public void salvar(Categoria categoria){
		categorias.add(categoria);
	}
	
	public ArrayList<Categoria> getCategorias() {
		return categorias;
	}
	
	
}
