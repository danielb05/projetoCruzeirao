package sistema.modelos;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Gol implements Serializable{
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy= GenerationType.AUTO)
	private int GolID;
	
	public int getGolID() {
		return GolID;
	}
	public void setGolID(int golID) {
		GolID = golID;
	}
	@ManyToOne(targetEntity = Inscrito.class, fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	private Inscrito inscrito;
	private int tempo;
	private boolean penalty;
	
	public Inscrito getInscrito() {
		return inscrito;
	}
	public void setInscrito(Inscrito inscrito) {
		this.inscrito = inscrito;
	}
	public int getTempo() {
		return tempo;
	}
	public void setTempo(int tempo) {
		this.tempo = tempo;
	}
	public boolean isPenalty() {
		return penalty;
	}
	public void setPenalty(boolean penalty) {
		this.penalty = penalty;
	}
	

}
