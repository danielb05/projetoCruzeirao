package sistema.service;

import java.util.List;

import sistema.dao.FaseDAO;
import sistema.modelos.Fase;

public class FaseService {
private FaseDAO FaseDAO = new FaseDAO();
	
	public List<Fase> getFases() {		
		List <Fase> Fases = FaseDAO.getAll(Fase.class);
		FaseDAO.closeEntityManager();
		return Fases;
	}

	public void salvar(Fase Fase) {
		FaseDAO.save(Fase);
		FaseDAO.closeEntityManager();
	}

	public void remover(Fase Fase) {
		FaseDAO.remove(Fase);
		FaseDAO.closeEntityManager();
	}

	public void alterar(Fase Fase) {
		FaseDAO.save(Fase);
		FaseDAO.closeEntityManager();
	}
}
