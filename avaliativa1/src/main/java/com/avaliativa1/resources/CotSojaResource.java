package com.avaliativa1.resources;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.avaliativa1.domain.CotSoja;
import com.avaliativa1.repository.ICotSojaRepository;

@RestController
@RequestMapping ("/CotSoja")
public class CotSojaResource {
	
	@Autowired
	private ICotSojaRepository repository;
	

	@GetMapping()

		public ResponseEntity<List<CotSoja>> listarCotSoja() {
		
		
		return ResponseEntity.status(HttpStatus.OK).
				body(repository.findAll());
		
	}   		
    	
    	
    	@PostMapping()
    	public void SalvarcotSoja(@RequestBody CotSoja s ) {
	
    		repository.save(s); //salvar 
    		
    	}

}
