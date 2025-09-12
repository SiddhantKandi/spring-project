package com.siddhant.spring_project.domain;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data                   // generates getters, setters, toString, equals, hashCode
@AllArgsConstructor     // generates constructor with all fields
@NoArgsConstructor      // generates constructor with no args
@Builder                // generates a builder pattern for this class
public class Author {
    private Long id;
    private String name;
    private Integer age;

    // private constructor so only Builder can create instances
    private Author(Builder builder) {
        this.id = builder.id;
        this.name = builder.name;
        this.age = builder.age;
    }

    // static method to start building
    public static Builder builder() {
        return new Builder();
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public void setName(String updated) {
        this.name = updated;
    }


    // Builder inner class
    public static class Builder {
        private Long id;
        private String name;
        private Integer age;

        public Builder id(Long id) {
            this.id = id;
            return this;
        }

        public Builder name(String name) {
            this.name = name;
            return this;
        }

        public Builder age(Integer age) {
            this.age = age;
            return this;
        }

        public Author build() {
            return new Author(this);
        }
    }
}



