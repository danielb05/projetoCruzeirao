package sistema.service;

import java.util.List;

import sistema.modelos.Cartao;
import sistema.dao.PartidaDAO;
import sistema.modelos.Gol;
import sistema.modelos.Partida;
import sistema.modelos.PartidaFutebol;
import sistema.dao.PartidaFutebolDAO;

public class PartidaFutebolService {

	private PartidaFutebolDAO PartidaFutebolDAO = new PartidaFutebolDAO();
	public List<Gol> pesquisarGolsMandantesPartida(PartidaFutebol partida) {

		List<Gol> gols;
		partida = PartidaFutebolDAO.getById(PartidaFutebol.class, partida.getPartidaFutebolID());
		gols = partida.getGolsMandante();
		return gols;
	}
	
	public List<Gol> pesquisarGolsVisitantesPartida(PartidaFutebol partida) {

		List<Gol> gols;
		partida = PartidaFutebolDAO.getById(PartidaFutebol.class, partida.getPartidaFutebolID());
		gols = partida.getGolsVisitante();
		return gols;
	}
	
	public List<Cartao> pesquisarCartoesMandantesPartida(PartidaFutebol partida) {

		List<Cartao> cartoes;
		partida = PartidaFutebolDAO.getById(PartidaFutebol.class, partida.getPartidaFutebolID());
		cartoes = partida.getCartoesMandante();
		return cartoes;
	}
	
	public List<Cartao> pesquisarCartoesVisitantesPartida(PartidaFutebol partida) {

		List<Cartao> cartoes;
		partida = PartidaFutebolDAO.getById(PartidaFutebol.class, partida.getPartidaFutebolID());
		cartoes = partida.getCartoesVisitante();
		return cartoes;
	}
	
	public List<Gol> pesquisarPenaltesMandantesPartida(PartidaFutebol partida) {

		List<Gol> gols;
		partida = PartidaFutebolDAO.getById(PartidaFutebol.class, partida.getPartidaFutebolID());
		gols = partida.getGolsPenaltesMandante();
		return gols;
	}
	
	public List<Gol> pesquisarPenaltesVisitantesPartida(PartidaFutebol partida) {

		List<Gol> gols;
		partida = PartidaFutebolDAO.getById(PartidaFutebol.class, partida.getPartidaFutebolID());
		gols = partida.getGolsPenaltesVisitante();
		return gols;
	}

}
