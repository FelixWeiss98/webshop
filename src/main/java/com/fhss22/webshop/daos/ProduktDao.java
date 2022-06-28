package com.fhss22.webshop.daos;

import com.fhss22.webshop.model.Produkt;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProduktDao extends JpaRepository<Produkt, Integer> {
}
