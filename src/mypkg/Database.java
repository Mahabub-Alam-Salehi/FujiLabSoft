package mypkg;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Database 
{
    private Connection conn;
    public Database()
    {
        conn = null;
    }
    public Connection getDBConnection()
    {
        return conn;
    }
    public boolean closeConnection()
    {
        try
        {
            conn.close();
            System.out.println("Connection closed successfully");
            return true;
        }
        catch(SQLException e)
        {
            System.out.println("Connection closed error");
            return false;
        }
    }
    public Connection CreateDBConnection()
    {
        System.out.println("-------- Mysql JDBC Connection Testing ------");
	try 
        {
            Class.forName("com.mysql.jdbc.Driver");
	} 
        catch (ClassNotFoundException e) 
        {
            System.out.println("Where is your Mysql JDBC Driver?");
            e.printStackTrace();
            
            return null;
            
	}
	System.out.println("Mysql JDBC Driver Registered!");
	try 
        {
            //conn = DriverManager.getConnection("jdbc:mysql://localhost/fujilab", "bashar", "123");
            conn = DriverManager.getConnection("jdbc:mysql://localhost/fujilab", "root", "");
            System.out.println("You made it, take control your database now!");
            return conn;
        } 
        catch (SQLException e)
        {
            System.out.println("Connection Failed! Check output console");
            e.printStackTrace();
            return null;
	}
   }
}
