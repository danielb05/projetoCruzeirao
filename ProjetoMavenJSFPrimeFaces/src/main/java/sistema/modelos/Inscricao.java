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
public class Inscricao implements Serializable {
	
	private static final long serialVersionUID = 1L;
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	
	@ManyToOne(targetEntity=Time.class,fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	private Time time;
	private String comprovante;
	private boolean confirmacao;
		
	//alteracoes glauco
	private long numero;
	@OneToMany(mappedBy = "inscricao", targetEntity = Inscrito.class, fetch = FetchType.LAZY, cascade = CascadeType.ALL )
	private ArrayList<Inscrito> inscritos;
	
	@ManyToOne(targetEntity=Categoria.class,fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	private Categoria categoria;
	@OneToMany(targetEntity = Partida.class, fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private ArrayList<Partida> partidas;
	private boolean validada;
	
	public Time getTime() {
		return time;
	}
	public void setTime(Time time) {
		this.time = time;
	}
	public String getComprovante() {
		return comprovante;
	}
	public void setComprovante(String comprovante) {
		this.comprovante = comprovante;
	}
	public boolean isConfirmacao() {
		return confirmacao;
	}
	public void setConfirmacao(boolean confirmacao) {
		this.confirmacao = confirmacao;
	}
	public long getNumero() {
		return numero;
	}
	public void setNumero(long numero) {
		this.numero = numero;
	}
	public ArrayList<Inscrito> getInscritos() {
		return inscritos;
	}
	public void setInscritos(ArrayList<Inscrito> inscritos) {
		this.inscritos = inscritos;
	}
	public Categoria getCategoria() {
		return categoria;
	}
	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	public ArrayList<Partida> getPartidas() {
		return partidas;
	}
	public void setPartidas(ArrayList<Partida> partidas) {
		this.partidas = partidas;
	}
	public boolean isValidada() {
		return validada;
	}
	public void setValidada(boolean validada) {
		this.validada = validada;
	}
	

}
