package com.fhss22.webshop.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Bestellung {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "bestellung_id_seq")
    @SequenceGenerator(name = "bestellung_id_seq", sequenceName = "bestellung_id_seq", allocationSize = 1)
    @Column(name = "bestellung_id", nullable = false)
    private long bestellungID;


    @ManyToOne
    private Kunde kunde;

    @OneToMany
    private List<Produkt> produkte;

    public Bestellung(long bestellungID, Kunde kunde, List<Produkt> produkte) {
        this.bestellungID = bestellungID;
        this.kunde = kunde;
        this.produkte = produkte;
    }

    public Bestellung() {
    }

    public long getBestellungID() {
        return bestellungID;
    }

    public void setBestellungID(long bestellungID) {
        this.bestellungID = bestellungID;
    }

    public Kunde getKunde() {
        return kunde;
    }

    public void setKunde(Kunde kunde) {
        this.kunde = kunde;
    }

    public List<Produkt> getProdukte() {
        return produkte;
    }

    public void setProdukte(List<Produkt> produkte) {
        this.produkte = produkte;
    }
}
