package hu.atsoft.playground.sfgpetclinic.services.map;

import java.util.Set;

import hu.atsoft.playground.sfgpetclinic.model.Specialty;
import hu.atsoft.playground.sfgpetclinic.services.SpecialtyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import hu.atsoft.playground.sfgpetclinic.model.Vet;
import hu.atsoft.playground.sfgpetclinic.services.VetService;

@Service
@Profile({ "default", "map" })
public class VetMapService extends AbstractMapService<Vet, Long> implements VetService {

	@Autowired
	private final SpecialtyService specialtyService;

	public VetMapService(SpecialtyService specialtyService) {
		this.specialtyService = specialtyService;
	}

	@Override
	public Set<Vet> findAll() {
		return super.findAll();
	}
	
	@Override
	public Vet findById(Long id) {
		return super.findById(id);
	}
	
	@Override
	public Vet save(Vet object) {
		if (!object.getSpecialties().isEmpty()) {
			object.getSpecialties().forEach(specialty -> {
				if (specialty.getId()==null) {
					Specialty savedSpecialty = specialtyService.save(specialty);
					specialty.setId(savedSpecialty.getId());
				}
			});
		}
		return super.save(object);
	}
	
	@Override
	public void delete(Vet object) {
		super.delete(object);
	}
	
	@Override
	public void deleteById(Long id) {
		super.deleteById(id);
	}
}
