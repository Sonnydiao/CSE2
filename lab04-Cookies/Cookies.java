/*This program aims to promt the user to enter number of 
cookies, number of people and number of number of cookies 
they want each person to get. Then it will determine whether
the number of cookies are evenly divisible among the people 
and if there is enough for each person. Also, it will check 
whether the inputs are legal. 
Shuotao Diao, shd314@lehigh.edu   */
import java.util.Scanner; //import scanner class
public class Cookies{//define the name of class
    public static void main(String[] args){
        //main method required by Java program
        int numberOfPeople, numberOfCookies, numberOfCookiesPerPerson;
        //declare variable at the beginnning(must)
        Scanner myScanner = new Scanner( System.in );
        System.out.print("Enter the number of people: ");
        //Prompt the user to enter the number of people
        if(myScanner.hasNextInt()){//check whether the input is legal
           numberOfPeople = myScanner.nextInt();
           if(numberOfPeople <= 0){//check whether the input
           //is positive
               System.out.println("You did not enter an int > 0");
               //show that the user didn't enter a positive integer
               return; //leave the program
           }
        }
        else{
            System.out.println("You did not enter an int");
            //show that the user didn't enter an integer
            return; //leave the program
        }
        System.out.print("Enter the number of cookies you " +
        "are planning to buy: ");
        if(myScanner.hasNextInt()){//check whether the input is legal
           numberOfCookies = myScanner.nextInt();
           if(numberOfCookies <= 0){//check whether the input
           //is positive
               System.out.println("You did not enter an int > 0");
               //show that the user didn't enter a positive integer
               return; //leave the program
           }
        }
        else{
            System.out.println("You did not enter an int");
            //show that the user didn't enter an integer
            return; //leave the program
        }
        System.out.print("How many do you want each person " +
        "to get? ");
        if(myScanner.hasNextInt()){//check whether the input is legal
           numberOfCookiesPerPerson = myScanner.nextInt();
           if(numberOfCookiesPerPerson < 0){//check whether the input
           //is positive
               System.out.println("You did not enter an int > 0");
               //show that the user didn't enter a positive integer
               return; //leave the program
           }
        }
        else{
            System.out.println("You did not enter an int");
            //show that the user didn't enter an integer
            return; //leave the program
        }    
        int totalNumberOfDemandingCookies = numberOfPeople *
        numberOfCookiesPerPerson;
        //calculate the total number of cookies required  
        if( totalNumberOfDemandingCookies <= numberOfCookies){
            //check whether the cookies are enough 
            if( numberOfCookies%numberOfPeople == 0){
                //check whether the amount will divide evenly
                System.out.println("You will have enough cookies " + 
                "and the amount will divide evenly");
            }
            else{
                System.out.println("You have enough, but they will " + 
                "not divide evenly.");
            }
        }
        else{
            int numberOfExtraCookies = totalNumberOfDemandingCookies - 
            numberOfCookies;
            //calculate the number of extra cookies you need to buy 
            System.out.println("You will not have enough cookies. " +
            "You need to buy at least " + numberOfExtraCookies + 
            " more.");
            //print out you won't have enough cookies and numbe of
            //extra cookies
        }
    }//end of main method 
}//end of class
