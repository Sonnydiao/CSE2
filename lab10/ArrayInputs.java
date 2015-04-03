/*
This progrom aims to store integer input
1) Ask the user to enter the size of an onedimensional
array
2) Ask the user to fill up the array with integers
3) Write a method to check if the input is a positive integer. If the input is not an
integer or not positive, the method will return an error message. Reprompt
the
user to enter a new input, until the array is completely filled.
4) Print out the array
Shuotao Diao, shd314@lehigh.edu*/
import java.util.Scanner;//import Scanner class
public class ArrayInputs{//class method
    public static void main(String[] args){//main method
        Scanner myScanner = new Scanner( System.in );//import Scanner class
        int [] myInput;//import array class
        System.out.print("Please enter the size of an one-dimensional array: ");
        int size = myScanner.nextInt();//store the input
        System.out.println("");//go to the next line
        myInput = new int[size];//initialize the size array
        for(int i = 0; i < size;){
            System.out.println("Please enter a postive integer: ");
            if (myScanner.hasNextInt()){
                myInput[i] = myScanner.nextInt();
                if (myInput[i] > 0){//poistive input
                i++;
                }//end of 2nd if statement
                else{
                    System.out.println("Sorry, the number you entered is negative.");
                }
            }//end of 1st if statement
            else{
                myScanner.next();
                System.out.println("Sorry, you didn’t enter an integer.");
            }
        }//end of for loop
        //print out the array
        System.out.println("The array is: ");
        for(int i = 0; i < size;i++){
            System.out.println(myInput[i]);
        }//end of for 
    }//end of main method
}//end of class
