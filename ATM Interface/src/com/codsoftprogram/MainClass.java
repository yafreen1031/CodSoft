package com.codsoftprogram;

import java.util.Scanner;

public class MainClass 
{
    public static void main(String args[])
    {
        ATMOperationInter op=new ATMOperationImpl();
        int atmcardnumber=12345;
        int atmpin=123;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter Your ATM Number: ");
        int atmnumber=sc.nextInt();
        if(atmcardnumber != atmnumber)
        {
            System.out.println("The card number you entered was wrong");
            System.exit(0);
        }
        System.out.println("Enter your pin: ");
        int pin=sc.nextInt();
        if(atmpin != pin)
        {
            System.out.println("The pin you entered was incorrect. Please enter the correct pin");
            System.exit(0);
        }
        else if((atmcardnumber == atmnumber) && (atmpin == pin))
        {
            System.out.println("Validation successfull");
            while(true)
            {
                System.out.println("What kind of operation do you want to perform");
                System.out.println("1. Check Balance\n2. Deposit Amount\n3. Withdraw Amount\n4. View Mini Statement\n5. Exit");
                System.out.println("Enter your Choice: ");
                int ch=sc.nextInt();
                if(ch==1)
                {
                    op.viewBalance();
                }
                else if(ch==2)
                {
                    System.out.println("Enter the amount to be deposited:");
                    double depositAmount=sc.nextDouble();
                    op.depositAmount(depositAmount);
                }
                else if(ch==3)
                {
                    System.out.println("Enter Amount to be withdrawn: ");
                    double withdrawAmount =sc.nextDouble();
                    op.withdrawAmount(withdrawAmount);
                }
                else if(ch==4)
                {
                    op.viewMiniStatement();
                }
                else if(ch==5)
                {
                    System.out.println("Please Remove Your Card");
                    System.exit(0);
                }
                else 
                {
                    System.out.println("Invalid Choice");
                    System.exit(ch);
                }
            }
        }


    }
}
