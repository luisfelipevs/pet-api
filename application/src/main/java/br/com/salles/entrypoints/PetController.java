package br.com.salles.entrypoints;

import java.util.List;

import org.modelmapper.ModelMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.salles.domain.Pet;
import br.com.salles.dto.PetDTO;
import br.com.salles.usecases.DeletePetUseCase;
import br.com.salles.usecases.FindAllPetsUseCase;
import br.com.salles.usecases.FindPetByIdUseCase;
import br.com.salles.usecases.SaveNewPetUseCase;
import br.com.salles.usecases.UpdatePetUseCase;
import io.swagger.v3.oas.annotations.tags.Tag;

@Tag(name="Pet API")
@RestController
@RequestMapping("api/pets")
public class PetController {
	
	private static final Logger logger = LoggerFactory.getLogger(PetController.class);

	@Autowired
	private FindPetByIdUseCase findPetByIdUseCase;

	@Autowired
	private FindAllPetsUseCase findAllPetsUseCase;
	
	@Autowired
	private SaveNewPetUseCase saveNewPetUseCase;

	@Autowired
	private UpdatePetUseCase updateNewPetUseCase;
	
	@Autowired
	private DeletePetUseCase deletePetUseCase;

	
	@Autowired
    private ModelMapper modelMapper;
	
	@DeleteMapping("")
	public void delete(Long id) {
		deletePetUseCase.delete(id);
	}
    
	@PutMapping("")
	public PetDTO update(@RequestBody PetDTO petDTO) {
		Pet pet = modelMapper.map(petDTO,Pet.class);
		pet  = this.updateNewPetUseCase.update(pet);    	
		return modelMapper.map(pet, PetDTO.class);
	}

	
    @PostMapping("")
    public PetDTO save(@RequestBody PetDTO petDTO) {
    	Pet pet = modelMapper.map(petDTO,Pet.class);
    	pet  = this.saveNewPetUseCase.save(pet);    	
    	return modelMapper.map(pet, PetDTO.class);
    	
    }


	 @GetMapping("{id}")
	 public PetDTO findByid(@PathVariable Long id) {
		 logger.info("Read a unique Pet");
		 Pet pet = findPetByIdUseCase.findById(id);		 
		 PetDTO dto = modelMapper.map(pet, PetDTO.class);	 
	     return dto;	 
	 }	
	 
	 @GetMapping("")
	 public List<PetDTO> findAll(){
		 logger.info("Find All Pets");
		 List<Pet> allPets = findAllPetsUseCase.findAll();
		 return allPets.stream().map((Pet pet) -> {
			 return modelMapper.map(pet, PetDTO.class);
		 }).toList();
	 }

}
