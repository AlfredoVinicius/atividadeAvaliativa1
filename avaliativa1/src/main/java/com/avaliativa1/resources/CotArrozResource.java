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

import com.avaliativa1.domain.CotArroz;
import com.avaliativa1.repository.ICotArrozRepository;

@RestController
@RequestMapping ("/CotArroz")
public class CotArrozResource {
	
	@Autowired
	private ICotArrozRepository repository;
	

	@GetMapping()

		public ResponseEntity<List<CotArroz>> listarCotArroz() {
		
		
		return ResponseEntity.status(HttpStatus.OK).
				body(repository.findAll());
		
	}   		
    	
    	
    	@PostMapping()
    	public void SalvarcotArroz(@RequestBody CotArroz a ) {
	
    		repository.save(a); //salvar 
    		
    	}

}
