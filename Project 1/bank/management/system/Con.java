package bank.management.system;

import com.mysql.cj.protocol.Resultset;

import java.sql.*;
import java.sql.DriverManager;
import java.sql.Statement;

public class Con {
    Connection connection;
    Statement statement;

    public Con() {
        try {
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/banksystem", "root", "Silu@512");
            statement = connection.createStatement();
            System.out.println("Connection Completed");
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }

    public void Fetchdata ()
    {
        try
        {
            String query = "select name, from signup";
            ResultSet resultSet = statement.executeQuery(query);

            while(resultSet.next())
            {
//                int id = resultSet.getInt("student_id");
                String name = resultSet.getString("name");
                System.out.println(name);
            }
            {

            }
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        Con con = new Con();
        con.Fetchdata();
    }
}