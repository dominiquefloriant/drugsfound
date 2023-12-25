package com.mycompany.drugsfound.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "Utilisateur")
public class Utilisateur {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "utilisateur_id")
    private int utilisateurId;

    @Column(name = "nom_utilisateur")
    private String nom;
    @Column(name = "prenom_utilisateur")
    private String prenom;

    @Column(name = "sexe_utilisateur")
    private String sexe;
    @Column(name = "adresseMail")
    private String adresseMail;

    @ManyToOne
    @JoinColumn(name = "pharmacie_id")
    private Pharmacie pharmacie;

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public String getSexe() {
        return sexe;
    }

    public void setSexe(String sexe) {
        this.sexe = sexe;
    }

    public String getAdresseMail() {
        return adresseMail;
    }

    public void setAdresseMail(String adresseMail) {
        this.adresseMail = adresseMail;
    }

    public Pharmacie getPharmacie() {
        return pharmacie;
    }

    public void setPharmacie(Pharmacie pharmacie) {
        this.pharmacie = pharmacie;
    }


    public Utilisateur() {
    }


}
