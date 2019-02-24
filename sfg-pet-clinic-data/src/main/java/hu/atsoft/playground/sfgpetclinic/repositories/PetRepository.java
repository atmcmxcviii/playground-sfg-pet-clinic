package hu.atsoft.playground.sfgpetclinic.repositories;

import hu.atsoft.playground.sfgpetclinic.model.Pet;
import org.springframework.data.repository.CrudRepository;

public interface PetRepository extends CrudRepository<Pet, Long> {
}
