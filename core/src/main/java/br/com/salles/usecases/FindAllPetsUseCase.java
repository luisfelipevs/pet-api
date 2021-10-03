package br.com.salles.usecases;

import java.util.List;

import br.com.salles.domain.Pet;

public interface FindAllPetsUseCase {

	List<Pet> findAll();

}