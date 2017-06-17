package sistema.modelos;

import java.io.Serializable;
import java.util.ArrayList;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
@Entity
public class Categoria implements Serializable{
	
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int CategoriaID;
	
	public int getCategoriaID() {
		return CategoriaID;
	}
	public void setCategoriaID(int categoriaID) {
		CategoriaID = categoriaID;
	}
	private String nome;
	private enum Genero{
		M,F
	}
	
	@Enumerated(EnumType.STRING)
	private Genero genero;
	private String anoMaximo;
	private int qtdMinimaJogadores;
	private int qtdMaximaJogadores;
	@OneToMany(mappedBy = "categoria", targetEntity = Inscricao.class, fetch = FetchType.LAZY, cascade = CascadeType.ALL )
	private ArrayList<Inscricao> inscricoes;
	
	@ManyToOne
	private Campeonato campeonato;
	
	@OneToMany(targetEntity = Fase.class, fetch = FetchType.LAZY, cascade = CascadeType.ALL)
	private ArrayList<Fase> fases;
	
	private int numero;
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Genero getGenero() {
		return genero;
	}
	public void setGenero(Genero genero) {
		this.genero = genero;
	}
	public String getAnoMaximo() {
		return anoMaximo;
	}
	public void setAnoMaximo(String anoMaximo) {
		this.anoMaximo = anoMaximo;
	}
	
	public int getQtdMinimaJogadores() {
		return qtdMinimaJogadores;
	}
	public void setQtdMinimaJogadores(int qtdMinimaJogadores) {
		this.qtdMinimaJogadores = qtdMinimaJogadores;
	}
	public int getQtdMaximaJogadores() {
		return qtdMaximaJogadores;
	}
	public void setQtdMaximaJogadores(int qtdMaximaJogadores) {
		this.qtdMaximaJogadores = qtdMaximaJogadores;
	}
	
	public ArrayList<Inscricao> getInscricoes() {
		return inscricoes;
	}
	public void setInscricoes(ArrayList<Inscricao> inscricoes) {
		this.inscricoes = inscricoes;
	}
	public Campeonato getCampeonato() {
		return campeonato;
	}
	public void setCampeonato(Campeonato campeonato) {
		this.campeonato = campeonato;
	}
	public ArrayList<Fase> getFases() {
		return fases;
	}
	public void setFases(ArrayList<Fase> fases) {
		this.fases = fases;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	

}
