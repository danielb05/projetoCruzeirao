package sistema.beans;

import java.util.List;

import sistema.modelos.Estadio;
import sistema.service.EstadioService;

public class EstadioManagedBean {
	
	private Estadio estadio = new Estadio();
	public void setEstadio(Estadio estadio) {
		this.estadio = estadio;
	}

	private EstadioService service = new EstadioService();
	
	public void salvar(){
		service.salvar(estadio);
		estadio = new Estadio();
	}
	
	public List<Estadio> getEstadios(){
		return service.getEstadios();
	}

	public Estadio getEstadio() {
		return estadio;
	}

}
