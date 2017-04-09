package sistema.beans;


import java.util.List;

import sistema.modelos.Campeonato;
import sistema.service.CampeonatoService;

public class CampeonatoManagedBean {
	
	private Campeonato campeonato = new Campeonato();


	private CampeonatoService service = new CampeonatoService();
	
	public void salvar(){
		service.salvar(campeonato);
		campeonato = new Campeonato();
	}
	
	public Campeonato getCampeonato() {
		return campeonato;
	}

	public void setCampeonato(Campeonato campeonato) {
		this.campeonato = campeonato;
	}
	
	public List<Campeonato> getCampeonatos(){
		return service.getCampeonatos();
	}
	
}
