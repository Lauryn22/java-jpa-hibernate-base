
package fr.m2i.java.jpa.hibernate.helper;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class SessionHelper {
    
    private static EntityManager entityManager;
    
    public static EntityManager getEntityManager() {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("site_commerce_pu");
        EntityManager em = emf.createEntityManager();
        if (em == null){
            entityManager = em;
            return entityManager;
        }else {
            return entityManager; 
        }
    }
}
