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

import com.avaliativa1.domain.CotMilho;
import com.avaliativa1.repository.ICotMilhoRepositoty;

@RestController
@RequestMapping ("/CotMilho")
public class CotMilhoResource {
	
	@Autowired
	private ICotMilhoRepositoty repository;
	

	@GetMapping()

		public ResponseEntity<List<CotMilho>> listarCotMilho() {
		
		
		return ResponseEntity.status(HttpStatus.OK).
				body(repository.findAll());
		
	}   		
    	
    	
    	@PostMapping()
    	public void SalvarcotMilho(@RequestBody CotMilho m ) {
	
    		repository.save(m); //salvar 
    		
    	}

}
