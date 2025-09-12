package com.siddhant.spring_project.dao;

import com.siddhant.spring_project.domain.Book;

import java.util.List;
import java.util.Optional;

public interface BookDAO {
    void create(Book book);

    Optional<Book> find(String isbn);

    List<Book> find();

    void update(String isbn, Book bookA);

    Optional<Book> findOne(String isbn);

    void delete(String isbn);
}
