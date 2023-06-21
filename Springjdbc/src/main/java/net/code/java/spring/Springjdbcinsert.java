package net.code.java.spring;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class Springjdbcinsert {

    public static void main(String[] args) {

        // Create a data source for the JDBC connection
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/bookstore");
        dataSource.setUsername("root");
        dataSource.setPassword("pari@123");

        // Create a JdbcTemplate object using the data source
        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);

        // SQL query to insert a new book into the 'book1' table
        String sql = "INSERT INTO book1(title, author, price) VALUES (?, ?, ?)";

        // Execute the SQL query and get the number of affected rows
        int result = jdbcTemplate.update(sql, "python Concurrency", "hillips", 4300.00);

        // Check the result to determine if the book was added successfully
        if (result > 0) {
            System.out.println("A new book added successfully.");
        } else {
            System.out.println("Failed to add the book.");
        }
    }
}
