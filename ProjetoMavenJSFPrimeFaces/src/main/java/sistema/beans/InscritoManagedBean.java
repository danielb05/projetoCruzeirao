package sistema.beans;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import sistema.modelos.Inscrito;
import sistema.service.InscritoService;

@ManagedBean
@ViewScoped
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
	
	public String salvar(){
		
		service.salvar(Inscrito);
		if(Inscritos!=null)
			Inscritos.add(Inscrito);
		Inscrito = new Inscrito();
		return"inicio.xhtml";
		
	}
	

	
	 public List<Inscrito> getInscritos(){
		 return service.getInscritos();
	 }



	
	
}
