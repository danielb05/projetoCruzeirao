package sistema.service;

import java.util.List;

import sistema.modelos.Juiz;
import sistema.dao.JuizDAO;

public class JuizService {
private JuizDAO JuizDAO = new JuizDAO();
	
	public List<Juiz> getJuizes() {		
		List <Juiz> Juizes = JuizDAO.getAll(Juiz.class);
		JuizDAO.closeEntityManager();
		return Juizes;
	}

	public void salvar(Juiz Juiz) {
		JuizDAO.save(Juiz);
		JuizDAO.closeEntityManager();
	}

	public void remover(Juiz Juiz) {
		JuizDAO.remove(Juiz);
		JuizDAO.closeEntityManager();
	}

	public void alterar(Juiz Juiz) {
		JuizDAO.save(Juiz);
		JuizDAO.closeEntityManager();
	}
	
	
	
}
