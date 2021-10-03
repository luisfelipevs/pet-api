package br.com.salles.dataprovider;

import java.util.List;

import br.com.salles.domain.Pet;

public interface PetRepository {

	public Pet findById(Long id);
	
	public List<Pet> findAll();
	
	public Pet save(Pet pet);
	
	public Pet update(Pet pet);
	
	public void delete(Long id);
}
