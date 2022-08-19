
package fr.m2i.java.jpa.hibernate.dao;

import fr.m2i.java.jpa.hibernate.helper.SessionHelper;
import fr.m2i.java.jpa.hibernate.model.Produit;
import fr.m2i.java.jpa.hibernate.model.Utilisateur;
import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Query;


public class ProduitDAO {
    
        private final EntityManager entityManager;
        
        public ProduitDAO() {
        this.entityManager = SessionHelper.getEntityManager();
    }

    public List<Produit> findAll() {
        Query findAllQuery = entityManager.createQuery("select p from Produit p");
        return findAllQuery.getResultList();
    }

    public Produit findById(Long id) {
        Produit founded = entityManager.find(Produit.class, id);

        if (founded == null) {
            System.out.println("Attention le produit avec l'id : " + id + " n'exsiste pas !");
        }

        return founded;
    }
    
    
    public void create(Produit product) {

        if (product == null) {
            System.out.println("Le produit user ne peut pas être null");
            return;
        }

        EntityTransaction tx = null;

        try {
            tx = entityManager.getTransaction();
            tx.begin();
            
            entityManager.persist(product);
            
            tx.commit();
        } catch (Exception e) {
            System.out.println("Une erreur s'est produite lors de la création du produit");
            System.out.println("Exception message : " + e.getMessage());
            if (tx != null) {
                tx.rollback();
            }
        }
    }

    public void update(Long id, Produit product) {

        Produit productToUpdate = findById(id);
        
        if (productToUpdate == null) {
            System.out.println("Attention le produit avec l'id : " + id + " n'exsiste pas !");
            return;
        }

        productToUpdate.copy(product);

        EntityTransaction tx = null;

        try {
            tx = entityManager.getTransaction();
            tx.begin();

            entityManager.merge(productToUpdate);

            tx.commit();
        } catch (Exception e) {
            System.out.println("Une erreur s'est produite lors de la modification du ");
            System.out.println("Exception message : " + e.getMessage());
            if (tx != null) {
                tx.rollback();
            }
        }
    }
}
