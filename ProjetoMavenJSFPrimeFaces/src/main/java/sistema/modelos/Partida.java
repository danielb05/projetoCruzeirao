package sistema.modelos;

public class Partida {
	
	private Estadio estadio;
	private String horario;
	private Time oponente1;
	private Time oponente2;
	private Time vencedor;
	private int oponente1Placar;
	private int oponente2Placar;
	public Estadio getEstadio() {
		return estadio;
	}
	public void setEstadio(Estadio estadio) {
		this.estadio = estadio;
	}
	public String getHorario() {
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
	}
	
	

}
