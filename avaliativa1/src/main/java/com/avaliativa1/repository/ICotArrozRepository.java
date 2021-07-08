package com.avaliativa1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.avaliativa1.domain.CotArroz;

@Repository
public interface ICotArrozRepository extends JpaRepository<CotArroz, Long>{
	
	

}
