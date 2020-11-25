package br.com.testecitel.ManageBean;

import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpSession;

import org.primefaces.event.FileUploadEvent;
import org.primefaces.model.UploadedFile;

import com.google.gson.Gson;

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
		return "resultado";
	}


}
