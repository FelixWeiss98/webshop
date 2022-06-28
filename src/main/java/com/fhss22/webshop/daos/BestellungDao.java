package com.fhss22.webshop.daos;

import com.fhss22.webshop.model.Bestellung;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BestellungDao extends JpaRepository<Bestellung, Integer> {
}
