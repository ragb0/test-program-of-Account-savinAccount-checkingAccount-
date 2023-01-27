package com.mycompany.bankaccount;
import java.util.Scanner; 
public class savingAccount extends Account { 
public savingAccount(String name, int id) {super( name,id);} 
@Override
public double withdraw(double amount){ 
 if (this.balance-amount>10000) { 
 System.out.println("'over daft");} 
 else
 super.withdraw(amount); 
 
 return this.balance; 
 } 
 }
