package sistema.service;

import java.util.ArrayList;
import java.util.List;

import sistema.modelos.Time;
import sistema.modelos.Usuario;
import sistema.dao.TimeDAO;
public class TimeService {
	
private TimeDAO TimeDAO = new TimeDAO();
	
	public List<Usuario> getDiretoresTime(Time Time) {
		List <Usuario> list = TimeDAO.getDiretoresTime(Time);
		TimeDAO.closeEntityManager();
		return list;
	}
		
	public List<Time> getTimes() {		
		List <Time> Times = TimeDAO.getAll(Time.class);
		TimeDAO.closeEntityManager();
		return Times;
	}

	public void salvar(Time Time) {
		TimeDAO.save(Time);
		TimeDAO.closeEntityManager();
	}

	public void remover(Time Time) {
		TimeDAO.remove(Time);
		TimeDAO.closeEntityManager();
	}


	public void alterar(Time Time) {
		TimeDAO.save(Time);
		TimeDAO.closeEntityManager();
	}
	
	public Time pesquisar(Time Time) {

		Time = TimeDAO.getById(Time.class, Time.getTimeID());
		TimeDAO.closeEntityManager();
		return Time;
	}
	
	

}
