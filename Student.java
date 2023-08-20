package com.sjprogramming.model;

public class Student 
{
    private int RollNum;
    private String Name;
    private String SchoolName;
    private String City;
    private double Percentage;
     
    
   public Student()
    {

    }
    
    
    public Student(String name, String schoolName, String city, double percentage) 
    {
        this.Name = name;
        this.SchoolName = schoolName;
        this.City = city;
        this.Percentage = percentage;
        
    }


    


    public Student(int rollNum, String name, String schoolName, String city, double percentage) 
    {
        this.RollNum = rollNum;
        this.Name = name;
        this.SchoolName = schoolName;
        this.City = city;
        this.Percentage = percentage;
        
    }


    public int getRollNum() 
    {
        return RollNum;
    }
    public void setRollNum(int rollNum) 
    {
        RollNum = rollNum;
    }

    public String getName() 
    {
        return Name;
    }
    public void setName(String name) 
    {
        Name = name;
    }

    public String getSchoolName() 
    {
        return SchoolName;
    }
    public void setSchoolName(String schoolName) 
    {
        SchoolName = schoolName;
    }

    public String getCity() 
    {
        return City;
    }
    public void setCity(String city) 
    {
        City = city;
    }

    public double getPercentage() 
    {
        return Percentage;
    }
    public void setPercentage(double percentage) 
    {
        Percentage = percentage;
    }


    @Override
    public String toString() {
        return "Student [RollNum=" + RollNum + ", Name=" + Name + ", SchoolName=" + SchoolName + ", City=" + City
                + ", Percentage=" + Percentage + "]";
    }

    


    
    


    


    

    
}
