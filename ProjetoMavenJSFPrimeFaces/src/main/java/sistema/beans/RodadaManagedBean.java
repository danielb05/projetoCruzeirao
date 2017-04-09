package sistema.beans;

import java.util.List;

import sistema.modelos.Rodada;
import sistema.service.RodadaService;

public class RodadaManagedBean {
	
	private Rodada rodada = new Rodada();
	private RodadaService service = new RodadaService();
	
	public void salvar(){
		
		service.salvar(rodada);
		rodada = new Rodada();
		
		
	}
	

	
	 public List<Rodada> getRodadas(){
		 return service.getRodadas();
	 }



	public Rodada getRodada() {
		return rodada;
	}



	public void setRodada(Rodada rodada) {
		this.rodada = rodada;
	}
	

}
