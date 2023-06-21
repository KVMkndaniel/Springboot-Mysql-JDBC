package net.code.java.spring;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class SpringjdbcDelete {

    public static void main(String[] args) {

        // Create a data source for the JDBC connection
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/bookstore");
        dataSource.setUsername("root");
        dataSource.setPassword("pari@123");

        // Create a JdbcTemplate object using the data source
        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);

        // SQL query to update the title of a book in the 'book1' table
        String sql = "DELETE FROM book1 where bookid = ?";

        // Execute the SQL query and get the number of affected rows
        int result = jdbcTemplate.update(sql,3);

        // Check the result to determine if the book was updated successfully
        if (result > 0) {
            System.out.println("The book was Deleted successfully.");
        } else {
            System.out.println("Failed to deleted the book.");
        }
    }
}
