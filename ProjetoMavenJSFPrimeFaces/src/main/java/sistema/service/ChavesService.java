package sistema.service;

import java.util.List;

import sistema.dao.ChavesDAO;
import sistema.modelos.Chaves;

public class ChavesService {
	
	private ChavesDAO ChavesDAO = new ChavesDAO();
	public List<Chaves> getChaves() {		
		List <Chaves> Chaves = ChavesDAO.getAll(Chaves.class);
		ChavesDAO.closeEntityManager();
		return Chaves;
	}

	public void salvar(Chaves Chaves) {
		ChavesDAO.save(Chaves);
		ChavesDAO.closeEntityManager();
	}

	public void remover(Chaves Chaves) {
		ChavesDAO.remove(Chaves);
		ChavesDAO.closeEntityManager();
	}

	public void alterar(Chaves Chaves) {
		ChavesDAO.save(Chaves);
		ChavesDAO.closeEntityManager();
	}
}
