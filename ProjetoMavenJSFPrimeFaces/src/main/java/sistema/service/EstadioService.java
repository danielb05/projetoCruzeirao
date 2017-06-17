package sistema.service;

import java.util.ArrayList;
import java.util.List;

import sistema.modelos.Estadio;

import sistema.dao.EstadioDAO;


public class EstadioService {
	
private EstadioDAO EstadioDao = new EstadioDAO();
	
	public List<Estadio> getLocais() {		
		List <Estadio> list = EstadioDao.getAll(Estadio.class);
		EstadioDao.closeEntityManager();
		return list;
	}

	public void salvar(Estadio Estadio) {
		EstadioDao.save(Estadio);
		EstadioDao.closeEntityManager();
	}

	public void remover(Estadio Estadio) {
		EstadioDao.remove(Estadio);
		EstadioDao.closeEntityManager();
	}

	public void alterar(Estadio Estadio) {
		EstadioDao.save(Estadio);
		EstadioDao.closeEntityManager();
	}
	
	

}
