package kok.lee.dao;

import org.springframework.stereotype.Repository;

import kok.lee.model.Person;

@Repository
public interface PersonMapper {
    int insert(Person record);

    int insertSelective(Person record);
}