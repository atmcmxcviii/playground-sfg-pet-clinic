package hu.atsoft.playground.sfgpetclinic.model;

import java.time.LocalDate;

public class Pet extends BaseEntity {
	private static final long serialVersionUID = 4604556469322491948L;
	
	private String name;
	private PetType petType;
	private Owner owner;
	private LocalDate birthDate;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public PetType getPetType() {
		return petType;
	}
	public void setPetType(PetType petType) {
		this.petType = petType;
	}
	public Owner getOwner() {
		return owner;
	}
	public void setOwner(Owner owner) {
		this.owner = owner;
	}
	public LocalDate getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}
}
