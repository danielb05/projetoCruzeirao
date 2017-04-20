package sistema.modelos;

import java.util.ArrayList;

public class PartidaFutebol {
	
	private ArrayList<Gol> golsMandante;
	private ArrayList<Gol> golsVisitante;
	private ArrayList<Gol> golsPenaltesMandante;
	private ArrayList<Gol> golsPenaltesVisitante;
	private ArrayList<Cartao> cartoesMandante;
	private ArrayList<Cartao> cartoesVisitante;
	
	
	public ArrayList<Gol> getGolsMandante() {
		return golsMandante;
	}
	public void setGolsMandante(ArrayList<Gol> golsMandante) {
		this.golsMandante = golsMandante;
	}
	public ArrayList<Gol> getGolsVisitante() {
		return golsVisitante;
	}
	public void setGolsVisitante(ArrayList<Gol> golsVisitante) {
		this.golsVisitante = golsVisitante;
	}
	public ArrayList<Gol> getGolsPenaltesMandante() {
		return golsPenaltesMandante;
	}
	public void setGolsPenaltesMandante(ArrayList<Gol> golsPenaltesMandante) {
		this.golsPenaltesMandante = golsPenaltesMandante;
	}
	public ArrayList<Gol> getGolsPenaltesVisitante() {
		return golsPenaltesVisitante;
	}
	public void setGolsPenaltesVisitante(ArrayList<Gol> golsPenaltesVisitante) {
		this.golsPenaltesVisitante = golsPenaltesVisitante;
	}
	public ArrayList<Cartao> getCartoesMandante() {
		return cartoesMandante;
	}
	public void setCartoesMandante(ArrayList<Cartao> cartoesMandante) {
		this.cartoesMandante = cartoesMandante;
	}
	public ArrayList<Cartao> getCartoesVisitante() {
		return cartoesVisitante;
	}
	public void setCartoesVisitante(ArrayList<Cartao> cartoesVisitante) {
		this.cartoesVisitante = cartoesVisitante;
	}

}
