package com.company;



import java.sql.*;
import java.util.Calendar;

public class Main {

    public static void main(String[] args) {
        String url ="jdbc:sqlserver://localhost;database=Library";
        String login = "test";
        String password = "1111";

        try {
            Connection connection = DriverManager.getConnection(url, login,password);
            int CurrYear = 2013;

            String queiry1 = "SELECT Books.Title FROM Books INNER JOIN Authors ON Books.Author = Authors.Fullname Where Books.Year = ? OR Books.Year = ?";

            String queiry2 = "SELECT Authors.Fullname, Authors.Country FROM Authors INNER JOIN Books ON Authors.Fullname = Books.Author" ;
            int count = 2;
            String queiry3 = "SELECT AU.Fullname, FI.Title FROM Authors AU INNER JOIN Books FI ON AU.Fullname = FI.Author WHERE "
            + count +
            " >= (SELECT COUNT(Authors.Fullname) FROM Authors WHERE FI.Author = Authors.Fullname) ";
            String queiry4 = "DELETE FROM Books WHERE Year = 2000";

                Statement statement = connection.createStatement();


            PreparedStatement preparedStatement = connection.prepareStatement(queiry1);

            preparedStatement.setInt(1,2013);
            preparedStatement.setInt(2,2012);
            ResultSet res1 = preparedStatement.executeQuery();

            while (res1.next())
            {
                System.out.println(res1.getString("Title"));
            }


            System.out.println("\n\n");

            ResultSet res2 = statement.executeQuery(queiry2);

            while (res2.next())
            {
                System.out.println(res2.getString("Fullname") + " "+ res2.getString("Country"));
            }
            System.out.println("\n\n");

            ResultSet res3 = statement.executeQuery(queiry3);

            while (res3.next())
            {
                System.out.println(res3.getString("Fullname") + " "+ res3.getString("Title"));
            }
        }
        catch (Exception e)
        {
            System.out.println(e.getMessage());
        }
    }
}
