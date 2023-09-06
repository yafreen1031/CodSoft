package com.CodSoftProgram;


import java.util.ArrayList;
import java.util.Scanner;


class ContactInformation
{
    String Name;
    String Address;
    String Contact_Number;

    ContactInformation(String n, String a, String c)
    {
        Name = n;
        Address = a;
        Contact_Number = c;

    }

    public void display()
    {
        System.out.println("1. Name: " + Name + "\n2. Address: " + Address + "\n3. Contact Details: " + Contact_Number );
    }
}

class Address_Book
{
    ArrayList Contacts;

    Address_Book()
    {
        Contacts =  new ArrayList<>();
    }
    public void addContact()
    {
        boolean flag;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter The Nmae To Add As A Contact: ");
        String Name = sc.nextLine();
        System.out.println("Enter The Address Of the Person: ");
        String Address = sc.nextLine();
        System.out.println("Enter the Contact Number of the person: ");
        String Contact_Number = sc.nextLine();
        ContactInformation c = new ContactInformation(Name, Address, Contact_Number);
        flag = Contacts.add(c);
        if(flag)
        {
            System.out.println("Contact Added Successfully\n");
        }
        else
        {
            System.out.println("Something Went Wrong. Please Try Again!\n");
        }

    }

    public void Search_Contact(String n)
    {
        for (int i=0; i < Contacts.size(); i++)
        {
            ContactInformation c = (ContactInformation)Contacts.get(i);
            if(n.equals(c.Name))
            {
                System.out.println("Search Successful");
                c.display();
                System.out.println("---------------------------------------------------------\n");
            }
            else if(n != c.Name)
            {
                System.out.println("Something went wrong please try again!\n");
            }
        }
    }

    public void delete_Contact(String n)
    {
        for (int i=0; i < Contacts.size(); i++)
        {
            ContactInformation c = (ContactInformation)Contacts.get(i);
            if(n.equals(c.Name))
            {
                Contacts.remove(i);
                System.out.println("Contact deleted successfully\n");

            }
            else
            {
                System.out.println("Something went wrong please try again!\n");
            }
        }
    }
}
public class Main 
{
    public static void main(String[] args) 
    {
        Address_Book add = new Address_Book();
        Scanner sc = new Scanner(System.in);
        while(true)
        {
            System.out.println("Welcome To Address Managemet System");
            System.out.println("Which kind of operation would you like to perform");
            System.out.println("1. Add Contact");
            System.out.println("2. Search Contact");
            System.out.println("3. Delete Contact");
            System.out.println("4. Exit");
            System.out.println("Enter your Choice;");
            int ch = sc.nextInt();


            switch(ch)
            {
                case 1: add.addContact();
                break;
                case 2: System.out.println("Enter the Name To Be Searched");
                String s = sc.next();
                add.Search_Contact(s);
                break;
                case 3: System.out.println("Enter the Name To Be Deleted");
                String d = sc.next();
                add.delete_Contact(d);
                break;
                case 4: System.exit(0);
                break;
                default: System.out.println("Invalid Choice!");
                break;
            }
        }

    }
}
