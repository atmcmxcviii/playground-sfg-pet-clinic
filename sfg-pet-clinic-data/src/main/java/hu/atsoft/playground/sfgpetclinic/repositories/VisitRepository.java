package hu.atsoft.playground.sfgpetclinic.repositories;

import hu.atsoft.playground.sfgpetclinic.model.Visit;
import org.springframework.data.repository.CrudRepository;

public interface VisitRepository extends CrudRepository<Visit, Long> {
}
