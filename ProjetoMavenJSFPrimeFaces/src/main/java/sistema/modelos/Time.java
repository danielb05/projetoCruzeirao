package sistema.modelos;

import java.util.ArrayList;

public class Time {
	
	private String nomeTime;
	private ArrayList<Usuario> jogadores;
	private Usuario tecnico;
	private Usuario massagista;
	private Usuario prepFisico;
	private Usuario diretor;
	private Categoria categoria;
	private int qtdMinima;
	private int qtdMaxima;
	
	private String chave;
	
	public String getNomeTime() {
		return nomeTime;
	}
	public void setNomeTime(String nomeTime) {
		this.nomeTime = nomeTime;
	}
	public ArrayList<Usuario> getJogadores() {
		return jogadores;
	}
	public void setJogadores(ArrayList<Usuario> jogadores) {
		this.jogadores = jogadores;
	}
	public Usuario getTecnico() {
		return tecnico;
	}
	public void setTecnico(Usuario tecnico) {
		this.tecnico = tecnico;
	}
	public Usuario getMassagista() {
		return massagista;
	}
	public void setMassagista(Usuario massagista) {
		this.massagista = massagista;
	}
	public Usuario getPrepFisico() {
		return prepFisico;
	}
	public void setPrepFisico(Usuario prepFisico) {
		this.prepFisico = prepFisico;
	}
	public Usuario getDiretor() {
		return diretor;
	}
	public void setDiretor(Usuario diretor) {
		this.diretor = diretor;
	}
	public Categoria getCategoria() {
		return categoria;
	}
	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	public int getQtdMinima() {
		return qtdMinima;
	}
	public void setQtdMinima(int qtdMinima) {
		this.qtdMinima = qtdMinima;
	}
	public int getQtdMaxima() {
		return qtdMaxima;
	}
	public void setQtdMaxima(int qtdMaxima) {
		this.qtdMaxima = qtdMaxima;
	}
	public String getChave() {
		return chave;
	}
	public void setChave(String chave) {
		this.chave = chave;
	}

}
