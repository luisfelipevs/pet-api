package br.com.salles.usecases;

import br.com.salles.domain.Pet;

public interface FindPetByIdUseCase {

	Pet findById(Long id);

}