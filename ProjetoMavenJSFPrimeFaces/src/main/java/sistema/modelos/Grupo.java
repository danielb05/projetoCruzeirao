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

public class Grupo implements Serializable {

	private static final long serialVersionUID = 1L;
@Id
@GeneratedValue(strategy = GenerationType.AUTO)
private int GrupoID;

	private String nome;
	
	@ManyToOne(targetEntity=Fase.class,fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	private Fase fase;
	
	@OneToMany(targetEntity = Rodada.class, fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private ArrayList<Rodada> rodadas;
	private int numero;
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Fase getFase() {
		return fase;
	}
	public void setFase(Fase fase) {
		this.fase = fase;
	}
	public ArrayList<Rodada> getRodadas() {
		return rodadas;
	}
	public void setRodadas(ArrayList<Rodada> rodadas) {
		this.rodadas = rodadas;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	
	
}
