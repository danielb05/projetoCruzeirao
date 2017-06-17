package sistema.beans;

import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import sistema.modelos.Time;
import sistema.service.TimeService;

@ManagedBean
@ViewScoped
public class TimeManagedBean {
	
	
	private List<Time> Times;
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
	
	public void salvar(){
		service.salvar(time);
		if(Times!=null)
			Times.add(time);
			
		time = new Time();
	}
	
	public List<Time> getTimes(){
		return service.getTimes();
	}
	
	
	

}
