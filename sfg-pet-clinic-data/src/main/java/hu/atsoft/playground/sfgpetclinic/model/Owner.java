package hu.atsoft.playground.sfgpetclinic.model;

import java.util.Set;

public class Owner extends Person {
	private static final long serialVersionUID = -7702850693393403030L;

	private Set<Pet> pets;

	public Set<Pet> getPets() {
		return pets;
	}

	public void setPets(Set<Pet> pets) {
		this.pets = pets;
	}
}
