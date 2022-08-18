
package fr.m2i.java.jpa.hibernate;


import fr.m2i.java.jpa.hibernate.dao.RoleDAO;
import fr.m2i.java.jpa.hibernate.helper.SessionHelper;
import fr.m2i.java.jpa.hibernate.model.Role;
import javax.persistence.EntityManager;

public class JavaJpaHibernate {

    public static void main(String[] args) {

        EntityManager entityManager = SessionHelper.getEntityManager();
        RoleDAO roleDao = new RoleDAO();

        // create
        //Role roleAdmin = new Role("ADMIN", "Le rôle Administrateur"); 
        //roleDao.create(roleAdmin);

        // find
        //Role founded = roleDao.findById(1L);
        //System.out.println("Role CREATED : " + founded);

        // update
        //Role roleData = new Role();
        //roleData.setDescription("Le rôle Administrateur ");

        //roleDao.update(1L, roleData);

        // find
        //Role updated = roleDao.findById(1L);
        //System.out.println("Role UPDATED : " + updated);

        entityManager.close();
    }
}









