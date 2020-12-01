package br.com.testecitel.ManageBean;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.ProtocolException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Base64;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;

import org.primefaces.event.FileUploadEvent;
import org.primefaces.model.UploadedFile;

import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;

import br.com.testecitel.Bean.DadosBean;
import br.com.testecitel.Bean.EnvioDadosBean;
import br.com.testecitel.Model.Dados;
import br.com.testecitel.facade.DadosFacade;

@ManagedBean
@SessionScoped
public class IndexMB implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private File file;
	private String dadosJson;

	@PostConstruct
	public void init() {
	}

	public File getFile() {
		return file;
	}

	public void setFile(File file) {
		this.file = file;
	}

	public String resultado() {
		pegarListaVendasSystm();
		return "resultado";
	}

	public void pegarListaVendasSystm() {
		URL url = null;
		String endereco;
		
		Gson gson = new Gson();
		List<Dados> lista = DadosBean.popularDados();
		EnvioDadosBean envioDadosBean = new EnvioDadosBean();
		envioDadosBean.setTitulo("teste");
		envioDadosBean.setLista(lista);
		dadosJson = gson.toJson(envioDadosBean);
	//	dadosJson = new String(Base64.getDecoder().decode(dadosJson));
		endereco = "http://localhost:8090/listarDados?dados=" + dadosJson;
		try {
			url = new URL(endereco);
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}

		HttpURLConnection con = null;
		try {
			con = (HttpURLConnection) url.openConnection();
		} catch (IOException e) {
			e.printStackTrace();
		} 
		try {
			con.setRequestMethod("GET");
		} catch (ProtocolException e) {
			e.printStackTrace();
		}
		con.setRequestProperty("Accept", "application/json");
		

		BufferedReader br = null;
		try {
			br = new BufferedReader(new InputStreamReader((con.getInputStream())));

			gson = new Gson();
			JsonReader j = new JsonReader(br);
			j.setLenient(true);
			String resultado = gson.fromJson(j, String.class);
			br.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		con.disconnect();

	}

}
