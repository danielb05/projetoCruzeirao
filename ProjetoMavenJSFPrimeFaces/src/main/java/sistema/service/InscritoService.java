package sistema.service;

import java.util.List;

import sistema.modelos.Inscrito;
import sistema.dao.InscritoDAO;
public class InscritoService {

private InscritoDAO InscritoDAO = new InscritoDAO();
	
	public List<Inscrito> getInscritos() {		
		List <Inscrito> Inscritos = InscritoDAO.getAll(Inscrito.class);
		InscritoDAO.closeEntityManager();
		return Inscritos;
	}

	public void salvar(Inscrito Inscrito) {
		InscritoDAO.save(Inscrito);
		InscritoDAO.closeEntityManager();
	}

	public void remover(Inscrito Inscrito) {
		InscritoDAO.remove(Inscrito);
		InscritoDAO.closeEntityManager();
	}

	public void alterar(Inscrito Inscrito) {
		InscritoDAO.save(Inscrito);
		InscritoDAO.closeEntityManager();
	}
	
}
