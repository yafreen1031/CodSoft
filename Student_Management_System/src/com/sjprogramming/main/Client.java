package com.sjprogramming.main;// Main Program
import java.util.Scanner;

import com.sjprogramming.dao.StudentDao;
import com.sjprogramming.dao.StudentDaoInterface;
import com.sjprogramming.model.Student;
public class Client 
{

    public static void main(String[] args) 
    {
        StudentDaoInterface dao=new StudentDao();
        System.out.println("Welcome to Student Management System");
        Scanner sc  = new Scanner(System.in);
        System.out.println("1. Add Student");
            System.out.println("2. Show All Students");
            System.out.println("3. Get Students based on Roll Number");
            System.out.println("4. Delete Student");
            System.out.println("5. Update Student");
            System.out.println("6. Exit");
        while(true)
        {
            System.out.println("Enter Your Choice");
            int ch = sc.nextInt();
            switch(ch)
            {
                case 1: System.out.println("Add Student");
                System.out.println("Enter Student Name");
                String name = sc.next();
                System.out.println("Enter School Name");
                String schoolName = sc.next();
                System.out.println("Enter Your City");
                String city = sc.next();
                System.out.println("Enter Your Percetage");
                double percentage = sc.nextDouble();
                

                Student st=new Student(name, schoolName, city, percentage);
                boolean ans=dao.insertStudent(st);
                if(ans)
                {
                    System.out.println("Record inserted Successfully");
                }
                else
                {
                    System.out.println("Something went Wrong. Please try again");
                }
                break;
                case 2: System.out.println("Show All Students");
                dao.showAllStudent();
                break;
                case 3: System.out.println("Get students based on Roll Number");
                System.out.println("enter Roll Number");
                int roll=sc.nextInt();
                boolean f= dao.showStudentById(roll);
                if(!f)
                {
                    System.out.println("Student with this ID is not available in this system");
                }
                else
                {
                    dao.showStudentById(roll);
                }
                break;
                case 4: System.out.println("Delete Student");
                System.out.println("Enter the Roll Number to delete");
                int rollnum=sc.nextInt();
                boolean g = dao.delete(rollnum);
                if(g)
                {
                    System.out.println("Record deleted successfully");
                }
                else
                {
                    System.out.println("something might be wrong");
                }
                break;
                case 5: System.out.println("Update Student");
                System.out.println("1. Update Name\n2. schoolName\n3.Update City");
                System.out.println("Enter Your Choce");
                int choice = sc.nextInt();
                if(choice==1)
                {
                    System.out.println("Enter Ypour Roll Number");
                    int rnum=sc.nextInt();
                    System.out.println("Enter Your new Name");
                    String sname=sc.next();
                    Student std = new Student();
                    std.setName(sname);
                    boolean flag = dao.update(rnum, sname, choice, std);
                    if(flag)
                    System.out.println("Name Updated Successfully");
                    else
                    System.out.println("Something went wrong");
                }     
                else if(choice==2)
                {
                    System.out.println("Enter Your roll number");
                    int rnum = sc.nextInt();
                    System.out.println("Enter Your New School Name");
                    String sclname = sc.next();
                    Student std= new Student();
                    std.setSchoolName(sclname);
                    boolean flag = dao.update(rnum, sclname, choice, std);
                    if(flag)
                    System.out.println("School Name Successfully Updated");
                    else
                    System.out.println("Something went wrong");
                }      
                else if(choice==3)
                {
                    System.out.println("Enter Your roll number");
                    int rnum = sc.nextInt();
                    System.out.println("Enter Your New City Name");
                    String scity = sc.next();
                    Student std= new Student();
                    std.setCity(scity);
                    boolean flag = dao.update(rnum, scity, choice, std);
                    if(flag)
                    System.out.println("City Name Successfully Updated");
                    else
                    System.out.println("Something went wrong");
                }  
                else
                {
                    System.out.println("Invalid Choice");
                }  
                break;
                case 6: System.out.println("Thank you for using Student Management System");
                System.exit(0);
                default: System.out.println("Please enter valid choice");
                break;
                
            }
        }
    }   
}
