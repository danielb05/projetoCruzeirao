package sistema.modelos;

import java.io.Serializable;
import java.util.ArrayList;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class PartidaFutebol implements Serializable{
	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private int PartidaFutebolID;
	
	public int getPartidaFutebolID() {
		return PartidaFutebolID;
	}
	public void setPartidaFutebolID(int partidaFutebolID) {
		PartidaFutebolID = partidaFutebolID;
	}
	@OneToMany(targetEntity = Gol.class, fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	private ArrayList<Gol> golsMandante;
	@OneToMany(targetEntity = Gol.class, fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	private ArrayList<Gol> golsVisitante;
	@OneToMany(targetEntity = Gol.class, fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	private ArrayList<Gol> golsPenaltesMandante;
	@OneToMany(targetEntity = Gol.class, fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	private ArrayList<Gol> golsPenaltesVisitante;
	@OneToMany(targetEntity = Cartao.class, fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	private ArrayList<Cartao> cartoesMandante;
	@OneToMany(targetEntity = Cartao.class, fetch = FetchType.EAGER, cascade = CascadeType.ALL)
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
