package com.codsoftprogram;

import java.util.HashMap;
import java.util.Map;

public class ATMOperationImpl implements ATMOperationInter 
{
    ATM atm=new ATM();
    Map<Double,String> ministmt=new HashMap<>();

    @Override
    public void viewBalance() {
        System.out.println("Available Balance is: "+atm.getBalance());
    }

    @Override
    public void depositAmount(double depositAmount) {
        ministmt.put(depositAmount, " Deposited Successfully");
        System.out.println(depositAmount+" Deposited Successfully");
        atm.setBalance(depositAmount+atm.getBalance());

    }

    @Override
    public void withdrawAmount(double withdrawAmount) {
        if(withdrawAmount <= atm.getBalance())
        {
            ministmt.put(withdrawAmount, " Withdrawal Success");
            System.out.println("Successfully withdrawn cash"+withdrawAmount);
            atm.setBalance(atm.getBalance() - withdrawAmount);
        }
        else{
            ministmt.put(withdrawAmount, " Withdrawal Failed");
            System.out.println("Insuffiecient Balance");
            atm.setBalance(atm.getBalance());
        }
    }

    @Override
    public void viewMiniStatement() {
        for(Map.Entry<Double,String> m:ministmt.entrySet())
        {
            System.out.println(m.getKey()+""+m.getValue());
        }
    }
    
}
