/**********************
 * file       :BankingManagementSystem.java
 * Description:Create a mini-application for a banking system in Java. In this program, we will add some basic
               functionalities of a bank account like a deposit of amount, withdrawal of amount, etc.Initially,
               the program accepts the number of customers (Array of Objects)we need to add and adds the customer
               and account details accordingly. Further, it displays the series of menus to operate over the accounts.
                1.Display all account details
                2.Search by account number
                3.Deposit the amount
                4.Withdraw the amount
                5.Exit 
              Create Custom Exception and perform the following action:
              Customers are not allowed to deposit amount <= 0 ( In this case throw InvalidAmountException).
              Customers are not allowed to withdraw amount <= 0 (throw InvalidAmountException).
              Customers are also not allowed to withdraw an amount greater than (>) the available amount
               (throw InsufficientFundsException)
 * Author     :Anu Mathew
 * Date       :21/01/2022
 * Version    :1.0
 *************************/
import java.util.*;

class Bank{
   private String accountHolder,accountNumber,accountType;
   private long accountBalance;
   Scanner input=new Scanner(System.in);
   void AccountDetails(){
       System.out.println("Enter the name of account holder:  ");
       accountHolder=input.next();
       System.out.println("Enter type of account :  ");
       accountType=input.next();
       System.out.println("ENter account number :  ");
       accountNumber=input.next();
       System.out.println("Enter account balance :  ");
       accountBalance=input.nextLong();
   }
   void DisplayAccount(){
       System.out.println("Name of Account holder:  "+accountHolder);
       System.out.println("Type of Account       :  "+accountType);
       System.out.println("Account Number        :  "+accountNumber);
       System.out.println("Account Balance       :  "+accountBalance);
   }
   public boolean SearchAccount(String accountNo){
       if(accountNumber.equals(accountNo)){
           return (true);
       }
       else{
           return (false);
       }
   }
   void DepositAmount(){
       long amountDeposit;
       System.out.println("Enter the amount to be deposited :");
       amountDeposit=input.nextLong();
       try {
       if(amountDeposit<=0){
           throw new DepositException("Enter valid amount");
       }
       }
       catch(DepositException e){
           System.out.println(e.getMessage());
       }
       
       accountBalance += amountDeposit;
       System.out.println("Current balance: "+accountBalance);
   }
   void WithdrawAmount(){
       long amountWithdraw;
       System.out.println("Enter the amount to be withdrawn :");
       amountWithdraw=input.nextLong();
        try {
            if(amountWithdraw<=0){
                throw new WithdrawException("Enter valid amount");
            }
        }
        catch(WithdrawException e){
            System.out.println(e.getMessage());
        }  
        if(amountWithdraw>accountBalance){
           System.out.println("Insufficient funds!!");
        }
        else{
        accountBalance-=amountWithdraw;
        System.out.println("Current balnce: "+accountBalance);
       }
   }
   
}
class DepositException extends Exception {
    String message;
    public DepositException(String msg){
        message=msg;
    }
    public String getMessage(){
        return message;
    }
 }
 class WithdrawException extends Exception{
    String message;
    public WithdrawException(String msg){
        message=msg;
    }
    public String getMessage(){
        return message;
    }
}
public class BankingManagementSystem {
   public static void main(String[] args) {
       Bank bank=new Bank();
       Scanner input = new Scanner(System.in);
       int choice;
       bank.AccountDetails();
       System.out.println("\n--------BANKING MANAGEMENT SYSTEM--------\n");
       System.out.println("1.Display all account details");
       System.out.println("2.Search by account number ");
       System.out.println("3.Deposit Amount");
       System.out.println("4.Withdraw Amount");
       System.out.println("5.Exit");
       
       do{
           System.out.println("Enter your choice: ");
           choice=input.nextInt();
           switch(choice){
           case 1:
           {
            bank.DisplayAccount();
               break;
           }
           case 2:
           {
               
               System.out.println("Enter Account Number: ");
               String accountNo=input.next();
               if(bank.SearchAccount(accountNo)){
                    bank.DisplayAccount();
               }
               else{
                   System.out.println("ACCOUNT NOT FOUND!!");
               }
               break;
            }
           case 3:
           {
               System.out.println("Enter Account Number to deposit funds: ");
               String accountNo=input.next();
               if(bank.SearchAccount(accountNo)){
                    bank.DepositAmount();
               }
               else{
                   System.out.println("ACCOUNT NOT FOUND!!");
               }
               break;
           }
           case 4:
           {
                System.out.println("Enter Account Number to withdraw funds: ");
                String accountNo=input.next();
                if(bank.SearchAccount(accountNo)){
                    bank.WithdrawAmount();
                }
               break;
           }
           case 5:
           {
               System.out.println("--THANK YOU--");
               break;
           }
           default :
               System.out.println("Couldnt find entered choice");
           }
           
       }
       while(choice!=5);
       input.close();
   }
   
}
