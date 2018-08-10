/*
 * PersonMapper.java
 * Copyright (C) 2018 white <white@Whites-Mac-Air.local>
 *
 * Distributed under terms of the MIT license.
 */
package com.example.demo.mapper;
import com.example.demo.entity.Person;
import org.apache.ibatis.annotations.*;
import java.util.*;

@Mapper
public interface PersonMapper {
     
    @Select("select * from person where name = #{name}")
    Person findByName(@Param("name") String name);


    @Select("select id, name from person")
    List<Person> findAll(); //必须使用List, 不能是Iterable

}

