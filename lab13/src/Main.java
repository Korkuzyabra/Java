import java.io.*;
import java.sql.*;

public class Main {
    public static void main(String[] args) throws SQLException {

        String URL, user, password, mysql;
        mysql = "INSERT INTO teachers(Teacher_ID, Last_name, First_name, Midl_name) VALUES ('1', 'Герус', 'Полина', 'Андреевна')";
        URL = "jdbc:mysql://localhost:3306/mydb";
        user = "root";
        password = "87544ZeL111zEl44578_g";

        Connection conn = DriverManager.getConnection(URL, user, password);

        try (Statement st = conn.createStatement()) {
            int rowsInserted = st.executeUpdate(mysql);
            if (rowsInserted > 0) {
                System.out.println("Данные успешно добавлены в базу");
            }
        }
    }
}