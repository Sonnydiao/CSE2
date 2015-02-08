/* This program is to prompt the user to enter a double
and then prints out the first four digits to the right of
the decimal point
Shuotao Diao, shd314@lehigh.edu*/
import java.util.Scanner;//import Scanner class
//define the name of class
public class FourDigits{
    public static void main(String[] args){
        //main method required by the java program
        Scanner myScanner = new Scanner(System.in);
        //call the Scanner constructor
        System.out.print("Enter a double and I display " +
        "the four digits to the right of the decimal point- ");
        //prompt the user to enter a double 
        double x = myScanner.nextDouble();//call nextDouble which
        //is a part of part of Scanner object
        //calculate four digits to the right of the decimal point
        int tenths = (int) (x * 10) % 10;//calculate the value of tenth place
        int hundredths = (int) (x * 100) % 10;
        //calculate the value of hundredth place
        int thousandths = (int) (x * 1000) % 10;
        //calculate the value of thousandth place
        int tenThousandths = (int) (x * 10000) % 10;
        //calculate the value of ten thousandths
        System.out.println("The four digits are " + tenths +
        hundredths + thousandths + tenThousandths);
        //print out the first four digits to the right of the
        //decimal point
        
    }//end of main method
}//end of class