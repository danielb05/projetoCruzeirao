package sistema.beans;

import java.util.List;

import sistema.modelos.Juiz;
import sistema.service.JuizService;

public class JuizManagedBean {

	private Juiz Juiz = new Juiz();
	public Juiz getJuiz() {
		return Juiz;
	}



	public void setJuiz(Juiz juiz) {
		Juiz = juiz;
	}



	public void setJuizes(List<Juiz> juizes) {
		Juizes = juizes;
	}



	private JuizService service = new JuizService();
	private List<Juiz> Juizes;
	public void salvar(){
		
		service.salvar(Juiz);
		if(Juiz!=null)
			Juizes.add(Juiz);
		Juiz = new Juiz();
		
		
	}
	

	
	 public List<Juiz> getJuizes(){
		 return service.getJuizes();
	 }



	
}
