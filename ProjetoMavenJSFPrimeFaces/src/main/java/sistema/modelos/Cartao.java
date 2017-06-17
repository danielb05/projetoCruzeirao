package sistema.modelos;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Cartao implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int CartaoID;
	
	public int getCartaoID() {
		return CartaoID;
	}
	public void setCartaoID(int cartaoID) {
		CartaoID = cartaoID;
	}
	
	@ManyToOne(targetEntity = Inscrito.class, fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private Inscrito inscrito;
	private int tempo;
	private enum Tipo{
		VERMELHO,
		AMARELO
	}
	
	@Enumerated(EnumType.STRING)
	private Tipo tipo;
	
	public Tipo getTipo() {
		return tipo;
	}
	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}
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

	

}
