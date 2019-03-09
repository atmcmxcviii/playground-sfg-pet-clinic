package hu.atsoft.playground.sfgpetclinic.services.map;

import java.util.Set;

import hu.atsoft.playground.sfgpetclinic.model.Pet;
import hu.atsoft.playground.sfgpetclinic.services.PetService;
import hu.atsoft.playground.sfgpetclinic.services.PetTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import hu.atsoft.playground.sfgpetclinic.model.Owner;
import hu.atsoft.playground.sfgpetclinic.services.OwnerService;

@Service
@Profile({ "default", "map" })
public class OwnerMapService extends AbstractMapService<Owner, Long> implements OwnerService {

	@Autowired
	private final PetTypeService petTypeService;
	@Autowired
	private final PetService petService;

	public OwnerMapService(PetTypeService petTypeService, PetService petService) {
		this.petTypeService = petTypeService;
		this.petService = petService;
	}

	@Override
	public Set<Owner> findAll() {
		return super.findAll();
	}
	
	@Override
	public Owner findById(Long id) {
		return super.findById(id);
	}
	
	@Override
	public Owner save(Owner object) {
		if (object!=null) {
			if (object.getPets()!=null) {
				object.getPets().forEach(pet -> {
					if (pet.getPetType()!=null) {
						/* If Pet Type is not yet saved, save it now */
						if (pet.getPetType().getId()==null) {
							pet.setPetType(petTypeService.save(pet.getPetType()));
						}
					} else {
						throw new RuntimeException("Pet Type is required");
					}

					/* Make sure the pet is saved */
					if (pet.getId()==null) {
						Pet savedPet = petService.save(pet);
						pet.setId(savedPet.getId());
					}
				});
			}
			return super.save(object);
		} else {
			return null;
		}
	}
	
	@Override
	public void delete(Owner object) {
		super.delete(object);
	}
	
	@Override
	public void deleteById(Long id) {
		super.deleteById(id);
	}

	@Override
	public Owner findByLastName(String lastName) {
		return this.findAll()
				.stream()
				.filter(owner -> owner.getLastName().equalsIgnoreCase(lastName))
				.findFirst()
				.orElse(null);
	}
}
