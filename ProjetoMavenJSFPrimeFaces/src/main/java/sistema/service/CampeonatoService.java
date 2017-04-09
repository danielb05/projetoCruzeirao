package sistema.service;

import java.util.ArrayList;

import sistema.modelos.Campeonato;


public class CampeonatoService {
	
	private ArrayList<Campeonato> campeonatos = new ArrayList<Campeonato>();
	

	public CampeonatoService(){
		
	}
	
	public void salvar(Campeonato campeonato){
		
		campeonatos.add(campeonato);
	}
	
	public ArrayList<Campeonato> getCampeonatos() {
		return campeonatos;
	}

	

}
