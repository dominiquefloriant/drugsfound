package com.mycompany.drugsfound.entity;

import jakarta.persistence.*;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "medicament")
public class Medicament {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "medicament_id")
    private int medicamentId;
    @Column(name = "nameDrugs")
    private String nameDrugs;
    @Column(name = "priceDrugs")
    private Double priceDrugs;
    @Column(name = "quantity")
    private int quantity;
    @Column(name = "drugReference")

    private String drugReference;
    @ManyToMany( mappedBy = "medicaments")
    @Column(name = "pharmacie" )
     private List<Pharmacie> pharmacies = new ArrayList<>();
    public int getQuantity() {
        return quantity;
    }
    public Medicament(){

    }


    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getDrugReference() {
        return drugReference;
    }

    public void setDrugReference(String drugReference) {
        this.drugReference = drugReference;
    }

    public String getNameDrugs() {
        return nameDrugs;
    }

    public void setNameDrugs(String nameDrugs) {
        this.nameDrugs = nameDrugs;
    }

    public Double getPriceDrugs() {
        return priceDrugs;
    }

    public void setPriceDrugs(Double priceDrugs) {
        this.priceDrugs = priceDrugs;
    }

}
