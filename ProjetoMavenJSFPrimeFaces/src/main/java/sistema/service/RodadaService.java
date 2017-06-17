package sistema.service;
import java.util.ArrayList;
import java.util.List;

import sistema.modelos.Rodada;

import sistema.dao.RodadaDAO;
public class RodadaService {
	
private RodadaDAO RodadaDAO = new RodadaDAO();
	
	public List<Rodada> getRodadas() {		
		List <Rodada> Rodadas = RodadaDAO.getAll(Rodada.class);
		RodadaDAO.closeEntityManager();
		return Rodadas;
	}

	public void salvar(Rodada Rodada) {
		RodadaDAO.save(Rodada);
		RodadaDAO.closeEntityManager();
	}

	public void remover(Rodada Rodada) {
		RodadaDAO.remove(Rodada);
		RodadaDAO.closeEntityManager();
	}

	public void alterar(Rodada Rodada) {
		RodadaDAO.save(Rodada);
		RodadaDAO.closeEntityManager();
	}
	

}
