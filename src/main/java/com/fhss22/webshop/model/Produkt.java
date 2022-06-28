package com.fhss22.webshop.model;

import javax.persistence.*;

@Entity
public class Produkt {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "produkt_id_seq")
    @SequenceGenerator(name = "produkt_id_seq", sequenceName = "produkt_id_seq", allocationSize = 1)
    @Column(name = "produkt_id", nullable = false)
    private long produktID;

    @ManyToOne
    private Bestellung bestellung;

    public Produkt(long produktID, Bestellung bestellung) {
        this.produktID = produktID;
        this.bestellung = bestellung;
    }

    public Produkt() {
    }

    public long getProduktID() {
        return produktID;
    }

    public void setProduktID(long produktID) {
        this.produktID = produktID;
    }

    public Bestellung getBestellung() {
        return bestellung;
    }

    public void setBestellung(Bestellung bestellung) {
        this.bestellung = bestellung;
    }
}
