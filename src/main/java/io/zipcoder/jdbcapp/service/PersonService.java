package io.zipcoder.jdbcapp.service;

import io.zipcoder.jdbcapp.model.Person;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * This is the interface that you will program your PersonServiceImpl to.
 *
 * NOTE: Most of those methods are commented because this is supposed to compile for just the CreatePerson method.
 * You need to uncomment them.
 */
public interface PersonService {

    Person createPerson(Person person);

//    Person getPerson(Integer id);
//
//    Person updatePerson(Integer id, Person person);
//
//    void deletePerson(Integer id);
//
//    void deletePeople(List<Integer> peopleToDelete);
//
//    List<Person> getPeople();
//
//    List<Person> getPeopleByMobileNumber(String mobileNumber);
//
//    List<Person> getPeopleByFirstName(String firstName);
//
//    List<Person> getPeopleByLastName(String lastName);
//
//    List<Person> getPeopleByBirthday(Date birthday);
//
//    Map<String, Integer> getLastNameFrequencies();
//
//    Map<String, Integer> getFirstNameFrequencies();
//
//    Map<Date, Integer> getBirthdayFrequencies();
}
