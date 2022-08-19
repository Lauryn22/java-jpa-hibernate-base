
package fr.m2i.java.jpa.hibernate.model;

import javax.persistence.*;


@Entity
@Table(name = "produits")
public class Produit {
    
    @Id
    @Column(name = "id_produit")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idProduit;
    
    @Column(name = "active", columnDefinition = "TINYINT(1) DEFAULT 1")
    private Boolean active;
    
    @Column(name = "description", columnDefinition = "TEXT")
    private String description;
    
    @Column(name = "nom", length = 100)
    private String nom;
    
    @Column(name = "prix")
    private Float prix;
    
    @Column(name = "reference", length = 100)
    private String reference;
    
    @Column(name = "stock", length = 11)
    private Integer stock;

    public void setIdProduit(Long idProduit) {
        this.idProduit = idProduit;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setPrix(Float prix) {
        this.prix = prix;
    }

    public void setReference(String reference) {
        this.reference = reference;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public Long getIdProduit() {
        return idProduit;
    }

    public Boolean getActive() {
        return active;
    }

    public String getDescription() {
        return description;
    }

    public String getNom() {
        return nom;
    }

    public Float getPrix() {
        return prix;
    }

    public String getReference() {
        return reference;
    }

    public Integer getStock() {
        return stock;
    }

    public Produit(String reference, Float prix, String nom, String description, Integer stock, Boolean active) {
        this.active = active;
        this.description = description;
        this.nom = nom;
        this.prix = prix;
        this.reference = reference;
        this.stock = stock;
    }

    public Produit() {
    }
    
  
    
    @Override
    public String toString() {
        return "Produit{" + "idProduit=" + idProduit
                + ", actif=" + active
                + ", description=" + description
                + ", nom=" + nom
                + ", prix=" + prix
                + ", reference=" + reference
                + ", stock=" + stock;
                
    }
    
    public void copy(Produit productData) {

        if (productData == null) {
            return;
        }

        if (productData.getActive() != null) {
            this.setActive(productData.getActive());
        }

        if (productData.getDescription() != null) {
            this.setDescription(productData.getDescription());
        }

        if (productData.getNom() != null) {
            this.setNom(productData.getNom());
        }
        
        if (productData.getPrix() != null) {
            this.setPrix(productData.getPrix());
        }

        if (productData.getReference() != null) {
            this.setReference(productData.getReference());
        }

        if (productData.getStock() != null) {
            this.setStock(productData.getStock());
        }

    }     
}
