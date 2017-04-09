package sistema.beans;

import java.util.List;

import sistema.modelos.Time;
import sistema.service.TimeService;

public class TimeManagedBean {
	
	
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
		time = new Time();
	}
	
	public List<Time> getTimes(){
		return service.getTimes();
	}
	
	
	

}
