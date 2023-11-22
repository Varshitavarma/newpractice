package com.poc.javacal.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.poc.javacal.Entity.Calculation;

public interface CalculationRepository extends JpaRepository<Calculation, Long> {
	
}