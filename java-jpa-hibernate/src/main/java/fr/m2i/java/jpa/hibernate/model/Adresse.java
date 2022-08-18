
package fr.m2i.java.jpa.hibernate.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "adresses")
public class Adresse {
    @Id
    @Column(name = "id_adresse")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idAdresse;
    
    @ManyToOne(fetch = FetchType.LAZY)
    private Utilisateur utilisateur;

    @Column(name = "code_postal", length = 100)
    private String codePostal;

    @Column(name = "pays", length = 100)
    private String pays;

    @Column(name = "principale", length = 1)
    private boolean principale;

    @Column(name = "rue", length = 100)
    private String rue;

    @Column(name = "ville", length = 100)
    private String ville;

    public void setUtilisateur(Utilisateur utilisateur) {
        this.utilisateur = utilisateur;
    }

    public void setCodePostal(String codePostal) {
        this.codePostal = codePostal;
    }

    public void setPays(String pays) {
        this.pays = pays;
    }

    public void setPrincipale(boolean principale) {
        this.principale = principale;
    }

    public void setRue(String rue) {
        this.rue = rue;
    }

    public void setVille(String ville) {
        this.ville = ville;
    }

    public Long getIdAdresse() {
        return idAdresse;
    }

    public Utilisateur getUtilisateur() {
        return utilisateur;
    }

    public String getCodePostal() {
        return codePostal;
    }

    public String getPays() {
        return pays;
    }

    public boolean isPrincipale() {
        return principale;
    }

    public String getRue() {
        return rue;
    }

    public String getVille() {
        return ville;
    }

}
