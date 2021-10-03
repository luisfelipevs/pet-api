package br.com.salles.usecases;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.salles.dataprovider.PetRepository;
import br.com.salles.domain.Pet;

@Service
public class FindAllPetsUserCaseImpl implements FindAllPetsUseCase {
	
	@Autowired
	PetRepository petRepository;
	
	@Override
	public List<Pet> findAll() {
		return petRepository.findAll();
	}

}
