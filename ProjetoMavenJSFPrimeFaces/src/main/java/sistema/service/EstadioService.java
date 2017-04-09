package sistema.service;

import java.util.ArrayList;

import sistema.modelos.Estadio;


public class EstadioService {
	
	private ArrayList<Estadio> estadios = new ArrayList<Estadio>();
	
	

	public EstadioService(){
		
		
	}
	
	public void salvar(Estadio estadio){
		estadios.add(estadio);
	}
	
	public ArrayList<Estadio> getEstadios() {
		return estadios;
	}
	
	

}
