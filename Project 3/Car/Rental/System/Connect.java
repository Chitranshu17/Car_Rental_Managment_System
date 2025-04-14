package Car.Rental.System;

import java.sql.*;

public class Connect {
    Connection connection;
    Statement statement;

    public Connect() {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/banker","root","Silu@512");
            statement = connection.createStatement();
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
}