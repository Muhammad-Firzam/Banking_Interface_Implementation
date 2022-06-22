package oop_lab_tasks;
import java.util.*;

public class OOP_LAB_TASKS {

    public static void main(String[] args) throws Exception {
         Scanner input = new Scanner(System.in);
         SastaBank s1 = new SastaBank();
         char op =' ';
         
        System.out.println("\n\t----WELCOME TO SASTA BANK-----");
        
        
        do{
        System.out.println("Enter what you want to perform: \n 1 for Create Account \n 2 for Searching Account Details \n 3 for Update Customer Information \n 4 for Cash WithDraw \n 5 for Cash Deposit");
        byte a = input.nextByte();
        if(a == 1){
            s1.createAccount();
        }
        else if (a ==2){
            s1.searchAccountDetails();
        }
        else if(a == 3){
            s1.updateCustInfo();
        }
        else if(a==4){
            System.out.println("Enter the Amount to Withdraw: ");
            int amount = input.nextInt();
            s1.cashWithdraw(amount);
        }
        else if(a==5){
              System.out.println("Enter the Amount to Deposit: ");
              int amount = input.nextInt();
              s1.cashDeposit(amount);
        }
        else{
            System.out.println("INVALID INPUT......");
        }        
            System.out.println("Do you want to perform again ?");
            op = input.next().charAt(0);            
        } while(op=='y');
        
        System.out.println("\n Thank You");
    }
    
}
