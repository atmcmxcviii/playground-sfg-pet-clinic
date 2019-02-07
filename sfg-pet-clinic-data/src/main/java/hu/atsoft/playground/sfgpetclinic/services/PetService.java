package hu.atsoft.playground.sfgpetclinic.services;

import java.util.Set;

import hu.atsoft.playground.sfgpetclinic.model.Pet;

public interface PetService {
	Pet findById(Long id);
	Pet save(Pet pet);
	Set<Pet> findAll();
}
