/*This program is to record how many Macs you would like
to buy. Then it will display the cost per Mac, tax percentage
and total cost. 
Shuotao Diao, shd314@lehigh.edu*/ 
import java.util.Scanner; // import Scanner Class
public class BigMac {
    //main method require by Java program
    public static void main(String[] args) {
        //declare Scanner object and 
        //call the Scanner constructor
        Scanner myScanner = new Scanner( System.in );
        //promt the user to type in number of Big Macs
        System.out.print("Enter the number of " + 
        "Big Macs(an integer >0): ");
        //call nextInt Method which is a part of Scanner object
        int nBigMacs = myScanner.nextInt();
        //promt the user for the cost of Big Mac 
        //and the percentage sales tax 
        System.out.print("Enter the cost per Big Mac as" + 
        "a double (in the form xx.xx): " );
        double bigMac$ = myScanner.nextDouble();
        System.out.print("Enter the percent tax as a whole " + 
        "number (xx): ");
        double taxRate = myScanner.nextDouble();
        taxRate/=100; //convert the number into percent
        double cost$;
        int dollars, dimes, pennies; //whole dollar amount of
        cost$ = nBigMacs * bigMac$ * (1 + taxRate);
        //get the whole amount, dropging decimal fraction 
        dollars = (int) cost$;
        //get dimes amount
        // (int)(6.73 * 10) % 10 -> 67 % 10 -> 7
        dimes = (int) (cost$ * 10) % 10;
        pennies = (int) (cost$ * 100) % 100;//may be wrong in 
        //lab manul
        System.out.println("The total cost of " + 
        nBigMacs + "BigMacs, at $" + bigMac$ + 
        " per Big Mac with a " + "sales tax of " + 
        (int)(taxRate * 100) + "%, is $" + dollars + 
        "." + dimes + pennies);
        //display number of Big Macs, tax percent and total cost
    } //end of main method
} //end of class