package Esercizio;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import Util.JpaUtil;

public class App {
	
	private static EntityManagerFactory emf = JpaUtil.getEntityManagerFactory();
	
	public static void main(String[] args) {
		
		EntityManager em = emf.createEntityManager();
	}

}
