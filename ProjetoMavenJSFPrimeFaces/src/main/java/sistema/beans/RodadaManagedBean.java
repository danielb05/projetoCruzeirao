package sistema.beans;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import sistema.modelos.Rodada;
import sistema.service.RodadaService;

@ManagedBean
@ViewScoped
public class RodadaManagedBean {
	
	private Rodada rodada = new Rodada();
	private RodadaService service = new RodadaService();
	private List<Rodada> Rodadas;
	public void salvar(){
		
		service.salvar(rodada);
		if(Rodadas!=null)
			Rodadas.add(rodada);
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
