package sistema.service;

import java.util.ArrayList;
import java.util.List;

import sistema.dao.CampeonatoDAO;
import sistema.modelos.Campeonato;


public class CampeonatoService {
	

CampeonatoDAO campeonatoDAO = new CampeonatoDAO();
	
	public List<Campeonato> getCampeonatos()
	{
		List<Campeonato> list = campeonatoDAO.getAll(Campeonato.class);
		campeonatoDAO.closeEntityManager();
		return list;
	}
	
	public Campeonato salvar(Campeonato campeonato)
	{
		campeonato = campeonatoDAO.save(campeonato);
		campeonatoDAO.closeEntityManager();
		return campeonato;
	}
	
	public void remover(Campeonato campeonato)
	{
		campeonato = campeonatoDAO.getById(Campeonato.class, campeonato.getCampeonatoID());
		campeonatoDAO.remove(campeonato);
		campeonatoDAO.closeEntityManager();
	}

	public void alterar(Campeonato campeonato)
	{
		campeonatoDAO.save(campeonato);
		campeonatoDAO.closeEntityManager();
	}


}
