package sistema.modelos;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

@Entity

public class Partida implements Serializable {
	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int PartidaID;
	
	@ManyToOne(targetEntity=Estadio.class,fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	private Estadio estadio;
	
	private int numero;
	@ManyToOne
	private Inscricao equipeMandante;
	@ManyToOne
	private Inscricao equipeVisitante;
	@Temporal(TemporalType.DATE)
	private Date data;
	
	@OneToOne(targetEntity = Partida.class, fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	private Partida proxPartida;
	@OneToMany(targetEntity = Juiz.class, fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private ArrayList<Juiz> juizes;
	
	@OneToOne(targetEntity = Grupo.class, fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	private Grupo grupo;
	private String relatoJuiz;
	
	
	public Estadio getEstadio() {
		return estadio;
	}
	public void setEstadio(Estadio estadio) {
		this.estadio = estadio;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public Inscricao getEquipeMandante() {
		return equipeMandante;
	}
	public void setEquipeMandante(Inscricao equipeMandante) {
		this.equipeMandante = equipeMandante;
	}
	public Inscricao getEquipeVisitante() {
		return equipeVisitante;
	}
	public void setEquipeVisitante(Inscricao equipeVisitante) {
		this.equipeVisitante = equipeVisitante;
	}
	public Date getData() {
		return data;
	}
	public void setData(Date data) {
		this.data = data;
	}
	public Partida getProxPartida() {
		return proxPartida;
	}
	public void setProxPartida(Partida proxPartida) {
		this.proxPartida = proxPartida;
	}
	public ArrayList<Juiz> getJuizes() {
		return juizes;
	}
	public void setJuizes(ArrayList<Juiz> juizes) {
		this.juizes = juizes;
	}
	public Grupo getGrupo() {
		return grupo;
	}
	public void setGrupo(Grupo grupo) {
		this.grupo = grupo;
	}
	public String getRelatoJuiz() {
		return relatoJuiz;
	}
	public void setRelatoJuiz(String relatoJuiz) {
		this.relatoJuiz = relatoJuiz;
	}
	
		

}
