package net.code.java.spring;

import java.awt.print.Book;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

public class SpringaddtoView {

    public static void main(String[] args) {

        // Create a data source for the JDBC connection
        DriverManagerDataSource dataSource = new DriverManagerDataSource();
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://localhost:3306/bookstore");
        dataSource.setUsername("root");
        dataSource.setPassword("pari@123");

        // Create a JdbcTemplate object using the data source
        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);

        // SQL query to select all books from the 'book1' table
        String sql = "SELECT * FROM book1";
        RowMapper<SpringAdded> rowMapper = new RowMapper<SpringAdded>() {
            public SpringAdded mapRow(ResultSet result, int rowNum) throws SQLException {
                Integer bookid = result.getInt("bookid");
                String title = result.getString("title");
                String author = result.getString("author");
                float price = result.getFloat("price");

                return new SpringAdded(bookid, title, author, price);
            }
        };

        List<SpringAdded> listbook = jdbcTemplate.query(sql, rowMapper);

        for (SpringAdded aBook : listbook) {
            // Process each book
        	System.out.println(aBook);
        }
    }
}
