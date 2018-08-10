/*
 * Greeting.java
 * Copyright (C) 2018 white <white@Whites-Mac-Air.local>
 *
 * Distributed under terms of the MIT license.
 */
package com.example.demo.entity;

public class Greeting {
    private final long id; 
    private final String content;
    public long getId(){
        return this.id;
    }
    public String getContent(){
        return this.content;
    }
	public Greeting(long id, String content) {
        this.id = id;
        this.content = content;
	}
}

