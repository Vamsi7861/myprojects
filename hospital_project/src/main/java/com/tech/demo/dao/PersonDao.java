package com.tech.demo.dao;

import java.util.List;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.tech.demo.dto.Person;
import com.tech.demo.repositry.PersonRepository;


@Repository
public class PersonDao {
	@Autowired
	PersonRepository repository;

	public Person savePerson(Person person) {
		return repository.save(person);
	}

	public Person updatePerson(Person person) {
		return repository.save(person);
	}

	public Optional<Person> findPersonById(int id) {
		return repository.findById(id);
	}

	public void delete(Person person) {
		repository.delete(person);
	}

	public List<Person> getAllPersons() {
		return repository.findAll();
	}
}
