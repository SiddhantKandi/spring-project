package com.siddhant.spring_project.dao;

import com.siddhant.spring_project.domain.Book;

import java.util.Optional;

public interface BookDAO {
    void create(Book book);

    Optional<Book> find(String isbn);
}
