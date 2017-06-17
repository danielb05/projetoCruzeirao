package sistema.beans;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import org.primefaces.event.RowEditEvent;

import sistema.service.CampeonatoService;
import sistema.modelos.Campeonato;
import sistema.modelos.Categoria;
import sistema.service.CategoriaService;


@ManagedBean
@ViewScoped
public class CategoriaManagedBean {
	
	private Categoria categoria = new Categoria();
	private CategoriaService service = new CategoriaService();
	private List<Categoria> categorias;
	private List<Campeonato> campeonatos;
	
	private CampeonatoService CampeonatoService = new CampeonatoService();
	
	public List<Campeonato> getCampeonatos() {
		
		
		if (campeonatos == null)
			campeonatos = CampeonatoService.getCampeonatos();

		return campeonatos;
	}

	public void setCampeonatos(ArrayList<Campeonato> campeonatos) {
		this.campeonatos = campeonatos;
	}

	// Editar
	public void onRowEdit(RowEditEvent event) {

		Categoria a = ((Categoria) event.getObject());
		service.alterar(a);
	}
	
	//Salvar
	public void salvar() {
		categoria = service.salvar(categoria);

		if (categorias != null)
			categorias.add(categoria);

		categoria = new Categoria();

	}


	// Retorna a lista para a tabela
	public List<Categoria> getCategorias() {
		if (categorias == null)
			categorias = service.getCategorias();

		return categorias;
	}
	
	//Remover
	public void remover(Categoria categoria) {
		service.remover(categoria);
		categorias.remove(categoria);

	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}

	
}
