package com.sjprogramming.db;
import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection 
{
    static Connection con;
    
    public static Connection creaConnection()
    {
        try
        {
            Class.forName("com.mysql.jdbc.Driver");
            String user="root";
            String pass="Yafreen3110@";
            String url="jdbc:mysql://localhost:3306/student?autoReconnect=true&SSL=false";
            con=DriverManager.getConnection(url, user, pass);

        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }

        return con;
    }
}

