package hu.atsoft.playground.sfgpetclinic.model;

import lombok.*;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;
import java.io.Serializable;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@MappedSuperclass
public class BaseEntity implements Serializable {
	private static final long serialVersionUID = 6194917701616548141L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
}
