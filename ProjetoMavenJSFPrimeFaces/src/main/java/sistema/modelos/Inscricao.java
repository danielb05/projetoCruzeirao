package sistema.modelos;

import java.util.ArrayList;

public class Inscricao {
	
	private Time time;
	private String comprovante;
	private boolean confirmacao;
		
	//alteracoes glauco
	private long numero;
	private ArrayList<Inscrito> inscritos;
	private Categoria categoria;
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
