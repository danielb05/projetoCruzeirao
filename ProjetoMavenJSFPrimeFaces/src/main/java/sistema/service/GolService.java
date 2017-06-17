package sistema.service;

import java.util.List;

import sistema.dao.GolDAO;
import sistema.modelos.Gol;


public class GolService {

private GolDAO GolDAO = new GolDAO();
	
	public List<Gol> getGols() {		
		List <Gol> Gols = GolDAO.getAll(Gol.class);
		GolDAO.closeEntityManager();
		return Gols;
	}

	public void salvar(Gol Gol) {
		GolDAO.save(Gol);
		GolDAO.closeEntityManager();
	}

	public void remover(Gol Gol) {
		GolDAO.remove(Gol);
		GolDAO.closeEntityManager();
	}

	public void alterar(Gol Gol) {
		GolDAO.save(Gol);
		GolDAO.closeEntityManager();
	}
}
