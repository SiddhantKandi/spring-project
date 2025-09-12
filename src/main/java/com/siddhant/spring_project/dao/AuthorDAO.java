package com.siddhant.spring_project.dao;

import com.siddhant.spring_project.domain.Author;

import java.util.*;

public interface AuthorDAO {

    void create(Author author);

    Optional<Author> findOne(long l);

    List<Author> find();

    void update(long id,Author author);

    void delete(long id);
}
