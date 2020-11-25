package br.com.testecitel.facade;

import br.com.testecitel.Model.Estado;
import br.com.testecitel.dao.EstadosDao;

public class EstadosFacade {

	EstadosDao estadosDao;
	
	
	public Estado salvar(Estado estados) {
		estadosDao = new EstadosDao();
		return estadosDao.salvar(estados);
	}
}
