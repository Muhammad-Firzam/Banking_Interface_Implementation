package oop_lab_tasks;
import java.util.*;

public class SastaBank implements Banking_System{
    Scanner input = new Scanner(System.in);
    String name;
    String email;
    String accountNumber;
    int age;
    int amount;

    public void createAccount(){
        System.out.println("Enter your Name: ");
        this.name = input.next();
        System.out.println("Enter the E-mail address: ");
        this.email = input.next();
        System.out.println("Enter the Account Number: ");
        this.accountNumber = input.next();
        System.out.println("Enter age: ");
        this.age = input.nextInt();
        if(age < 18){
            throw new ArithmeticException("YOUR AGE IS BELOW 18");
        }
        else{
            System.out.println("YOU CAN CREATE ACCOUNT....");
         }
        System.out.println("Enter the Amount as Balance: ");
        this.amount= input.nextInt();
        
        System.out.println("\n\t\t<<<ACCOUNT CREATED>>>");
    }
    
    public void searchAccountDetails(){
        System.out.println("Enter your Account Number: ");
        String an = input.next();
        if(an.equals(accountNumber)){
            System.out.println("ACCOUNT EXISTS....");
        }
        else{
            System.out.println("ACCOUNT NOT FOUND....");
        }
    }
    
    public void updateCustInfo(){
        System.out.println("What you want to update: \n 1 for name \n 2 for Email \n 3 for age \n 4 for Account Number");
        byte ans = input.nextByte();
        if(ans == 1 ){
            System.out.println("Enter your Name: ");
             this.name = input.next();
        }
        else if (ans ==2){
            System.out.println("Enter the E-mail address: ");
            this.email = input.next();
        }
        else if(ans == 3){
        System.out.println("Enter age: ");
        this.age = input.nextInt();
        }
        else{
            System.out.println("ERROR...");
        }
    }
    
    public void cashDeposit(int deposit) throws Exception{
        if(deposit > 100000){
            throw new Exception("YOU CAN'T DEPOSIT THIS BIG AMOUNT");
        }
        else{
            amount = amount + deposit;
            System.out.println("AMOUNT DEPOSITED....");
        }
    }
    
    public void cashWithdraw(int withdraw) throws Exception{
        if(withdraw > 50000){
            throw new Exception("YOU CAN'T WITHDRAW THIS MUCH AMOUNT");
        }
        else if( withdraw > amount){
           throw new Exception("WITHDRAW AMOUNT IS GREATER THAN BALANCE");
        }
        else{
            amount = amount - withdraw;
            System.out.println("AMOUNT WITHDRAWN....");
        }
    }
   
}
