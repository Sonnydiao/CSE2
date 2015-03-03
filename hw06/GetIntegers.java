/*Ask the user for 5 non-negative integers (if an invalid value is entered, then ask again,
using a loop), and print out the sum of the 5 integers.
Shuotao Diao, shd314@lehigh.edu*/
import java.util.Scanner;//import Scanner class
public class GetIntegers{//define class name
    public static void main(String[] args){//main method
        Scanner myScanner = new Scanner( System.in );
        //declare new Scanner object
        System.out.println("Please enter 5 non-negative integers");
        //prompt the user to enter 5 non-negative integers
        int i = 0;//initialize counter
        int sum = 0, input = 0;//declare sum and input variables
        String myString;//declare String which is used to store
        //invalid inpuy
        //while loop which is used to store 5 integers
        while ( i < 5 ){
            if ( myScanner.hasNextInt() ){
                //determine whether the input is integer
                input = myScanner.nextInt();
                //store the input
                if ( input >=0 ){
                    //determine whether the input is non-negative
                    sum += input;
                    i++;
                }//end of if
                else{
                    System.out.println("Invalid input, enter again.");
                    //display invalid input
                } 
            }//end of if
            else{
                //input is not integer
                myString = myScanner.next();//store invalid input
                System.out.println("Invalid input, enter again.");
                //display invalid input
            }
        }//end of while
        System.out.println("Sum is " + sum);//print out the sum    
        
    }//end of main method
}//end of class