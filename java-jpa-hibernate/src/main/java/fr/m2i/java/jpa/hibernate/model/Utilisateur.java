
package fr.m2i.java.jpa.hibernate.model;

import java.util.Date;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
@Table(name = "utilisateurs")
public class Utilisateur {
    
    @Id
    @Column(name = "id_utilisateur", length = 20)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idUtilisateur;
    
    @Column(name = "actif", columnDefinition = "TINYINT", length = 1)
    private boolean actif;
    
    @Column(name = "civilite", length = 100)
    private String civilite;
    
    @Column(name = "date_creation")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateCreation;
    
    @Column(name = "date_modification")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateModification;
    
    @Column(name = "date_naissance")
    @Temporal(TemporalType.TIMESTAMP)
    private Date dateNaissance;
    
    @Column(name = "identifiant", length = 100)
    private String identifiant;
    
    @Column(name = "marquer_effacer", columnDefinition = "TINYINT", length = 1)
    private boolean marquerEffacer;
    
    @Column(name = "mot_passe", length = 100)
    private String motPasse;
    
    @Column(name = "nom", length = 100)
    private String nom;
    
    @Column(name = "prenom", length = 100)
    private String prenom;
    
    @Id
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_role")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idRole;
       
    
}
