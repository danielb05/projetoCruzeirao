package sistema.modelos;

import java.util.ArrayList;
import java.util.Date;

public class Partida {
	
	private Estadio estadio;
	// nao precisa mais //private String horario;
	// nao precisa mais //private Time oponente1;
	// nao precisa mais //private Time oponente2;
	// nao precisa mais //private Time vencedor;
	// nao precisa mais //private int oponente1Placar;
	// nao precisa mais //private int oponente2Placar;
	
	//alteracoes glauco
	private int numero;
	private Inscricao equipeMandante;
	private Inscricao equipeVisitante;
	private Date data;
	private Partida proxPartida;
	private ArrayList<Juiz> juizes;
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
	
	/*public String getHorario() {
		return horario;
	}
	public void setHorario(String horario) {
		this.horario = horario;
	}
	public Time getOponente1() {
		return oponente1;
	}
	public void setOponente1(Time oponente1) {
		this.oponente1 = oponente1;
	}
	public Time getOponente2() {
		return oponente2;
	}
	public void setOponente2(Time oponente2) {
		this.oponente2 = oponente2;
	}
	public Time getVencedor() {
		return vencedor;
	}
	public void setVencedor(Time vencedor) {
		this.vencedor = vencedor;
	}
	public int getOponente1Placar() {
		return oponente1Placar;
	}
	public void setOponente1Placar(int oponente1Placar) {
		this.oponente1Placar = oponente1Placar;
	}
	public int getOponente2Placar() {
		return oponente2Placar;
	}
	public void setOponente2Placar(int oponente2Placar) {
		this.oponente2Placar = oponente2Placar;
	}*/
	
	

}
