package br.com.salles.dataprovider;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import br.com.salles.domain.Pet;

@Repository
public class PetRepositoryImpl implements PetRepository {

	@Autowired
	JpaPetRepository jpaPetRepository;

	public Pet findById(Long id) {
		return jpaPetRepository.findById(id).get();
	}

	@Override
	public List<Pet> findAll() {		
		return jpaPetRepository.findAll();
	}

	@Override
	public Pet save(Pet pet) {		
		return jpaPetRepository.save(pet);
	}

	@Override
	public Pet update(Pet pet) {		
		return jpaPetRepository.save(pet);
	}

	@Override
	public void delete(Long id) {		
		jpaPetRepository.deleteById(id);
	}

}
