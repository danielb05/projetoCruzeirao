package sistema.beans;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import sistema.modelos.Inscricao;
import sistema.service.InscricaoService;
@ManagedBean
@ViewScoped

public class InscricaoManagedBean {

	private Inscricao Inscricao = new Inscricao();
	public Inscricao getInscricao() {
		return Inscricao;
	}



	public void setInscricao(Inscricao inscricao) {
		Inscricao = inscricao;
	}



	private InscricaoService service = new InscricaoService();
	private List<Inscricao> Inscricoes;
	public void salvar(){
		
		service.salvar(Inscricao);
		if(Inscricoes!=null)
			Inscricoes.add(Inscricao);
		Inscricao = new Inscricao();
		
		
	}
	

	
	 public List<Inscricao> getInscricoes(){
		 return service.getInscricoes();
	 }
	 
}