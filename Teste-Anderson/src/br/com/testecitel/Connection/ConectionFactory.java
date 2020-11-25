 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.testecitel.Connection;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.swing.JOptionPane;



public class ConectionFactory {

    private static EntityManager manager;
    

    public static EntityManager getConnection() {
    	EntityManagerFactory emf = null;
        manager = null;
        
        emf = Persistence.createEntityManagerFactory("testecitelllPU");
        manager = emf.createEntityManager();
        if (!manager.isOpen()) {
        	JOptionPane.showMessageDialog(null, "Conex�o fechada");
        }
        return manager;
    }
    
  
}