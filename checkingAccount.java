
package com.mycompany.bankaccount;

public class checkingAccount extends Account { 
public checkingAccount(String name, int id) {super( name,id); 
 } @Override
public double deposit(double amount) { 
 if (this.balance+amount>10000) { 
 System.out.println("'over drawn"); 
 } else 
 super.deposit( amount); 
 return this.balance; 
 } 
}
