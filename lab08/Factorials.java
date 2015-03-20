/*Calculating super factorial(sum of factorial) based on methods. The first
method called factorial is used to calculate factorial. The
second method called print is used to prints out result.
Shuotao Diao, shd314@lehigh.edu*/
import java.util.Scanner;//import Scanner class
public class Factorials{//class name
    public static void main(String[] args){//main method
        Scanner myScanner = new Scanner( System.in );//declare new Scanner object
        System.out.print("PLease enter a positive integer: ");
        int n = myScanner.nextInt();//store input
        int sum = 0;//declare sum variable 
        for ( int i = n; i > 0; i--){//calculate sum of factorials
            sum += factorial(i);//sum up factrials
        }//end of for loop
        print( n, sum );//print out super factorial
    }//end of main method
    public static int factorial( int input){//calculate factorial n!
        int result = 1;//declare new variable which is used to store factorial
        for ( int i = input; i > 0; i--){
            result *= i;//calculate factorial
        }//end of for loop
        return result;//return result
    }//end of factorial method
    public static void print( int input, int sum ){//print out result
        System.out.println("The super factorial of " + input + 
        " is " + sum);//print out input and sum of factorials
    }//end of print method
}//end of class