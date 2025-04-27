package com.example.person_manager;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@CrossOrigin(origins = "http://localhost:8081")
@RestController
@RequestMapping("/api/persons")
public class PersonController {

    private final List<Person> people = new ArrayList<>();
    private Long idCounter = 1L;

    // terve nimekirja inimeste saamine
    @GetMapping
    public List<Person> getAllPersons() {
        return people;
    }

    // ühe isiku saamine tema id järgi
    @GetMapping("/{id}")
    public Person getPersonById(@PathVariable Long id) {
        return people.stream()
                .filter(p -> p.getId().equals(id))
                .findFirst()
                .orElseThrow(() -> new RuntimeException("Person not found"));
    }

    // isiku lisamine
    @PostMapping
    public Person addPerson(@RequestBody Person person) {
        person.setId(idCounter++);
        people.add(person);
        return person;
    }

    // isiku eemaldamine id põhiselt
    @DeleteMapping("/{id}")
    public void deletePerson(@PathVariable Long id) {
        people.removeIf(p -> p.getId().equals(id));
    }

    // isiku id järgi muutmine
    @PutMapping("/{id}")
    public Person updatePerson(@PathVariable Long id, @RequestBody Person updatedPerson) {
        for (Person person : people) {
            if (person.getId().equals(id)) {
                person.setName(updatedPerson.getName());
                person.setEmail(updatedPerson.getEmail());
                person.setBirthday(updatedPerson.getBirthday());
                person.setPet(updatedPerson.getPet());
                person.setNote(updatedPerson.getNote());
                return person;
            }
        }
        throw new RuntimeException("Person not found");
    }



}
