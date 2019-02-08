package hu.atsoft.playground.sfgpetclinic.services;

import hu.atsoft.playground.sfgpetclinic.model.Owner;

public interface OwnerService extends CrudService<Owner, Long> {
	Owner findByLastName(String lastName);
}
