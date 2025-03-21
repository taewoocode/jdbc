package hello.jdbc.connection;

import lombok.extern.slf4j.Slf4j;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import static hello.jdbc.connection.ConnectionConst.*;
import static hello.jdbc.connection.ConnectionConst.PASSWORD;
import static hello.jdbc.connection.ConnectionConst.USERNAME;


@Slf4j
public class DBConnectionUtil {

    public static Connection getConnection() {
        try {
            Connection connection = DriverManager.getConnection(URL, USERNAME, PASSWORD);
            log.info("get connection={}", "class={}", connection, connection.getClass());
            return connection;
        } catch (SQLException e) {

            /**
             * RunTimeException
             */
            throw new IllegalStateException(e);
        }
    }

    public static int hello() {
        return 10;
    }

    public static int add(int a, int b) {
        return a + b;
    }
}
