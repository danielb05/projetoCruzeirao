package sistema.beans;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.bean.ViewScoped;

import sistema.modelos.Estadio;
import sistema.service.EstadioService;

@ManagedBean
@ViewScoped
public class EstadioManagedBean {
	
	private Estadio estadio = new Estadio();
	private EstadioService EstadioService = new EstadioService();
	
	public void setEstadio(Estadio estadio) {
		this.estadio = estadio;
	}

	private EstadioService service = new EstadioService();
	
	public void salvar(){
		
		EstadioService.salvar(estadio);
		estadio = new Estadio();
	}
	

	public Estadio getEstadio() {
		return estadio;
	}

}
