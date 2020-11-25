package br.com.testecitel.ManageBean;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;
import javax.faces.view.ViewScoped;
import javax.servlet.http.HttpSession;

import org.primefaces.model.UploadedFile;


import br.com.testecitel.Bean.DadosBean;
import br.com.testecitel.Bean.EstadosBean;
import br.com.testecitel.Model.Dados;
import br.com.testecitel.Model.Estado;
import br.com.testecitel.Model.Resultado;
import br.com.testecitel.facade.EstadosFacade;
import br.com.testecitel.facade.ResultadosFacade;
import br.com.testecitel.util.Formatacao;
import br.com.testecitel.util.Mensagem;

@ManagedBean
@ViewScoped
public class ResultadoMB implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Dados dados;
	private List<Dados> listaDados;
	private float imc10;
	private float imc20;
	private float imc30;
	private float imcMais;
	private int nImc10;
	private int nImc20;
	private int nImc30;
	private int nImcMais;
	private float mediaImc10;
	private float mediaImc20;
	private float mediaImc30;
	private float mediaImcMais;
	private int idadeAMais;
	private int nIdadeAMais;
	private int idadeAMenos;
	private int nIdadeAMenos;
	private int idadeBMais;
	private int nIdadeBMais;
	private int idadeBMenos;
	private int nIdadeBMenos;
	private int idadeABMais;
	private int nIdadeABMais;
	private int idadeABMenos;
	private int nIdadeABMenos;
	private int idadeOMais;
	private int nIdadeOMais;
	private int idadeOMenos;
	private int nIdadeOMenos;
	private int nDoadorAMais;
	private int nDoadorAMenos;
	private int nDoadorBMais;
	private int nDoadorBMenos;
	private int nDoadorABMais;
	private int nDoadorABMenos;
	private int nDoadorOMais;
	private int nDoadorOMenos;
	private int nHomemObeso;
	private int nMulherObesa;
	private float percentualHomem;
	private float percentualMulher;
	private int totalHomem;
	private int totalMulher;
	private String titulo;
	private UploadedFile file;
	private Estado estados;
	private String dadosJson;

	@PostConstruct
	public void init() {
		FacesContext fc = FacesContext.getCurrentInstance();
		HttpSession session = (HttpSession) fc.getExternalContext().getSession(false);
		dadosJson = (String) session.getAttribute("dadosJson");
		session.removeAttribute("dadosJson");
		instanciarVariaveis();
		estados = new Estado();
		capturarDados(dadosJson);
	}

	public Dados getDados() {
		return dados;
	}

	public void setDados(Dados dados) {
		this.dados = dados;
	}

	public List<Dados> getListaDados() {
		return listaDados;
	}

	public void setListaDados(List<Dados> listaDados) {
		this.listaDados = listaDados;
	}

	public float getImc10() {
		return imc10;
	}

	public void setImc10(float imc10) {
		this.imc10 = imc10;
	}

	public float getImc20() {
		return imc20;
	}

	public void setImc20(float imc20) {
		this.imc20 = imc20;
	}

	public float getImc30() {
		return imc30;
	}

	public void setImc30(float imc30) {
		this.imc30 = imc30;
	}

	public int getnImc10() {
		return nImc10;
	}

	public void setnImc10(int nImc10) {
		this.nImc10 = nImc10;
	}

	public int getnImc20() {
		return nImc20;
	}

	public void setnImc20(int nImc20) {
		this.nImc20 = nImc20;
	}

	public int getnImc30() {
		return nImc30;
	}

	public void setnImc30(int nImc30) {
		this.nImc30 = nImc30;
	}

	public float getImcMais() {
		return imcMais;
	}

	public void setImcMais(float imcMais) {
		this.imcMais = imcMais;
	}

	public int getnImcMais() {
		return nImcMais;
	}

	public void setnImcMais(int nImcMais) {
		this.nImcMais = nImcMais;
	}

	public float getMediaImc10() {
		return mediaImc10;
	}

	public void setMediaImc10(float mediaImc10) {
		this.mediaImc10 = mediaImc10;
	}

	public float getMediaImc20() {
		return mediaImc20;
	}

	public void setMediaImc20(float mediaImc20) {
		this.mediaImc20 = mediaImc20;
	}

	public float getMediaImc30() {
		return mediaImc30;
	}

	public void setMediaImc30(float mediaImc30) {
		this.mediaImc30 = mediaImc30;
	}

	public float getMediaImcMais() {
		return mediaImcMais;
	}

	public void setMediaImcMais(float mediaImcMais) {
		this.mediaImcMais = mediaImcMais;
	}

	public int getnIdadeAMais() {
		return nIdadeAMais;
	}

	public void setnIdadeAMais(int nIdadeAMais) {
		this.nIdadeAMais = nIdadeAMais;
	}

	public int getnIdadeAMenos() {
		return nIdadeAMenos;
	}

	public void setnIdadeAMenos(int nIdadeAMenos) {
		this.nIdadeAMenos = nIdadeAMenos;
	}

	public int getnIdadeBMais() {
		return nIdadeBMais;
	}

	public void setnIdadeBMais(int nIdadeBMais) {
		this.nIdadeBMais = nIdadeBMais;
	}

	public int getnIdadeBMenos() {
		return nIdadeBMenos;
	}

	public void setnIdadeBMenos(int nIdadeBMenos) {
		this.nIdadeBMenos = nIdadeBMenos;
	}

	public int getnIdadeABMais() {
		return nIdadeABMais;
	}

	public void setnIdadeABMais(int nIdadeABMais) {
		this.nIdadeABMais = nIdadeABMais;
	}

	public int getnIdadeABMenos() {
		return nIdadeABMenos;
	}

	public void setnIdadeABMenos(int nIdadeABMenos) {
		this.nIdadeABMenos = nIdadeABMenos;
	}

	public int getnIdadeOMais() {
		return nIdadeOMais;
	}

	public void setnIdadeOMais(int nIdadeOMais) {
		this.nIdadeOMais = nIdadeOMais;
	}

	public int getnIdadeOMenos() {
		return nIdadeOMenos;
	}

	public void setnIdadeOMenos(int nIdadeOMenos) {
		this.nIdadeOMenos = nIdadeOMenos;
	}

	public int getnDoadorAMais() {
		return nDoadorAMais;
	}

	public void setnDoadorAMais(int nDoadorAMais) {
		this.nDoadorAMais = nDoadorAMais;
	}

	public int getnDoadorAMenos() {
		return nDoadorAMenos;
	}

	public void setnDoadorAMenos(int nDoadorAMenos) {
		this.nDoadorAMenos = nDoadorAMenos;
	}

	public int getnDoadorBMais() {
		return nDoadorBMais;
	}

	public void setnDoadorBMais(int nDoadorBMais) {
		this.nDoadorBMais = nDoadorBMais;
	}

	public int getnDoadorBMenos() {
		return nDoadorBMenos;
	}

	public void setnDoadorBMenos(int nDoadorBMenos) {
		this.nDoadorBMenos = nDoadorBMenos;
	}

	public int getnDoadorABMais() {
		return nDoadorABMais;
	}

	public void setnDoadorABMais(int nDoadorABMais) {
		this.nDoadorABMais = nDoadorABMais;
	}

	public int getnDoadorABMenos() {
		return nDoadorABMenos;
	}

	public void setnDoadorABMenos(int nDoadorABMenos) {
		this.nDoadorABMenos = nDoadorABMenos;
	}

	public int getnDoadorOMais() {
		return nDoadorOMais;
	}

	public void setnDoadorOMais(int nDoadorOMais) {
		this.nDoadorOMais = nDoadorOMais;
	}

	public int getnDoadorOMenos() {
		return nDoadorOMenos;
	}

	public void setnDoadorOMenos(int nDoadorOMenos) {
		this.nDoadorOMenos = nDoadorOMenos;
	}

	public int getnHomemObeso() {
		return nHomemObeso;
	}

	public void setnHomemObeso(int nHomemObeso) {
		this.nHomemObeso = nHomemObeso;
	}

	public int getnMulherObesa() {
		return nMulherObesa;
	}

	public void setnMulherObesa(int nMulherObesa) {
		this.nMulherObesa = nMulherObesa;
	}

	public float getPercentualHomem() {
		return percentualHomem;
	}

	public void setPercentualHomem(float percentualHomem) {
		this.percentualHomem = percentualHomem;
	}

	public float getPercentualMulher() {
		return percentualMulher;
	}

	public void setPercentualMulher(float percentualMulher) {
		this.percentualMulher = percentualMulher;
	}

	public int getTotalHomem() {
		return totalHomem;
	}

	public void setTotalHomem(int totalHomem) {
		this.totalHomem = totalHomem;
	}

	public int getTotalMulher() {
		return totalMulher;
	}

	public void setTotalMulher(int totalMulher) {
		this.totalMulher = totalMulher;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public UploadedFile getFile() {
		return file;
	}

	public void setFile(UploadedFile file) {
		this.file = file;
	}

	public int getIdadeAMais() {
		return idadeAMais;
	}

	public void setIdadeAMais(int idadeAMais) {
		this.idadeAMais = idadeAMais;
	}

	public int getIdadeAMenos() {
		return idadeAMenos;
	}

	public void setIdadeAMenos(int idadeAMenos) {
		this.idadeAMenos = idadeAMenos;
	}

	public int getIdadeBMais() {
		return idadeBMais;
	}

	public void setIdadeBMais(int idadeBMais) {
		this.idadeBMais = idadeBMais;
	}

	public int getIdadeBMenos() {
		return idadeBMenos;
	}

	public void setIdadeBMenos(int idadeBMenos) {
		this.idadeBMenos = idadeBMenos;
	}

	public int getIdadeABMais() {
		return idadeABMais;
	}

	public void setIdadeABMais(int idadeABMais) {
		this.idadeABMais = idadeABMais;
	}

	public int getIdadeABMenos() {
		return idadeABMenos;
	}

	public void setIdadeABMenos(int idadeABMenos) {
		this.idadeABMenos = idadeABMenos;
	}

	public int getIdadeOMais() {
		return idadeOMais;
	}

	public void setIdadeOMais(int idadeOMais) {
		this.idadeOMais = idadeOMais;
	}

	public int getIdadeOMenos() {
		return idadeOMenos;
	}

	public void setIdadeOMenos(int idadeOMenos) {
		this.idadeOMenos = idadeOMenos;
	}

	public Estado getEstados() {
		return estados;
	}

	public void setEstados(Estado estados) {
		this.estados = estados;
	}

	public void capturarDados(String dadosJson) {
		listaDados = DadosBean.popularDados();
		for (int i = 0; i < listaDados.size(); i++) {
			calcularDados(listaDados.get(i));
		}
		if (imc10 > 0.0f && nImc10 > 0) {
			mediaImc10 = imc10 / nImc10;
		}
		if (imc20 > 0.0f && nImc20 > 0) {
			mediaImc20 = imc20 / nImc20;
		}
		if (imc30 > 0.0f && nImc30 > 0) {
			mediaImc30 = imc30 / nImc30;
		}
		if (imcMais > 0.0f && nImcMais > 0) {
			mediaImcMais = imcMais / nImcMais;
		}
		if (idadeAMais > 0 && nIdadeAMais > 0) {
			idadeAMais = idadeAMais / nIdadeAMais;
		}
		if (idadeAMenos > 0 && nIdadeAMenos > 0) {
			idadeAMenos = idadeAMenos / nIdadeAMenos;
		}
		if (idadeBMais > 0 && nIdadeBMais > 0) {
			idadeBMais = idadeBMais / nIdadeBMais;
		}
		if (idadeBMenos > 0 && nIdadeBMenos > 0) {
			idadeBMenos = idadeBMenos / nIdadeBMenos;
		}
		if (idadeABMais > 0 && nIdadeABMais > 0) {
			idadeABMais = idadeABMais / nIdadeABMais;
		}
		if (idadeABMenos > 0 && nIdadeABMenos > 0) {
			idadeABMenos = idadeABMenos / nIdadeABMenos;
		}
		if (idadeOMais > 0 && nIdadeOMais > 0) {
			idadeOMais = idadeOMais / nIdadeOMais;
		}
		if (idadeOMenos > 0 && nIdadeOMenos > 0) {
			idadeOMenos = idadeOMenos / nIdadeOMenos;
		}
		if (nHomemObeso > 0 && totalHomem > 0) {
			percentualHomem = (nHomemObeso * 100) / listaDados.size();
		}
		if (nMulherObesa > 0 && totalMulher > 0) {
			percentualMulher = (nMulherObesa * 100) / listaDados.size();
		}
	}

	public void calcularDados(Dados dados) {
		Date dataNascimento = Formatacao.ConvercaoStringDataBrasil(dados.getData_nasc());
		int idade = Formatacao.getIdade(dataNascimento);
		float imc = dados.getPeso() / (dados.getAltura() * 2);
		if (idade <= 10) {
			imc10 = imc10 + imc;
			nImc10 = nImc10 + 1;
		} else if (idade > 10 && idade <= 20) {
			imc20 = imc20 + imc;
			nImc20 = nImc20 + 1;
		} else if (idade > 20 && idade <= 30) {
			imc30 = imc30 + imc;
			nImc30 = nImc30 + 1;
		} else {
			imcMais = imcMais + imc;
			nImcMais = nImcMais + 1;
		}
		if (dados.getSexo().equalsIgnoreCase("Masculino")) {
			if (imc >= 30) {
				nHomemObeso = nHomemObeso + 1;
				totalHomem = totalHomem + 1;
			}
		} else if (dados.getSexo().equalsIgnoreCase("Feminino")) {
			if (imc >= 30) {
				nMulherObesa = nMulherObesa + 1;
				totalMulher = totalMulher + 1;
			}
		}
		if (dados.getTipo_sanguineo().equalsIgnoreCase("A+")) {
			idadeAMais = idadeAMais + idade;
			nIdadeAMais = nIdadeAMais + 1;
			if (idade >= 16 && idade <= 69 && dados.getPeso() > 50f) {
				nDoadorAMais = nDoadorAMais + 1;
			}
		} else if (dados.getTipo_sanguineo().equalsIgnoreCase("A-")) {
			idadeAMenos = idadeAMenos + idade;
			nIdadeAMenos = nIdadeAMenos + 1;
			if (idade >= 16 && idade <= 69 && dados.getPeso() > 50f) {
				nDoadorAMenos = nDoadorAMenos + 1;
			}
		} else if (dados.getTipo_sanguineo().equalsIgnoreCase("B+")) {
			idadeBMais = idadeBMais + idade;
			nIdadeBMais = nIdadeBMais + 1;
			if (idade >= 16 && idade <= 69 && dados.getPeso() > 50f) {
				nDoadorBMais = nDoadorBMais + 1;
			}
		} else if (dados.getTipo_sanguineo().equalsIgnoreCase("B-")) {
			idadeBMenos = idadeBMenos + idade;
			nIdadeBMenos = nIdadeBMenos + 1;
			if (idade >= 16 && idade <= 69 && dados.getPeso() > 50f) {
				nDoadorBMenos = nDoadorBMenos + 1;
			}
		} else if (dados.getTipo_sanguineo().equalsIgnoreCase("AB+")) {
			idadeABMais = idadeABMais + idade;
			nIdadeABMais = nIdadeABMais + 1;
			if (idade >= 16 && idade <= 69 && dados.getPeso() > 50f) {
				nDoadorABMais = nDoadorABMais + 1;
			}
		} else if (dados.getTipo_sanguineo().equalsIgnoreCase("AB-")) {
			idadeABMenos = idadeABMenos + idade;
			nIdadeABMenos = nIdadeABMenos + 1;
			if (idade >= 16 && idade <= 69 && dados.getPeso() > 50f) {
				nDoadorABMenos = nDoadorABMenos + 1;
			}
		} else if (dados.getTipo_sanguineo().equalsIgnoreCase("O+")) {
			idadeOMais = idadeOMais + idade;
			nIdadeOMais = nIdadeOMais + 1;
			if (idade >= 16 && idade <= 69 && dados.getPeso() > 50f) {
				nDoadorOMais = nDoadorOMais + 1;
			}
		} else if (dados.getTipo_sanguineo().equalsIgnoreCase("O-")) {
			idadeOMenos = idadeOMenos + idade;
			nIdadeOMenos = nIdadeOMenos + 1;
			if (idade >= 16 && idade <= 69 && dados.getPeso() > 50f) {
				nDoadorOMenos = nDoadorOMenos + 1;
			}
		}
		calcularNCandidatos(dados.getEstado());
	}

	public void instanciarVariaveis() {
		imc10 = 0.0f;
		imc20 = 0.0f;
		imc30 = 0.0f;
		imcMais = 0.0f;
		mediaImc10 = 0.0f;
		mediaImc20 = 0.0f;
		mediaImc30 = 0.0f;
		mediaImcMais = 0.0f;
		percentualHomem = 0.0f;
		percentualMulher = 0.0f;
	}
	
	
	public void calcularNCandidatos(String estadoCandidato) {
		estados = EstadosBean.adicionarCandidato(estados, estadoCandidato);
	}
	
	
	public String refazer() {
		return "index";
	}
	 
	 
	public void salvarResultado() {
		EstadosFacade estadosFacade = new EstadosFacade();
		
		estados = estadosFacade.salvar(estados);
		Resultado resultado = new Resultado();
		resultado.setEstados(estados);
		resultado.setIdadeabmais(idadeABMais);
		resultado.setIdadeabmenos(idadeABMenos);
		resultado.setIdadeamais(idadeAMais);
		resultado.setIdadeamenos(idadeAMenos);
		resultado.setIdadebmais(idadeBMais);
		resultado.setIdadebmenos(idadeBMenos);
		resultado.setIdadeomais(idadeOMais);
		resultado.setIdadeomenos(idadeOMenos);
		resultado.setMediaimc10(mediaImc10);
		resultado.setMediaimc20(mediaImc20);
		resultado.setMediaimc30(mediaImc30);
		resultado.setMediaimcmais(mediaImcMais);
		resultado.setNdoadorabmais(nDoadorABMais);
		resultado.setNdoadorabmenos(nDoadorABMenos);
		resultado.setNdoadoramais(nDoadorAMais);
		resultado.setNdoadoramenos(nDoadorAMenos);
		resultado.setNdoadorbmais(nDoadorBMais);
		resultado.setNdoadorbmenos(nDoadorBMenos);
		resultado.setNdoadoromais(nDoadorOMais);
		resultado.setNdoadoromenos(nDoadorOMenos);
		ResultadosFacade resultadosFacade = new ResultadosFacade();
		resultado = resultadosFacade.salvar(resultado);
		Mensagem.lancarMensagemInfo("Salvo com Sucesso", "");
	}
	

}
