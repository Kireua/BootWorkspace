package com.yb.app.db;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.sql.Connection;

import javax.sql.DataSource;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;



@SpringBootTest
public class DBConnectionTest {

	@Autowired
	private DataSource dataSource;
	
	@Test
	void dbTest() throws Exception {
		Connection connection = dataSource.getConnection();
		assertNotNull(connection);
	}
}
