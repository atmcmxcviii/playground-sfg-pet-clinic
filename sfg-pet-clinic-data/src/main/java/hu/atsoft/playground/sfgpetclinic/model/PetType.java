package hu.atsoft.playground.sfgpetclinic.model;

public class PetType extends BaseEntity {
	private static final long serialVersionUID = -7765296113123373470L;
	
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
}
