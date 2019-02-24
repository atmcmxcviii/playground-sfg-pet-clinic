package hu.atsoft.playground.sfgpetclinic.services.springdatajpa;

import hu.atsoft.playground.sfgpetclinic.model.PetType;
import hu.atsoft.playground.sfgpetclinic.repositories.PetTypeRepository;
import hu.atsoft.playground.sfgpetclinic.services.PetTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;

import java.util.HashSet;
import java.util.Set;

@Service
@Profile("springdatajpa")
public class PetTypeSDJpaService implements PetTypeService {

    @Autowired
    private PetTypeRepository petTypeRepository;

    public PetTypeSDJpaService(PetTypeRepository petTypeRepository) {
        this.petTypeRepository = petTypeRepository;
    }

    @Override
    public Set<PetType> findAll() {
        Set<PetType> petTypes = new HashSet<>();
        petTypeRepository.findAll().forEach(petTypes::add);
        return petTypes;
    }

    @Override
    public PetType findById(Long id) {
        return petTypeRepository.findById(id).orElse(null);
    }

    @Override
    public PetType save(PetType pet) {
        return petTypeRepository.save(pet);
    }

    @Override
    public void delete(PetType pet) {
        petTypeRepository.delete(pet);
    }

    @Override
    public void deleteById(Long id) {
        petTypeRepository.deleteById(id);
    }
}
