package sistema.beans;

import java.util.List;

import sistema.modelos.Categoria;
import sistema.service.CategoriaService;



public class CategoriaManagedBean {
	
	private Categoria categoria = new Categoria();
	private CategoriaService service = new CategoriaService();
	
	public void salvar(){
		
		service.salvar(categoria);
		
	}
	
	public List<Categoria> getCategorias(){
		return service.getCategorias();
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
}
