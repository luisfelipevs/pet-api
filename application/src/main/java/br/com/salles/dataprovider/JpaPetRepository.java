package br.com.salles.dataprovider;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.salles.domain.Pet;

@Repository
public interface JpaPetRepository extends JpaRepository<Pet, Long>  {

}
