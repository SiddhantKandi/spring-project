package com.siddhant.spring_project;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;

@SpringBootApplication
public class SpringProjectApplication implements CommandLineRunner {

    private static final Logger log = LoggerFactory.getLogger(SpringProjectApplication.class);

    private final DataSource dataSource;

    public SpringProjectApplication(final DataSource dataSource) {
        this.dataSource = dataSource;
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringProjectApplication.class, args);
    }

    @Override
    public void run(final String... args) {
        log.info("Datasource: {}", dataSource.toString());

        final JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
        jdbcTemplate.execute("SELECT 1"); // ✅ test query
        log.info("Database connection test successful!");
    }
}
