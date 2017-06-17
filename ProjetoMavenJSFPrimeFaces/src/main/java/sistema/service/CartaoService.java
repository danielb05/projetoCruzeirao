package sistema.service;

import java.util.List;

import sistema.dao.CartaoDAO;
import sistema.modelos.Cartao;

public class CartaoService {

private CartaoDAO dao = new CartaoDAO();
	
	public List<Cartao> getCartoes() {		
		List <Cartao> list = dao.getAll(Cartao.class);
		dao.closeEntityManager();
		return list;
	}

	public void salvar(Cartao cartao) {
		dao.save(cartao);
		dao.closeEntityManager();
	}

	public void remover(Cartao cartao) {
		dao.remove(cartao);
		dao.closeEntityManager();
	}

	public void alterar(Cartao cartao) {
		dao.save(cartao);
		dao.closeEntityManager();
	}
}
