package sistema.service;

import java.util.ArrayList;

import sistema.modelos.Partida;

public class PartidaService {
	
	private ArrayList<Partida> partidas = new ArrayList<Partida>();
	

	public PartidaService(){
		
	}

	public ArrayList<Partida> getPartidas() {
		return partidas;
	}
	
	public void salvar(Partida partida){
		partidas.add(partida);
	}

}
