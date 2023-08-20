package com.sjprogramming.dao;
//import java.beans.Statement;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.sjprogramming.db.DBConnection;
import com.sjprogramming.model.Student;
public class StudentDao implements StudentDaoInterface 
{

    @Override
    public boolean insertStudent(Student s) 
    {
        boolean flag= false;
        try
        {
            Connection con=DBConnection.creaConnection();
            String student="Insert into student_details3(sname, sclname, city, percentage) value(?,?,?,?)";
            PreparedStatement pst=con.prepareStatement(student);
            pst.setString(1, s.getName());
            pst.setString(2, s.getSchoolName());
            pst.setString(3, s.getCity());
            pst.setDouble(4, s.getPercentage());
            pst.executeUpdate();
            flag=true;
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
        return flag;
    }

    @Override
    public boolean delete(int roll) 
    {
        boolean flag=false;
        try
        {
            Connection con=DBConnection.creaConnection();
            String student ="delete from student_details3 where rollnum="+roll;
            PreparedStatement pst =con.prepareStatement(student);
            pst.executeUpdate();
            flag=true;
        }
        catch(Exception e)
        {
            e.printStackTrace();
        }
        return flag;
    }

    @Override
    public boolean update(int roll, String update, int Ch, Student s) 
    {
        int choice=Ch;
        boolean flag=false;
        try
        {
            if(choice==1)
            {
                Connection con=DBConnection.creaConnection();
                String student="update student_details3 set sname=? where rollnum=?";
                PreparedStatement ps=con.prepareStatement(student);
                ps.setString(1, update);
                ps.setInt(2, roll );
                ps.executeUpdate();  
                flag=true;          
            }
            else if(choice==2)
            {
                Connection con=DBConnection.creaConnection();
                String student="update student_details3 set sclname=? where rollnum=?";
                PreparedStatement ps=con.prepareStatement(student);
                ps.setString(1, update);
                ps.setInt(2, roll );
                ps.executeUpdate();  
                flag=true;          
            }
            else if(choice==3)
            {
                Connection con=DBConnection.creaConnection();
                String student="update student_details3 set city=? where rollnum=?";
                PreparedStatement ps=con.prepareStatement(student);
                ps.setString(1, update);
                ps.setInt(2, roll );
                ps.executeUpdate();  
                flag=true; 
            }
            
        }
        catch(Exception ex)
            {
                ex.printStackTrace();
            }
        return flag;
    }

    @Override
    public void showAllStudent() 
    {
        try
        {
            Connection con=DBConnection.creaConnection();
            String student = "select * from student_details3";
            java.sql.Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(student);
            
            while(rs.next())
            {
                System.out.println("RollNumber: "+rs.getInt(1)+"\n"+
                "Name: "+rs.getString(2)+"\n"+"School Name: "+rs.getString(3)+"\n"+
                "City: "+rs.getString(4)+"\n"+"Percentage: "+rs.getDouble(5));
                System.out.println("--------------------------");
            }
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
    }

    @Override
    public boolean showStudentById(int roll) 
    {
       try
        {
            Connection con=DBConnection.creaConnection();
            String student = "select * from student_details3 where rollnum="+roll;
            java.sql.Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(student);
            
            while(rs.next())
            {
                System.out.println("RollNumber: "+rs.getInt(1)+"\n"+
                "Name: "+rs.getString(2)+"\n"+"School Name: "+rs.getString(3)+"\n"+
                "City: "+rs.getString(4)+"\n"+"Percentage: "+rs.getDouble(5));
                //System.out.println("--------------------------");
            }
        }
        catch(Exception ex)
        {
            ex.printStackTrace();
        }
        return false;
    }

    
    
    
}
