/*Input an integer that is between 9 and 16 inclusively. Then
caculate factorial of input number.
Shuotao Diao, shd314@lehigh.edu*/
import java.util.Scanner;//import Scanner class
public class RunFactorial{//define class name
  public static void main( String[] args){//main method
      Scanner myScanner = new Scanner( System.in );
      //declare new Scanner object
      System.out.println("Please enter an integer " +
      "that is between 9 and 16.");
      //prompt the user to enter an integer that 
      //is between 9 and 16
      int i = 0 , j = 1;//declare counter
      int factorial = 1, input = 0;//declare factorial and input
      String myString;//declare String which is used to store invalid input
      //first while loop is used to store valid input
      while ( i < 1){
          if ( myScanner.hasNextInt() ){
              //if input is integer
              input = myScanner.nextInt();//store the input
              if ( input >= 9 && input <= 16){
                  //if input is between 9 and 16
                  System.out.println("Input accepted:");
                  //print out that input is accepted
                  while ( j <= input ){
                      factorial *= j;
                      j++;
                  }//end of while loop
                  i++;
              }//end of if statement
              else{
                  System.out.println("Invalid input, enter again!");
                  //display warning of invalid input
              }//end of else statement
          }//end of if statement
          else{
              //invalid input
              myString = myScanner.next();
              System.out.println("Invalid input, enter again!");
              //display warning of invalid input
          }//end of else statement
          
      }//end of while loop
      System.out.println(input + "! = " + factorial);
      //print out the factorial
  }//end of main method
    
}//end of class
    
