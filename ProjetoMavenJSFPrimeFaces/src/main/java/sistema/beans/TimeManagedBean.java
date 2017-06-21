package sistema.beans;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import sistema.modelos.Time;
import sistema.modelos.Usuario;
import sistema.service.TimeService;
import sistema.service.UsuarioService;

@ManagedBean
@ViewScoped
public class TimeManagedBean {
	
	private UsuarioService usuarioservice = new UsuarioService();
	private List<Time> Times;
	public static Time timeAtual=new Time();
	
	public void setTimes(List<Time> times) {
		Times = times;
	}

	private TimeService service = new TimeService();
	private Time time = new Time();
	
	public Time getTime() {
		return time;
	}
	public void setTime(Time time) {
		this.time = time;
	}
	
	public void salvar(Usuario usuario){
		service.salvar(time);
		usuario.getTimes().add(time);
		usuario = usuarioservice.alterar(usuario);
		if(Times!=null)
			Times.add(time);
			
		time = new Time();
	}
	
	public List<Time> getTimes(){
		return service.getTimes();
	}
	public static Time getTimeAtual() {
		return timeAtual;
	}
	public static void setTimeAtual(Time timeAtual) {
		TimeManagedBean.timeAtual = timeAtual;
	}

	
	
	

}
