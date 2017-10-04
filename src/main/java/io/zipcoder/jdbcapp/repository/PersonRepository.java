package io.zipcoder.jdbcapp.repository;

import io.zipcoder.jdbcapp.model.Person;

import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * This is the interface that you will program your PersonRepositoryImpl to.
 *
 * NOTE: Most of those methods are commented because this is supposed to compile for just the CreatePerson method.
 * You need to uncomment them.
 */
public interface PersonRepository {

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
//    // NOTE: Since the frequencies and the get people by methods are so similar, this is a place where we
//    // can reasonably make the code more efficient.  Since birthday needs a Date and not a string, though, then
//    // they must be generic.
//    <T> List<Person> getPeopleByField(String field, T key);
//
//    <T> Map<T, Integer> getFieldFrequencies(String field, T key);
//
//    //Here's what the extra methods would have looked like if we weren't going to have awesome code!
////
////    List<Person> getPeopleByMobileNumber(String mobileNumber);
////
////    List<Person> getPeopleByFirstName(String firstName);
////
////    List<Person> getPeopleByLastName(String lastName);
////
////    List<Person> getPeopleByBirthday(Date birthday);
////
////    Map<String, Integer> getLastNameFrequencies();
////
////    Map<String, Integer> getFirstNameFrequencies();
}
