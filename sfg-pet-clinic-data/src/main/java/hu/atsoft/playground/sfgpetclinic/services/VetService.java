package hu.atsoft.playground.sfgpetclinic.services;

import java.util.Set;

import hu.atsoft.playground.sfgpetclinic.model.Vet;

public interface VetService {
	Vet findById(Long id);
	Vet save(Vet vet);
	Set<Vet> findAll();
}
