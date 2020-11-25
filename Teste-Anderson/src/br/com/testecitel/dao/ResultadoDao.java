package br.com.testecitel.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import br.com.testecitel.Connection.ConectionFactory;
import br.com.testecitel.Model.Resultado;

public class ResultadoDao {

	public Resultado salvar(Resultado resultado) {
		EntityManager manager;
		manager = ConectionFactory.getConnection();
		EntityTransaction tx = manager.getTransaction();
		tx.begin();
		resultado = manager.merge(resultado);
		tx.commit();
		manager.close();
		return resultado;
	}
}
