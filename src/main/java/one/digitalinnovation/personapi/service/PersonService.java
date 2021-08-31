package one.digitalinnovation.personapi.service;

import lombok.AllArgsConstructor;
import one.digitalinnovation.personapi.dto.request.PersonDTO;
import one.digitalinnovation.personapi.dto.response.MenssageResponseDTO;
import one.digitalinnovation.personapi.entity.Person;
import one.digitalinnovation.personapi.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;

import java.util.Collections;
import java.util.List;

@Service
@AllArgsConstructor(onConstructor = @__(@Autowired))
public class PersonService {

    private PersonRepository personRepository;

    //private final PersonMapper personMapper = PersonMapper.INSTANCE;

    @PostMapping
    public MenssageResponseDTO createPerson(PersonDTO personDTO){
        //Person personToSave = personMapper.toModel(personDTO);
        //Person savedPerson = personRepository.save(personToSave);
        //return MenssageResponseDTO.builder().menssage("Creates person with ID" + savedPerson.getId()).build();
        return null;
    }

    public List<PersonDTO> listAll() {
        List<Person> allPeople = personRepository.findAll();
        //return allPeople.stream().map(personMapper::toDTO).collect(Collectors.toList());
        return null;
    }

    public PersonDTO findById(Long id) throws PersonNotFoundException {
        Person person = personRepository.findById(id).orElseThrow(() -> new PersonNotFoundException(id));
        //Optional<Person> optionalPerson = personRepository.findById(id);
        //return personMapper.toDTO(optionalPerson.get());
        return null;
    }

    private Person verifyIfExists(Long id) throws PersonNotFoundException{
        return personRepository.findById(id).orElseThrow(() -> new PersonNotFoundException(id));
    }

    public void delete(Long id) throws PersonNotFoundException {
        verifyIfExists(id);
        personRepository.deleteAllById(Collections.singleton(id));
    }

    public MenssageResponseDTO updateById(Long id, PersonDTO personDTO) throws PersonNotFoundException {
        verifyIfExists(id);
        //Person personToSave = personMapper.toModel(personDTO);
        //Person savedPerson = personRepository.save(personToSave);
        //return MenssageResponseDTO.builder().menssage("Creates person with ID" + savedPerson.getId()).build();
        return null;
    }

    public MenssageResponseDTO createMenssageResponse(Long id, String s){
        //return MenssageResponseDTO.builder().menssage(s + id).build();
        return null;
    }
}
