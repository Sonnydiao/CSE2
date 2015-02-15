/*This program aims to process banking transactions. There
is a random amount between 1,000 and 5,000 in their bank account.
And the user can choose depositing money, withdrawing money,
or viewing their balance. 
(Sonny) Shuotao Diao, shd314@lehigh.edu*/
import java.util.Scanner;//import Scanner class
public class Banking{//name of class
    public static void main(String[] args){
        //main method is required by Java program
        Scanner myScanner = new Scanner( System.in );//declare new Scanner object
        double balance = 1000 + (int)( Math.random() * 400000) / 100.00;
        //generate a random amount between 1,000 and 5,000 e.g.4028.30
        System.out.println("*** Welcome to Bank of Sonny ***");
        //print out the name of bank
        System.out.printf(" Your current balance is: $%4.2f\n", balance);
        //print out current balance
        System.out.println("Please choose the following functions:");
        //prompt the user to chose depositing money, withdrawing moent or 
        //viewing his/her balance
        System.out.println("(a) Depositing money");
        System.out.println("(b) Withdrawing money");
        System.out.println("(c) Viewing your balance");
        System.out.println("---------------------------");
        System.out.println("For example, if you want to deposit money, " + 
        "Please type in a or A.");//introduce how to choose one of three functions
        System.out.print("Your choice: ");
        String choice = myScanner.next();//store input
        switch (choice){
            //choice A and a are the same
            //choice B and b are the same
            //choice C and c are the same
            case "A": System.out.print("How much would you like to deposit? $");
                      double amountOfDeposit = myScanner.nextDouble();
                      //store the amount of depositing
                      if ( amountOfDeposit >= 0 ){//amount of depositing is
                          //positive number
                          balance = balance  +amountOfDeposit;
                          //current balance is former balance plus depositing
                          balance = (int)(balance * 100) / 100.0;
                          //convert balance into ****.** 
                      }
                      else {
                          System.out.println("Error: invalid input");
                          //print out warning of error
                      }
                      break;//end the switch
            case "a": System.out.print("How much would you like to deposit? $");
                      amountOfDeposit = myScanner.nextDouble();
                      //store the amount of depositing
                      if ( amountOfDeposit >= 0 ){//amount of depositing is
                          //positive number
                          balance = balance  +amountOfDeposit;
                          //current balance is former balance plus depositing
                          balance = (int)(balance * 100) / 100.0;
                          //convert balance into ****.** 
                      }
                      else {
                          System.out.println("Error: invalid input");
                          //print out warning of error
                      }
                      break;//end the switch
            case "B": System.out.print("How much would you like to withdraw? $");
                      double amountOfWithdraw = myScanner.nextDouble();
                      //store the amount of depositing
                      if ( amountOfWithdraw <= balance){
                          //amount of withdrawing is no more than balance
                          balance = balance - amountOfWithdraw;
                          //current balance is former balance minus amount of Withdraw
                          }
                          else {
                              System.out.println("Error: You don't have enough moeny "  +
                              "to withdraw.");
                          }
                      break;//end the switch
            case "b": System.out.print("How much would you like to withdraw? $");
                      amountOfWithdraw = myScanner.nextDouble();
                      //store the amount of withdrawing
                      if ( amountOfWithdraw <= balance){
                          //amount of withdrawing is no more than balance
                          balance = balance - amountOfWithdraw;
                          //current balance is former balance minus amount of Withdraw
                          }
                          else {//amount of withdrawing is larger than balance
                              System.out.println("Error: You don't have enough moeny "  +
                              "to withdraw.");
                          }
                      break;//end the switch
            case "C":
                      break;//end the switch
            case "c": 
                      break;//end the switch
            default : System.out.println("Error: invalid input");
                      //print out warning of error
                      break;//end the switch
        }     
        System.out.printf(" Your current balance is: $%4.2f\n", balance);
        //print out resulting balance after processing bakning transactions
    }//end of main method
}//end of class