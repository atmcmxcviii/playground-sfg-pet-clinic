package hu.atsoft.playground.sfgpetclinic.repositories;

import hu.atsoft.playground.sfgpetclinic.model.PetType;
import org.springframework.data.repository.CrudRepository;

public interface PetTypeRepository extends CrudRepository<PetType, Long> {
}
