package hu.atsoft.playground.sfgpetclinic.repositories;

import hu.atsoft.playground.sfgpetclinic.model.Owner;
import org.springframework.data.repository.CrudRepository;

public interface OwnerRepository extends CrudRepository<Owner, Long> {
}
