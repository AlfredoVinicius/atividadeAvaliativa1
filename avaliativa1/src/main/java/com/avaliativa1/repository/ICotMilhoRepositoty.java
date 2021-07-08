package com.avaliativa1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.avaliativa1.domain.CotMilho;

@Repository
public interface ICotMilhoRepositoty extends JpaRepository<CotMilho, Long>{
		
		

	
}
