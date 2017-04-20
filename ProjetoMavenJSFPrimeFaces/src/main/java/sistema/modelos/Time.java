package sistema.modelos;

import java.util.ArrayList;
import java.util.Date;

public class Time {
	
	private String nomeTime;
	// nao precisa mais //private ArrayList<Usuario> jogadores;
	// nao precisa mais //private Usuario tecnico;
	// nao precisa mais //private Usuario massagista;
	// nao precisa mais //private Usuario prepFisico;
	// nao precisa mais //private Usuario diretor;
	// nao precisa mais //private Categoria categoria;
	// nao precisa mais //private int qtdMinima;
	// nao precisa mais //private int qtdMaxima;
	// nao precisa mais //private String chave;
	
	//alteracoes glauco
	private Date dataFundacao;
	private String cidade;
	private ArrayList<Usuario> diretores;
	
	public String getNomeTime() {
		return nomeTime;
	}
	public void setNomeTime(String nomeTime) {
		this.nomeTime = nomeTime;
	}
	/*public ArrayList<Usuario> getJogadores() {
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
	}*/
	public Date getDataFundacao() {
		return dataFundacao;
	}
	public void setDataFundacao(Date dataFundacao) {
		this.dataFundacao = dataFundacao;
	}
	public String getCidade() {
		return cidade;
	}
	public void setCidade(String cidade) {
		this.cidade = cidade;
	}
	public ArrayList<Usuario> getDiretores() {
		return diretores;
	}
	public void setDiretores(ArrayList<Usuario> diretores) {
		this.diretores = diretores;
	}

}
