package com.thobiasdev.dsmeta.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.thobiasdev.dsmeta.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale,Long> {

}
