package sistema.beans;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import sistema.modelos.Inscricao;
import sistema.modelos.Inscrito;
import sistema.modelos.Inscrito.Tipo;
import sistema.modelos.Time;
import sistema.modelos.Usuario;
import sistema.service.InscricaoService;
@ManagedBean
@ViewScoped

public class InscricaoManagedBean {

	private Inscricao Inscricao = new Inscricao();
	private Inscrito Tecnico = new Inscrito();
	private Inscrito Massagista = new Inscrito();
	private Inscrito Diretor = new Inscrito();
	private Inscrito Personal = new Inscrito();
	private ArrayList<Inscrito> Jogadores = new ArrayList<>();
	private InscritoManagedBean inscritosMB = new InscritoManagedBean();

	public Inscricao getInscricao() {
		return Inscricao;
	}

	public void setInscricao(Inscricao inscricao) {
		Inscricao = inscricao;
	}



	private InscricaoService service = new InscricaoService();
	private List<Inscricao> Inscricoes;
	public void salvar(){
		ArrayList<Inscrito> inscritos = new ArrayList<Inscrito>();
		Tipo tipo = null;
		Tecnico.setTipo(tipo.TECNICO);
		inscritos.add(Tecnico);
		Diretor.setTipo(tipo.DIRETOR);
		inscritos.add(Diretor);
		Massagista.setTipo(tipo.MASSAGISTA);
		inscritos.add(Massagista);
		Personal.setTipo(tipo.PERSONAL);
		inscritos.add(Personal);
		for(Inscrito i: inscritos){
			inscritosMB.salvar(i);
		}
		Inscricao.setInscritos(inscritos);
		service.salvar(Inscricao);
		if(Inscricoes!=null)
			Inscricoes.add(Inscricao);
		Inscricao = new Inscricao();
		Tecnico = new Inscrito();
		Massagista = new Inscrito();
		Diretor = new Inscrito();
		Personal = new Inscrito();
		
		
	}
	public List<Time> aceiteTimes(Usuario usuario){
		ArrayList<Inscrito> inscricoesUsuario = new ArrayList<Inscrito>();
		ArrayList<Time> timesUsuario = new ArrayList<Time>();
		for(Inscrito i: inscritosMB.getInscritos())
			if(i.getUsuario().equals(usuario))
				inscricoesUsuario.add(i);
		for(Inscricao a: Inscricoes)
			if(a.UsuarioInscritos(usuario, a.getInscritos()))
				timesUsuario.add(a.getTime());
		return timesUsuario;
	}
	
	
	 public List<Inscricao> getInscricoes(){
		 return service.getInscricoes();
	 }

	public ArrayList<Inscrito> getJogadores() {
		return Jogadores;
	}

	public void setJogadores(ArrayList<Inscrito> jogadores) {
		Jogadores = jogadores;
	}
	 
}