package sistema.modelos;

import java.util.ArrayList;

public class Rodada {

	private ArrayList<Partida> partidas;
	
	//alteracoes glauco
	private int numero;
	private Grupo grupo;
	
	
	public ArrayList<Partida> getPartidas() {
		return partidas;
	}

	public void setPartidas(ArrayList<Partida> partidas) {
		this.partidas = partidas;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public Grupo getGrupo() {
		return grupo;
	}

	public void setGrupo(Grupo grupo) {
		this.grupo = grupo;
	}


}
