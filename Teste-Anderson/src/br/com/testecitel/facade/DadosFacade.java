package br.com.testecitel.facade;

import java.util.List;

import br.com.testecitel.Model.Dados;
import br.com.testecitel.dao.DadosDao;


public class DadosFacade {
	
	DadosDao dadosDao;
	
	
	public List<Dados> listar(String sql) {
		dadosDao = new DadosDao();
		return dadosDao.lista(sql);
	}

}
