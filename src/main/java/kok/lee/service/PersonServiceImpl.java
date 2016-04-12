package kok.lee.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kok.lee.dao.PersonMapper;
import kok.lee.model.Person;


@Service("personService")
public class PersonServiceImpl implements PersonServiceI {
	
	private PersonMapper personMapper;

	
	public PersonMapper getPersonMapper() {
		return personMapper;
	}
	
	@Autowired
	public void setPersonMapper(PersonMapper personMapper) {
		this.personMapper = personMapper;
	}

	@Override
	public void insert(Person person){
		personMapper.insert(person);
	}

}
