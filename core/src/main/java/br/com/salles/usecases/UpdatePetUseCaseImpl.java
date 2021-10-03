package br.com.salles.usecases;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.salles.dataprovider.PetRepository;
import br.com.salles.domain.Pet;

@Service
public class UpdatePetUseCaseImpl implements UpdatePetUseCase {

	@Autowired
	PetRepository petRepository;
	
	@Override
	public Pet update(Pet pet) {
		return petRepository.save(pet);
	}
	
}
