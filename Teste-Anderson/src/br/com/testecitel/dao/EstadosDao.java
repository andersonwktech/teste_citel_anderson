package br.com.testecitel.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;

import br.com.testecitel.Connection.ConectionFactory;
import br.com.testecitel.Model.Estado;


public class EstadosDao {

	
	public Estado salvar(Estado estados) {
		EntityManager manager;
		manager = ConectionFactory.getConnection();
		EntityTransaction tx = manager.getTransaction();
		tx.begin();
		estados = manager.merge(estados);
		tx.commit();
		manager.close();
		return estados;
	}
}
