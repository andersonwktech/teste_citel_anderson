package br.com.testecitel.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import br.com.testecitel.Connection.ConectionFactory;
import br.com.testecitel.Model.Dados;


public class DadosDao {

	@SuppressWarnings("unchecked")
	public List<Dados> lista(String sql) {
		EntityManager manager;
		manager = ConectionFactory.getConnection();
		Query q = manager.createQuery(sql);
		List<Dados> lista = q.getResultList();
		manager.close();
		return lista;
	}
}
