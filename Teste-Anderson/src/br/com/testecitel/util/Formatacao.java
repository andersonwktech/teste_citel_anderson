/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.testecitel.util;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;



/**
 *
 * @author Woverine
 */
public class Formatacao {

	public static Integer getIdade(Date data_nasc) {
		GregorianCalendar hj = new GregorianCalendar();
		GregorianCalendar nascimento = new GregorianCalendar();
		if (data_nasc != null) {
			nascimento.setTime(data_nasc);
		}
		int anohj = hj.get(Calendar.YEAR);
		int anoNascimento = nascimento.get(Calendar.YEAR);
		return new Integer(anohj - anoNascimento);
	}
	
	
	public static Date ConvercaoStringData(String data) {
        DateFormat df = new SimpleDateFormat("yyyy-MM-dd");
        Date dataFormatada = null;
        try {
            dataFormatada = df.parse(data);
        } catch (ParseException ex) {
            Logger.getLogger(Formatacao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return dataFormatada;
    }
	
	
	public static Date ConvercaoStringDataBrasil(String data) {
        DateFormat df = new SimpleDateFormat("dd/MM/yyyy");
        Date dataFormatada = null;
        try {
            dataFormatada = df.parse(data);
        } catch (ParseException ex) {
            Logger.getLogger(Formatacao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return dataFormatada;
    }
}
