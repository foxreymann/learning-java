
/**
 * Write a description of class Account here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */

import java.util.Scanner; 

public class Account
{

 private int accountNo ;
 private String sortCode = "12-14-33";
 private String accountName;
 private double balance = 0.0;
 //issue no 1 ,2 ,3
 private char cardIssueNo;

 
 
 public void getInput(){
     
     Scanner keyboard = new Scanner(System.in);
     
     System.out.println("Please enter account name");
     
     accountName = keyboard.next();
     
     System.out.println("Please enter account no");
     
     accountNo = keyboard.nextInt();
     
      System.out.println("Please put in cash");
     
     balance = keyboard.nextDouble();
     
     System.out.println("Please enter issue no");
 
     String stringCardIssueNo;
     stringCardIssueNo = keyboard.next();  
     
     cardIssueNo = stringCardIssueNo.charAt(0);
     
    }
 
 public void setAccountNo(int accountNo)
 {
    this.accountNo = accountNo;   
 }
 
 public void setAccountName(String name ){
     
     accountName = name; 
     
    }
 
 public int getAccountNo(){
     
     return accountNo;
     
    }
    public void displayAccountInfo(){
        System.out.println("Account No "  + accountNo);
        System.out.println("Sort Code "  + sortCode);
        System.out.println("Account Name "  + accountName);
        System.out.println("balance "  + balance);
        System.out.println("issue number "  + cardIssueNo);
        
        
    }
 
 
  //open
  public void openAccount(){
      System.out.println("Account Opened!");
   }
  //deposit
  public void deposit(double money){
      System.out.println("Money deposited!");
   }
  //withDraw
  //printStatement



}
