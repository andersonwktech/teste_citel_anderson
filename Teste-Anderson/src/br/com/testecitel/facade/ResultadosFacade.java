package br.com.testecitel.facade;

import br.com.testecitel.Model.Resultado;
import br.com.testecitel.dao.ResultadoDao;

public class ResultadosFacade {
	
	ResultadoDao resultadoDao;
	
	
	public Resultado salvar(Resultado resultado) {
		resultadoDao = new ResultadoDao();
		return resultadoDao.salvar(resultado);
	}

}
