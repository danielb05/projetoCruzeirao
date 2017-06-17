package sistema.service;

import java.util.ArrayList;
import java.util.List;

import sistema.dao.PartidaDAO;
import sistema.modelos.Gol;
import sistema.modelos.Partida;
import sistema.modelos.Time;


public class PartidaService {
	private PartidaDAO PartidaDAO = new PartidaDAO();
	
	public List<Partida> getPartidas() {		
		List <Partida> Partidas = PartidaDAO.getAll(Partida.class);
		PartidaDAO.closeEntityManager();
		return Partidas;
	}
	
	public List<Partida> getCategorias() {		
		List <Partida> Partidas = PartidaDAO.getAll(Partida.class);
		PartidaDAO.closeEntityManager();
		return Partidas;
	}

	public void salvar(Partida partida) {
		PartidaDAO.save(partida);
		PartidaDAO.closeEntityManager();
	}

	public void remover(Partida partida) {
		PartidaDAO.remove(partida);
		PartidaDAO.closeEntityManager();
	}


	public void alterar(Partida partida) {
		PartidaDAO.save(partida);
		PartidaDAO.closeEntityManager();
	}
	
	public Partida pesquisar(Partida partida) {

		partida = PartidaDAO.getById(Partida.class, partida.getPartidaID());
		PartidaDAO.closeEntityManager();
		return partida;
	}

	
	

}
