package sistema.modelos;

import java.util.ArrayList;
import java.util.Date;

public class Campeonato {
	
	private Date inicioCampeonato;
	private Date fimCampeonato;
	private Date inicioInscricao;
	private Date fimInscricao;
	private double taxa;
	private ArrayList<Categoria> categorias;
	private Usuario organizador;
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
	public Usuario getOrganizador() {
		return organizador;
	}
	public void setOrganizador(Usuario organizador) {
		this.organizador = organizador;
	}
	
	

}
