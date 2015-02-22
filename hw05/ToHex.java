/*This program aims to take decimal RGB values (three inputs)
and convert them to hexadecimal.
Shuotao Diao, shd314@lehigh.edu */
import java.util.Scanner; //import Scanner class
public class ToHex{//class name
    public static void main(String[] args){
        //main method which is required by Java program
        Scanner myScanner = new Scanner( System.in ); 
        //declare new Scanner object
        int digit1, digit2;
        //declare new integer which is used to store 2
        //digits of one number 
        char character1 = 0, character2 = 0;
        //declare new character 
        int firstNumber, secondNumber, thirdNumber;
        //declare new integer
        String firstHexadecimal, secondHexadecimal, thirdHexadecimal;
        //declare new String
        System.out.println("Please enter three numbers " + 
        "representing RGB values:");
        //first Hexadecimal
        if ( myScanner.hasNextInt() ){
            firstNumber = myScanner.nextInt();
        }
        else{
            System.out.println("Sorry, your input must consist " + 
            "of integers.");
            return;
        }
        digit1 = firstNumber % 16;
        digit2 = firstNumber / 16;
        //convert number which is larger than 9 to hex
        switch ( digit1 ){
            //digit1 is 10
            case 10: character1 = 'A';
                     break;
            //digit1 is 11
            case 11: character1 = 'B';
                     break;
            case 12: character1 = 'C';
                     break;
            case 13: character1 = 'D';
                     break;
            case 14: character1 = 'E';
                     break;
            case 15: character1 = 'F';
                     break;
            default: break;
        }//end of switch statement
        switch ( digit2 ){
            //digit2 is 10
            case 10: character2 = 'A';
                     break;
            //digit2 is 11
            case 11: character2 = 'B';
                     break;
            case 12: character2 = 'C';
                     break;
            case 13: character2 = 'D';
                     break;
            case 14: character2 = 'E';
                     break;
            case 15: character2 = 'F';
                     break;
            default: break;
        }
        if ( digit1 < 10 && digit2 < 10 ){
            firstHexadecimal = "" + digit2 + digit1;
        }
        else if ( digit1 >= 10 && digit2 < 10 ){
            firstHexadecimal = "" + digit2 + character1;
        }
        else if ( digit1 < 10 && digit2 >=10 ){
            firstHexadecimal = "" + character2 + digit1;
        }
        else {
            firstHexadecimal = "" + character2 + character1;
        }
        //secondHexadecimal
        if ( myScanner.hasNextInt() ){
            secondNumber = myScanner.nextInt();
        }
        else{
            System.out.println("Sorry, your input must consist " + 
            "of integers.");
            return;
        }
        digit1 = secondNumber % 16;
        digit2 = secondNumber / 16;
        //convert number which is larger than 9 to hex
        switch ( digit1 ){
            //digit1 is 10
            case 10: character1 = 'A';
                     break;
            //digit1 is 11
            case 11: character1 = 'B';
                     break;
            case 12: character1 = 'C';
                     break;
            case 13: character1 = 'D';
                     break;
            case 14: character1 = 'E';
                     break;
            case 15: character1 = 'F';
                     break;
            default: break;
        }//end of switch statement
        switch ( digit2 ){
            //digit2 is 10
            case 10: character2 = 'A';
                     break;
            //digit2 is 11
            case 11: character2 = 'B';
                     break;
            case 12: character2 = 'C';
                     break;
            case 13: character2 = 'D';
                     break;
            case 14: character2 = 'E';
                     break;
            case 15: character2 = 'F';
                     break;
            default: break;
        }
        if ( digit1 < 10 && digit2 < 10 ){
            secondHexadecimal = "" + digit2 + digit1;
        }
        else if ( digit1 >= 10 && digit2 < 10 ){
            secondHexadecimal = "" + digit2 + character1;
        }
        else if ( digit1 < 10 && digit2 >=10 ){
            secondHexadecimal = "" + character2 + digit1;
        }
        else {
            secondHexadecimal = "" + character2 + character1;
        }
        //thirdHexadeciaml
        if ( myScanner.hasNextInt() ){
            thirdNumber = myScanner.nextInt();
        }
        else{
            System.out.println("Sorry, your input must consist " + 
            "of integers.");
            return;
        }
        digit1 = thirdNumber % 16;
        digit2 = thirdNumber / 16;
        //convert number which is larger than 9 to hex
        switch ( digit1 ){
            //digit1 is 10
            case 10: character1 = 'A';
                     break;
            //digit1 is 11
            case 11: character1 = 'B';
                     break;
            case 12: character1 = 'C';
                     break;
            case 13: character1 = 'D';
                     break;
            case 14: character1 = 'E';
                     break;
            case 15: character1 = 'F';
                     break;
            default: break;
        }//end of switch statement
        switch ( digit2 ){
            //digit2 is 10
            case 10: character2 = 'A';
                     break;
            //digit2 is 11
            case 11: character2 = 'B';
                     break;
            //digit2 is 12
            case 12: character2 = 'C';
                     break;
            case 13: character2 = 'D';
                     break;
            case 14: character2 = 'E';
                     break;
            case 15: character2 = 'F';
                     break;
            default: break;
        }
        //convert decimal number to hexadecimal number
        if ( digit1 < 10 && digit2 < 10 ){
            thirdHexadecimal = "" + digit2 + digit1;
        }
        else if ( digit1 >= 10 && digit2 < 10 ){
            thirdHexadecimal = "" + digit2 + character1;
        }
        else if ( digit1 < 10 && digit2 >=10 ){
            thirdHexadecimal = "" + character2 + digit1;
        }
        else {
            thirdHexadecimal = "" + character2 + character1;
        }
        String hexadeciamal = firstHexadecimal + secondHexadecimal + 
        thirdHexadecimal;
        System.out.println("The decimal number R:" + firstNumber  +
        ", G:" + secondNumber + ", B:" + thirdNumber + 
        " is represented in hexadecimal as: " + hexadeciamal);
        //print out the hexadecimal number
        
    }//end of main method
}//end of class