package io.zipcoder.jdbcapp.repository;

import io.zipcoder.jdbcapp.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementCreator;
import org.springframework.jdbc.core.simple.SimpleJdbcInsert;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.jdbc.support.KeyHolder;
import org.springframework.stereotype.Repository;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


/**
 * This is the class where you'll do the actual DB retrieval.
 * Make sure that it adheres to the PersonRepository interface.
 */
@Repository("personRepository")
public class PersonRepositoryImpl implements PersonRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    /**
     * There are a few ways do do this (as we saw in the Pluralsight videos).
     * Three different ways have been written.  Try and understand what each of them do and why.
     * Right now, this just returns null because we don't have a way to get back the row back from the key
     * So fix this after you do the getPerson stuff.
     *
     * Also, note that we're not doing anything with home_id.  We're gonna let this default to NULL and modify this in
     * the Home portion.
     *
     * We used the standard JDBC template update to perform the insert, and commented out is the SimpleJdbc way
     * to perform the insert.  We haven't done any prepared statement queries, or named parameters.  Feel free to do
     * these on your own if you want.
     *
     * @param person The person to create
     * @return The person created (with their ID).
     */
    @Override
    public Person createPerson(Person person) {
        // This is the query that we're going to be using to create a person.
        String query = "INSERT INTO people (first_name, last_name, mobile, birthday) VALUES(?, ?, ?, ?)";

        // This is the standard JDBC template way to preform the query.  The problem here is that we don't get back
        // the key that was created when we add the new item.
        jdbcTemplate.update(query,
                person.getFirstName(),
                person.getLastName(),
                person.getMobile(),
                person.getBirthday());

        // Utilizing the SimpleJdbcInsert
        // Notice, we don't actually use our
//        SimpleJdbcInsert insert = new SimpleJdbcInsert(jdbcTemplate);
//        List<String> columns = new ArrayList<>();
//        columns.add("first_name");
//        columns.add("last_name");
//        columns.add("mobile");
//        columns.add("birthday");
//
//        insert.setTableName("people");
//        insert.setColumnNames(columns);
//
//        Map<String, Object> data = new HashMap<>();
//        data.put("first_name", person.getFirstName());
//        data.put("last_name", person.getLastName());
//        data.put("mobile", person.getMobile());
//        data.put("birthday", person.getBirthday());
//
//        insert.setGeneratedKeyName("id");
//
//        Number key = insert.executeAndReturnKey(data);

        return null;
    }

}
