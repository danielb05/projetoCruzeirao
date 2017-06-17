package sistema.service;

import java.util.List;

import sistema.dao.GrupoDAO;
import sistema.modelos.Grupo;

public class GrupoService {

private GrupoDAO GrupoDAO = new GrupoDAO();
	
	public List<Grupo> getGrupos() {		
		List <Grupo> Grupos = GrupoDAO.getAll(Grupo.class);
		GrupoDAO.closeEntityManager();
		return Grupos;
	}

	public void salvar(Grupo Grupo) {
		GrupoDAO.save(Grupo);
		GrupoDAO.closeEntityManager();
	}

	public void remover(Grupo Grupo) {
		GrupoDAO.remove(Grupo);
		GrupoDAO.closeEntityManager();
	}

	public void alterar(Grupo Grupo) {
		GrupoDAO.save(Grupo);
		GrupoDAO.closeEntityManager();
	}
	
}
