/*
 * HelloController.java
 * Copyright (C) 2018 white <white@Whites-Mac-Air.local>
 *
 * Distributed under terms of the MIT license.
 */

package com.example.demo.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.demo.entity.Person;
import com.example.demo.repository.PersonRepository;


@RestController
@RequestMapping(path="/person")
public class PersonController {
    @Autowired
    private PersonRepository personRepository;

    @RequestMapping("/all")
    public @ResponseBody Iterable<Person> getAllPerson(){
        return personRepository.findAll();
    }
	@GetMapping(path="/add") // Map ONLY GET Requests
	public @ResponseBody String addNewUser (@RequestParam String name) {
		Person n = new Person();
		n.setName(name);
		personRepository.save(n);
		return "Saved";
	}

}

