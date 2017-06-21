package sistema.beans;
import sistema.service.CategoriaService;


import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import org.primefaces.event.RowEditEvent;

import sistema.modelos.Campeonato;
import sistema.modelos.Categoria;
import sistema.modelos.Time;
import sistema.service.CampeonatoService;

@ManagedBean
@ViewScoped
public class CampeonatoManagedBean {
	
	private Campeonato campeonato = new Campeonato();
	private List<Campeonato> campeonatos;
	private List<Campeonato> campeonatosAtivos = new ArrayList<Campeonato>();
	private List<Campeonato> campeonatosTerminados = new ArrayList<Campeonato>();
	private CampeonatoService service = new CampeonatoService();
	private CategoriaService CategoriaService = new CategoriaService();
	private static Campeonato campeonatoAtual = new Campeonato();
	
	public String salvar(){
		service.salvar(campeonato);
		
		if(campeonatos != null)
			campeonatos.add(campeonato);
		
		campeonato = new Campeonato();
		return"infoCampeonato.xhtml";
	}
	
	// Edição de um aluno na tabela
	public void onRowEdit(RowEditEvent event)
	{
		Campeonato c = ((Campeonato) event.getObject());
		service.alterar(c);
	}
	
	/*public List<Campeonato> getCampeonatos(){
		return service.getCampeonatos();
	}*/
	
	public List<Categoria> getCategorias(){
	
		return CategoriaService.getCategorias();
		

		
	}
	
	public List<Campeonato> getCampeonatos()
	{
		if(campeonatos == null)
			campeonatos = service.getCampeonatos();
		return campeonatos;
	}
	
	public void remover(Campeonato campeonato)
	{
		service.remover(campeonato);
		campeonatos.remove(campeonato);
	}
	
	public void addTime(Time time)
	{
		
	}
	//Getters & Setters
	public Campeonato getCampeonato() {
		return campeonato;
	}

	public void setCampeonato(Campeonato campeonato) {
		this.campeonato = campeonato;
	}
		
	public String getData(Date data) {
	        String dataFormatada = new SimpleDateFormat("dd/MM/yyyy").format(data);
	        
	        //System.out.println(dataFormatada);
	        return dataFormatada;
	    }

	public Campeonato getCampeonatoAtual() {
		return campeonatoAtual;
	}

	public String setCampeonatoAtual(Campeonato campeonatoAtual, int i) {
		this.campeonatoAtual = campeonatoAtual;
		if(i==1)
		return"infoCampeonato.xhtml";
		return"cadastroTimeCampeonato.xhtml";
	}

	public List<Campeonato> getCampeonatosAtivos() {
		Date localDate = new Date();
		if(campeonatos == null)
			campeonatos = service.getCampeonatos();
		for (Campeonato c : campeonatos) {
			if(c.getFimCampeonato().after(localDate))
				campeonatosTerminados.add(c);
		}
		return campeonatosAtivos;
	}

	public void setCampeonatosAtivos(List<Campeonato> campeonatosAtivos) {
		this.campeonatosAtivos = campeonatosAtivos;
	}

	public List<Campeonato> getCampeonatosTerminados() {
		Date localDate = new Date();
		if(campeonatos == null)
			campeonatos = service.getCampeonatos();
		for (Campeonato c : campeonatos) {
			if(c.getFimCampeonato().before(localDate))
				campeonatosTerminados.add(c);
		}
		return campeonatosTerminados;
	}
	

	public void setCampeonatosTerminados(List<Campeonato> campeonatosTerminados) {
		this.campeonatosTerminados = campeonatosTerminados;
	}

	
}
