package com.fhss22.webshop.model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Kunde {
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "kunde_id_seq")
    @SequenceGenerator(name = "kunde_id_seq", sequenceName = "kunde_id_seq", allocationSize = 1)
    @Column(name = "kunde_id", nullable = false)
    private long kundeID;


    @OneToMany
    private List<Bestellung> bestellungen;

    public Kunde(long kundeID, List<Bestellung> bestellungen) {
        this.kundeID = kundeID;
        this.bestellungen = bestellungen;
    }

    public Kunde() {
    }

    public long getKundeID() {
        return kundeID;
    }

    public void setKundeID(long kundeID) {
        this.kundeID = kundeID;
    }

    public List<Bestellung> getBestellungen() {
        return bestellungen;
    }

    public void setBestellungen(List<Bestellung> bestellungen) {
        this.bestellungen = bestellungen;
    }
}
