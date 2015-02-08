/*This program is to prompt the user to enter a double 
and then print out a crude estimate of the cube root
Shuotao Diao shd314@lehigh.edu*/
import java.util.Scanner; //import Scanner class
//define the name of class
public class Root{
    public static void main(String[] args){
        //main method required by java program
        Scanner myScanner = new Scanner(System.in);
        //call the Scanner constructor
        System.out.print("Enter a double, and I print " + 
        "its cube root- ");
        //prompt the user to enter a double 
        double x = myScanner.nextDouble();
        //call nextDouble which is a part of part of Scanner object 
        double guess = x / 3.0;//start by guessing the 
        //root is x/3
        double difference = Math.abs(guess * guess * guess - 
        x);//calculate abstract value of differnce of guess cube
        //and x 
        //use while loop to derive estimated value 
        while (difference > 0.001){
            guess = (2.0 * guess * guess *guess + x) / 
            (3 * guess * guess);
            //replace guess by the new estimate following the 
            //function below
            difference = Math.abs(guess * guess *guess - x);
            //calculate abstract value of differnce of guess cube
            //and x
        }
        System.out.println("The cube root is " + guess);
        //print out estimated cube root
        double guessCube = guess * guess * guess;//calcule guess cube
        System.out.println(guess + " * " + guess + " * " + 
        guess + " = " + guessCube);//print out guess cube
    }//end of main method
}//end of class
