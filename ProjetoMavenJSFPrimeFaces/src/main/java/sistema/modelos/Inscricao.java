package sistema.modelos;

public class Inscricao {
	
	private Time time;
	private String comprovante;
	private boolean confirmacao;
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
	

}
