/*
 * PersoRepository.java
 * Copyright (C) 2018 white <white@Whites-Mac-Air.local>
 *
 * Distributed under terms of the MIT license.
 */

package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.entity.Person;

// This will be AUTO IMPLEMENTED by Spring into a Bean called userRepository
// CRUD refers Create, Read, Update, Delete

public interface PersonRepository extends CrudRepository<Person, Long> {

}
