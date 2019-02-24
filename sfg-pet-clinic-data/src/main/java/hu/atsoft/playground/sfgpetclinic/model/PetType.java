package hu.atsoft.playground.sfgpetclinic.model;

import lombok.*;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Entity
@Table(name = "types")
public class PetType extends BaseEntity {
	private static final long serialVersionUID = -7765296113123373470L;
	
	@Column(name = "name")
	private String name;
}
