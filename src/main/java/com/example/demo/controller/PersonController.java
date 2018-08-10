/*
 * HelloController.java
 * Copyright (C) 2018 white <white@Whites-Mac-Air.local>
 *
 * Distributed under terms of the MIT license.
 */

package com.example.demo.controller;

import java.util.*;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.beans.factory.annotation.Autowired;
import com.example.demo.entity.Person;
import com.example.demo.mapper.PersonMapper;


@RestController
@RequestMapping(path="/person")
public class PersonController {
    @Autowired
    private PersonMapper personMapper;

	@GetMapping(path="/query")
	public @ResponseBody Person findUser (@RequestParam String name) {
		Person n = personMapper.findByName(name);
		return n;
	}
	@GetMapping(path="/all")
	public @ResponseBody List<Person> findAllPerson() {
		return personMapper.findAll();
	}

}

