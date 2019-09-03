package com.feiyu;

import com.feiyu.bean.Person;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

/*
* SpringBoot单元测试
* */

@RunWith(SpringRunner.class)
@SpringBootTest
public class HelloJavaTests {
    @Autowired
    Person person;

    @Autowired
    DataSource dataSource;

    @Test
    public void contextLoads() throws SQLException {
        System.out.println(person);
        // System.out.println(dataSource.getClass());
        Connection connection = dataSource.getConnection();
        System.out.println(connection);
        System.out.println("数据库已连接");
        connection.close();
    }
}
