package sistema.modelos;

import java.util.ArrayList;

public class Categoria {
	
	private String nome;
	private char genero;
	private String anoMaximo;
	private ArrayList<Time> times;
	private boolean estadoTime;
	private boolean estadoJogador;
	private int qtdMinimaTimes;
	private int qtdMaximaTimes;
	private int qtdMinimaJogadores;
	private int qtdMaximaJogadores;
	private ArrayList<String> chaves;
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public char getGenero() {
		return genero;
	}
	public void setGenero(char genero) {
		this.genero = genero;
	}
	public String getAnoMaximo() {
		return anoMaximo;
	}
	public void setAnoMaximo(String anoMaximo) {
		this.anoMaximo = anoMaximo;
	}
	public ArrayList<Time> getTimes() {
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
	public ArrayList<String> getChaves() {
		return chaves;
	}
	public void setChaves(ArrayList<String> chaves) {
		this.chaves = chaves;
	}

}
