package sistema.beans;

import java.util.ArrayList;
import java.util.List;

import sistema.modelos.Inscrito;
import sistema.service.InscritoService;

public class InscritoManagedBean {

	private Inscrito Inscrito = new Inscrito();
	public Inscrito getInscrito() {
		return Inscrito;
	}



	public void setInscrito(Inscrito inscrito) {
		Inscrito = inscrito;
	}



	public void setInscritos(List<Inscrito> inscritos) {
		Inscritos = inscritos;
	}



	private InscritoService service = new InscritoService();
	private List<Inscrito> Inscritos = new ArrayList<Inscrito>();
	public void salvar(Inscrito inscrito){
		
		service.salvar(inscrito);
		if(Inscritos!=null)
			Inscritos.add(inscrito);
		Inscrito = new Inscrito();
		
		
	}
	

	
	 public List<Inscrito> getInscritos(){
		 return service.getInscritos();
	 }



	
	
}
