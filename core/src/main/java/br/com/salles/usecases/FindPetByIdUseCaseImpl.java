package br.com.salles.usecases;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.salles.dataprovider.PetRepository;
import br.com.salles.domain.Pet;

@Service
public class FindPetByIdUseCaseImpl implements FindPetByIdUseCase {
	
	@Autowired
	private PetRepository petRepository;
	
	@Override
	public Pet findById(Long id) {
		return petRepository.findById(id);
	}

}
