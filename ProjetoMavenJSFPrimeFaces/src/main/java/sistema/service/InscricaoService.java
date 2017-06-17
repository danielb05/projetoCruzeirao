package sistema.service;

import java.util.List;

import sistema.modelos.Inscricao;
import sistema.dao.InscricaoDAO;

public class InscricaoService {

private InscricaoDAO InscricaoDAO = new InscricaoDAO();
	
	public List<Inscricao> getInscricoes() {		
		List <Inscricao> Inscricoes = InscricaoDAO.getAll(Inscricao.class);
		InscricaoDAO.closeEntityManager();
		return Inscricoes;
	}

	public void salvar(Inscricao Inscricao) {
		InscricaoDAO.save(Inscricao);
		InscricaoDAO.closeEntityManager();
	}

	public void remover(Inscricao Inscricao) {
		InscricaoDAO.remove(Inscricao);
		InscricaoDAO.closeEntityManager();
	}

	public void alterar(Inscricao Inscricao) {
		InscricaoDAO.save(Inscricao);
		InscricaoDAO.closeEntityManager();
	}
}
