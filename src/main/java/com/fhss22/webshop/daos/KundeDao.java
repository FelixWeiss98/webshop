package com.fhss22.webshop.daos;

import com.fhss22.webshop.model.Kunde;
import org.springframework.data.jpa.repository.JpaRepository;

public interface KundeDao extends JpaRepository<Kunde, Integer> {
}
