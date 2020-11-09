package edu.javacourse.date;

import java.sql.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class StarterDataBase {
    public static final String SQL = "INSERT INTO check_date (first, second, third) VALUES (?,?,?)";

    public static void main(String[] args) throws Exception {
        Class.forName("org.postgresql.Driver");
        StarterDataBase starterDB = new StarterDataBase();
        starterDB.writeDate(LocalDateTime.now());
    }

    public void writeDate(LocalDateTime d) throws SQLException {
        try (Connection con = getConnection();
             PreparedStatement st = con.prepareStatement(SQL)) {
            st.setDate(1, java.sql.Date.valueOf(LocalDate.from(d)));
            st.setTime(2, java.sql.Time.valueOf(LocalTime.from(d)));
            st.setTimestamp(3, java.sql.Timestamp.valueOf(d));
            st.executeQuery();
        }
    }

    public Connection getConnection() throws SQLException {
        return DriverManager.getConnection("jdbc:postgresql://localhost:5432/jc_student",
                "postgres",
                "ra1gn3ar");

    }
}
