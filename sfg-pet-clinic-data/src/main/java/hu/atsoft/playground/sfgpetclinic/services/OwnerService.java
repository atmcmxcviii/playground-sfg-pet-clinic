package hu.atsoft.playground.sfgpetclinic.services;

import java.util.Set;

import hu.atsoft.playground.sfgpetclinic.model.Owner;

public interface OwnerService {
	Owner findByLastName(String lastName);
	Owner findById(Long id);
	Owner save(Owner owner);
	Set<Owner> findAll();
}
