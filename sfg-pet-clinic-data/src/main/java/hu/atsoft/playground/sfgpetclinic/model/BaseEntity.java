package hu.atsoft.playground.sfgpetclinic.model;

import java.io.Serializable;

public class BaseEntity implements Serializable {
	private static final long serialVersionUID = 6194917701616548141L;
	
	private Long id;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
}
