package sistema.beans;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import sistema.modelos.Chaves;
import sistema.service.ChavesService;


@ManagedBean
@ViewScoped
public class ChavesManagedBean {

	private List<Chaves> ListChaves;


	private ChavesService service = new ChavesService();
	private Chaves Chaves = new Chaves();
	
	
	
	public List<Chaves> getListChaves() {
		return ListChaves;
	}

	public void setListChaves(List<Chaves> listChaves) {
		ListChaves = listChaves;
	}

	public void setChaves(Chaves chaves) {
		Chaves = chaves;
	}

	public void salvar(){
		service.salvar(Chaves);
		if(ListChaves!=null)
			ListChaves.add(Chaves);
			
		Chaves = new Chaves();
	}
	
	public List<Chaves> getChaves(){
		return service.getChaves();
	}
	
}
