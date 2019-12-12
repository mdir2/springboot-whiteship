package me.wook.springbootjdbc;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Component;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

@Component
public class MysqlRunner implements ApplicationRunner {
    
    @Autowired
    DataSource dataSource;
    
    @Autowired
    JdbcTemplate jdbcTemplate;
    
    @Override
    public void run(final ApplicationArguments args) throws Exception {
        Connection connection = null;
        Statement statement = null;
        
        try {
            connection = dataSource.getConnection();
            System.out.println(connection.getMetaData().getURL());
            System.out.println(connection.getMetaData().getUserName());
        
            statement = connection.createStatement();
            String sql = "CREATE TABLE USER(ID INT NOT NULL, name VARCHAR(255), PRIMARY KEY (ID))";
            statement.executeUpdate(sql);
            jdbcTemplate.execute("INSERT INTO USER VALUES(1, 'wook')");
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
            statement.close();
            connection.close();
        }
        
    }
}
