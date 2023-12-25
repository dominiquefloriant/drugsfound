package com.mycompany.drugsfound.entity;

import jakarta.persistence.*;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "Pharmacie")
public class Pharmacie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "pharmacie_id")
    private int id;

    @ManyToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
    @JoinTable(name = "pharmacie_medicament", joinColumns = @JoinColumn(name = "pharmacie_id"),inverseJoinColumns = @JoinColumn(name = "medicament_id"))
    private List<Medicament> medicaments = new ArrayList<>();

    @Column(name = "ouvert")
    private boolean îsOuvert;
    @Column(name = "nom_pharmacie")
    private String nomPharmacie;
    @Column(name = "adresse_pharmacie")
    private String adressePharmacie;
    @OneToMany(mappedBy = "pharmacie", fetch = FetchType.LAZY, cascade = CascadeType.ALL, orphanRemoval = true)
    private List<Utilisateur> utilisateurs = new ArrayList();

    public Pharmacie() {
    }
    public String getAdressePharmacie() {
        return adressePharmacie;
    }

    public void setAdressePharmacie(String adressePharmacie) {
        this.adressePharmacie = adressePharmacie;
    }




    public List<Medicament> getMedicaments() {
        return medicaments;
    }

    public void setMedicaments(List<Medicament> medicaments) {
        this.medicaments = medicaments;
    }

    public List<Utilisateur> getUtilisateurs() {
        return utilisateurs;
    }

    public void setUtilisateurs(List<Utilisateur> utilisateurs) {
        this.utilisateurs = utilisateurs;
    }


    public boolean isÎsOuvert() {
        return îsOuvert;
    }

    public void setÎsOuvert(boolean îsOuvert) {
        this.îsOuvert = îsOuvert;
    }

    public String getNomPharmacie() {
        return nomPharmacie;
    }

    public void setNomPharmacie(String nomPharmacie) {
        this.nomPharmacie = nomPharmacie;
    }
}
