package sistema.modelos;

import java.util.ArrayList;

public class Categoria {
	
	private String nome;
	private Enum genero;
	private String anoMaximo;
	// nao precisa mais //private ArrayList<Time> times;
	// nao precisa mais //private boolean estadoTime;
	// nao precisa mais //private boolean estadoJogador;
	// nao precisa mais //private int qtdMinimaTimes;
	// nao precisa mais //private int qtdMaximaTimes;
	private int qtdMinimaJogadores;
	private int qtdMaximaJogadores;
	// nao precisa mais //private ArrayList<String> chaves;
	
	//alteracoes glauco
	private ArrayList<Inscricao> inscricoes;
	private Campeonato campeonato;
	private ArrayList<Fase> fases;
	private int numero;
	
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public Enum getGenero() {
		return genero;
	}
	public void setGenero(Enum genero) {
		this.genero = genero;
	}
	public String getAnoMaximo() {
		return anoMaximo;
	}
	public void setAnoMaximo(String anoMaximo) {
		this.anoMaximo = anoMaximo;
	}
	/*public ArrayList<Time> getTimes() {
		return times;
	}
	public void setTimes(ArrayList<Time> times) {
		this.times = times;
	}
	public boolean isEstadoTime() {
		return estadoTime;
	}
	public void setEstadoTime(boolean estadoTime) {
		this.estadoTime = estadoTime;
	}
	public boolean isEstadoJogador() {
		return estadoJogador;
	}
	public void setEstadoJogador(boolean estadoJogador) {
		this.estadoJogador = estadoJogador;
	}
	public int getQtdMinimaTimes() {
		return qtdMinimaTimes;
	}
	public void setQtdMinimaTimes(int qtdMinimaTimes) {
		this.qtdMinimaTimes = qtdMinimaTimes;
	}
	public int getQtdMaximaTimes() {
		return qtdMaximaTimes;
	}
	public void setQtdMaximaTimes(int qtdMaximaTimes) {
		this.qtdMaximaTimes = qtdMaximaTimes;
	}*/
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
	/*public ArrayList<String> getChaves() {
		return chaves;
	}
	public void setChaves(ArrayList<String> chaves) {
		this.chaves = chaves;
	}*/
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
