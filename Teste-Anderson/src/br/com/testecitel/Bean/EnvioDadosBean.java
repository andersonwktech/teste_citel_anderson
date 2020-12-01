package br.com.testecitel.Bean;

import java.util.List;

import br.com.testecitel.Model.Dados;

public class EnvioDadosBean {

	private String titulo;
	private List<Dados> lista;
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	public List<Dados> getLista() {
		return lista;
	}
	public void setLista(List<Dados> lista) {
		this.lista = lista;
	}
	
	
	
}
