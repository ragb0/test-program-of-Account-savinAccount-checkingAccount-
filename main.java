package com.mycompany.bankaccount;
import java.io.FileInputStream; 
import java.io.FileNotFoundException; 
import java.io.FileOutputStream; 
import java.io.IOException; 
import java.io.PrintWriter; 
public class BankAccount {
public static void main(String[] args) throws FileNotFoundException, 
IOException { 
 
 
 Account a1=new Account("joo",1122); 
 a1=new savingAccount("joo",1122); 
 
 FileOutputStream fos=new FileOutputStream("test.txt"); 
 try (PrintWriter write2 = new PrintWriter(fos)) { 
 a1.deposit(30); 
write2.println(a1.toString1());write2.println("_____________________________________________"); 
 a1.deposit(40); 
write2.println(a1.toString1());write2.println("_____________________________________________"); 
 a1.deposit(50); 
write2.println(a1.toString1());write2.println("_____________________________________________"); 
 a1.withdraw(5); 
write2.println(a1.toString1());write2.println("_____________________________________________"); 
 a1.withdraw(4); 
write2.println(a1.toString1());write2.println("_____________________________________________"); 
 a1.withdraw(2); 
write2.println(a1.toString1());write2.println("_____________________________________________"); 
 
 write2.flush(); 
 write2.close();
 } 
 try{
   try (FileInputStream fin = new FileInputStream("test.txt")) { 
 int i=0; 
 while((i=fin.read())!=-1){ 
 System.out.print((char)i); } } 
 }catch(Exception e){System.out.println(e);} 
 }}
 
