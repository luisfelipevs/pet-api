package br.com.salles.usecases;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.salles.dataprovider.PetRepository;
import br.com.salles.domain.Pet;

@Service
public class SaveNewPetUseCaseImpl implements SaveNewPetUseCase {

	@Autowired
	PetRepository petRepository;
	
	@Override
	public Pet save(Pet pet) {
		return petRepository.save(pet);
	}
	
}
