package sistema.beans;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import sistema.modelos.Grupo;
import sistema.dao.GrupoDAO;
import sistema.service.GrupoService;
@ManagedBean
@ViewScoped
public class GrupoManagedBean {

	private Grupo Grupo = new Grupo();
	private GrupoService service = new GrupoService();
	private List<Grupo> Grupos;
	public void salvar(){
		
		service.salvar(Grupo);
		if(Grupo!=null)
			Grupos.add(Grupo);
		Grupo = new Grupo();
		
		
	}
	

	
	 public List<Grupo> getGrupos(){
		 return service.getGrupos();
	 }



	public Grupo getGrupo() {
		return Grupo;
	}



	public void setGrupo(Grupo Grupo) {
		this.Grupo = Grupo;
	}
	
}
