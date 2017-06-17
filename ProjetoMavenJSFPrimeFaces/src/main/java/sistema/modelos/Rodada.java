package sistema.modelos;

import java.io.Serializable;
import java.util.ArrayList;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Rodada implements Serializable{

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int RodadaID;
	private static final long serialVersionUID = 1L;

	@OneToMany(targetEntity = Partida.class, fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private ArrayList<Partida> partidas;
	
	private int numero;
	@ManyToOne(targetEntity=Grupo.class,fetch = FetchType.EAGER, cascade = CascadeType.ALL)
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
