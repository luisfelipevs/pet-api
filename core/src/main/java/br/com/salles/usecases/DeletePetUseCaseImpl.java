package br.com.salles.usecases;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.salles.dataprovider.PetRepository;
import br.com.salles.domain.Pet;

@Service
public class DeletePetUseCaseImpl implements DeletePetUseCase {

	@Autowired
	PetRepository petRepository;
	
	@Override
	public void delete(Long id) {
		petRepository.delete(id);
	}
	
}
