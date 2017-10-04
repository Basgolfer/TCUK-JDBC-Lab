package io.zipcoder.jdbcapp.service;

import io.zipcoder.jdbcapp.model.Person;
import io.zipcoder.jdbcapp.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * This is where you're going to do the actual processing based on the data retrieved from the repository.
 * Make sure that it adheres to the PersonService interface.
 */
@Service("personService")
public class PersonServiceImpl implements PersonService {

    @Autowired
    private PersonRepository personRepository;

    @Override
    public Person createPerson(Person person) {
        return personRepository.createPerson(person);
    }
}
