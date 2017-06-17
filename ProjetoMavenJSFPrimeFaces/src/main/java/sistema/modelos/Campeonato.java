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
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
@Entity
public class Campeonato implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int CampeonatoID;
	
	public int getCampeonatoID() {
		return CampeonatoID;
	}
	public void setCampeonatoID(int campeonatoID) {
		CampeonatoID = campeonatoID;
	}
	private String nome;
	@Temporal(TemporalType.DATE)
	private Date inicioCampeonato;
	@Temporal(TemporalType.DATE)
	private Date fimCampeonato;
	@Temporal(TemporalType.DATE)
	private Date inicioInscricao;
	@Temporal(TemporalType.DATE)
	private Date fimInscricao;
	private double taxa;
	
	@OneToMany(mappedBy="campeonato",targetEntity = Categoria.class, fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private ArrayList<Categoria> categorias;
	
	@OneToMany(targetEntity = Estadio.class, fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private ArrayList<Estadio> locais;
	
	@OneToMany(targetEntity = Juiz.class, fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private ArrayList<Juiz> juizes;
	
	
	public Date getInicioCampeonato() {
		return inicioCampeonato;
	}
	public void setInicioCampeonato(Date inicioCampeonato) {
		this.inicioCampeonato = inicioCampeonato;
	}
	public Date getFimCampeonato() {
		return fimCampeonato;
	}
	public void setFimCampeonato(Date fimCampeonato) {
		this.fimCampeonato = fimCampeonato;
	}
	public Date getInicioInscricao() {
		return inicioInscricao;
	}
	public void setInicioInscricao(Date inicioInscricao) {
		this.inicioInscricao = inicioInscricao;
	}
	public Date getFimInscricao() {
		return fimInscricao;
	}
	public void setFimInscricao(Date fimInscricao) {
		this.fimInscricao = fimInscricao;
	}
	public double getTaxa() {
		return taxa;
	}
	public void setTaxa(double taxa) {
		this.taxa = taxa;
	}
	public ArrayList<Categoria> getCategorias() {
		return categorias;
	}
	public void setCategorias(ArrayList<Categoria> categorias) {
		this.categorias = categorias;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public ArrayList<Estadio> getLocais() {
		return locais;
	}
	public void setLocais(ArrayList<Estadio> locais) {
		this.locais = locais;
	}
	public ArrayList<Juiz> getJuizes() {
		return juizes;
	}
	public void setJuizes(ArrayList<Juiz> juizes) {
		this.juizes = juizes;
	}
	
	

}
