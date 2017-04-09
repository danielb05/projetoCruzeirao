package sistema.beans;

import java.util.List;

import sistema.modelos.Partida;
import sistema.service.PartidaService;

public class PartidaManagedBean {
	
	private PartidaService service = new PartidaService();
	private Partida partida = new Partida();
	
	public void salvar(){
		service.salvar(partida);
		partida = new Partida();
	}

	public List<Partida> getPartidas(){
		return service.getPartidas();
	}
	
}
