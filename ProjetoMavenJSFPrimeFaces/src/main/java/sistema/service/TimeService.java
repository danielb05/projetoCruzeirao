package sistema.service;

import java.util.ArrayList;

import sistema.modelos.Time;


public class TimeService {
	
	private ArrayList<Time> times = new ArrayList<Time>();
	
	public TimeService(){
		
	}
	
	public void salvar(Time time){
		times.add(time);
	}

	public ArrayList<Time> getTimes() {
		return times;
	}
	
	

}
