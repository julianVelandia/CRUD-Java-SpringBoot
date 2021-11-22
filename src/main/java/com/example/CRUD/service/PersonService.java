package com.example.CRUD.service;

import com.example.CRUD.dao.PersonDao;
import com.example.CRUD.model.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class PersonService {
    private final PersonDao persorDao;

    @Autowired
    public PersonService(@Qualifier("FakeDao") PersonDao persorDao) {
        this.persorDao = persorDao;
    }

    public int addPerson(Person person) {
        return persorDao.insertPerson(person);
    }
}
