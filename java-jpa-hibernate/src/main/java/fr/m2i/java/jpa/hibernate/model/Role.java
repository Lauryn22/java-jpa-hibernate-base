
package fr.m2i.java.jpa.hibernate.model;

import javax.persistence.*;

@Entity
@Table(name = "roles")
public class Role {

    @Id
    @Column(name = "id_role")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idRole;

    @Column(name = "identifiant", length = 50)
    private String identifiant;

    @Column(name = "description", columnDefinition = "TEXT")
    private String description;
    
    public Role() {
        
    }

    public Role(String identifiant, String description) {
        this.identifiant = identifiant;
        this.description = description;
    }

    public Long getIdRole() {
        return idRole;
    }

    public void setIdRole(Long idRole) {
        this.idRole = idRole;
    }

    public String getIdentifiant() {
        return identifiant;
    }

    public void setIdentifiant(String identifiant) {
        this.identifiant = identifiant;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Role{" + "idRole=" + idRole + ", identifiant=" + identifiant + ", description=" + description + '}';
    }
    
    public void copy(Role roleData) {

        if (roleData.getIdentifiant() != null) {
            this.setIdentifiant(roleData.getIdentifiant());
        }

        if (roleData.getDescription()!= null) {
            this.setDescription(roleData.getDescription());
        }
    }
}