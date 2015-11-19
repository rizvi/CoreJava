package org.postgre;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCExample {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.out.println("-------- PostgreSQL "
                + "JDBC Connection Testing ------------");

        try {

            Class.forName("org.postgresql.Driver");

        } catch (ClassNotFoundException e) {

            System.out.println("Where is your PostgreSQL JDBC Driver? "
                    + "Include in your library path!");
            e.printStackTrace();
            return;

        }

        System.out.println("PostgreSQL JDBC Driver Registered!");

        Connection connection = null;

        try {

            connection = DriverManager.getConnection(
                    "jdbc:postgresql://localhost:5432/postgres", "postgres",
                    "postgres");

        } catch (SQLException e) {

            System.out.println("Connection Failed! Check output console");
            e.printStackTrace();
            return;

        }

        if (connection != null) {
            System.out.println("You made it, take control your database now!");
        } else {
            System.out.println("Failed to make connection!");
        }

           Connection c = null;
           Statement stmt = null;
           try {
           Class.forName("org.postgresql.Driver");
             c = DriverManager
                .getConnection("jdbc:postgresql://localhost:5432/postgres",
                "postgres", "postgres");
             c.setAutoCommit(false);
             System.out.println("Opened database successfully");

             stmt = c.createStatement();
             ResultSet rs = stmt.executeQuery( "SELECT * FROM USERLIST;" );
             while ( rs.next() ) {
                int id = rs.getInt("ID");
                String  name = rs.getString("NAME");
                int age  = rs.getInt("AGE");
                String birth = rs.getString("BIRTH");
               
                System.out.println( "ID = " + id );
                System.out.println( "NAME = " + name );
                System.out.println( "AGE = " + age );
                System.out.println( "BIRTH = " + birth );
                System.out.println();
             }
             rs.close();
             stmt.close();
             c.close();
           } catch ( Exception e ) {
             System.err.println( e.getClass().getName()+": "+ e.getMessage() );
             System.exit(0);
           }
           System.out.println("Operation done successfully");
         }
   }