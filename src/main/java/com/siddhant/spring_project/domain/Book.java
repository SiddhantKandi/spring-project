package com.siddhant.spring_project.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data                   // generates getters, setters, toString, equals, hashCode
@AllArgsConstructor     // generates constructor with all fields
@NoArgsConstructor      // generates constructor with no args
@Builder
public class Book {
    private String isbn;
    private String title;
    private Long authorId;

//    // all-args constructor
//    public Book(String isbn, String title, Long authorId) {
//        this.isbn = isbn;
//        this.title = title;
//        this.authorId = authorId;
//    }

    // private constructor so only Builder can create instances
    private Book(Builder builder) {
        this.isbn = builder.isbn;
        this.title = builder.title;
        this.authorId = builder.authorId;
    }

    // static method to start building
    public static Builder builder() {
        return new Builder();
    }

    // Getters
    public String getIsbn() {
        return isbn;
    }

    public String getTitle() {
        return title;
    }

    public Long getAuthorId() {
        return authorId;
    }

    public void setAuthorId(Long id) {
        this.authorId = id;
    }

    // Builder inner class
    public static class Builder {
        private String isbn;
        private String title;
        private Long authorId;

        public Builder isbn(String isbn) {
            this.isbn = isbn;
            return this;
        }

        public Builder title(String title) {
            this.title = title;
            return this;
        }

        public Builder authorId(Long authorId) {
            this.authorId = authorId;
            return this;
        }

        public Book build() {
            return new Book(this);
        }
    }
}
