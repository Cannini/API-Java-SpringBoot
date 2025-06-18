package br.edu.atitus.api_sample.services;

import org.springframework.stereotype.Service;

import br.edu.atitus.api_sample.entities.PointEntity;
import br.edu.atitus.api_sample.repositories.PointRepository;

@Service
public class PointService {

	private final PointRepository repository;

	public PointService(PointRepository repository) {
		super();
		this.repository = repository;
	}
	
	public PointEntity save(PointEntity point) throws Exception {
		if (point == null)
			throw new Exception("Objeto Nulo");
		
		
		return point;
	}
	
	
}
