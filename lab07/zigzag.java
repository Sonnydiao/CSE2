/*Using loop to create nSatrs 
Shuotao Diao, shd314@lehigh.edu*/
import java.util.Scanner;//import Scanner class
public class zigzag{//class name
    public static void main(String[] args){//main method
        Scanner myScanner = new Scanner( System.in );
        //declare Scanner object
        int nStars = 10, numberOfRun = 1;
        String myString;
        System.out.println("First loop");
        System.out.println("===================");
        for (int i = 0;i < nStars; i++){
        System.out.print("*");
        }//end of loop
        System.out.println("");//go to next line
        System.out.println("===================");
        System.out.println("Second loop");
        //prompt the user to enter an integer between 3 and 33
        for(int y = 0;y == 0;){//for loop which is used to determine whether 
        //to do it again
        System.out.println("Enter an int between 3 and 33");
        for(int k = 0; k == 0;){//counter k means whether input is valid
        //i.e. k = 0 (invalid input); k = 1 (valid input)
            if (myScanner.hasNextInt()){
                nStars = myScanner.nextInt();//store integer
                if (nStars >= 3 && nStars <= 33){
                    k = 1;//increment counter 
                    for (int i = 0;i < nStars; i++){
                    System.out.print("*");
                    }//end of loop
                    System.out.println("");//go to the next line
                    for(int i = 0;i < nStars; i++){
                    for(int j = 0; j < i; j++){
                    System.out.print(" ");
                    }//end of nested loop
                    System.out.println("*");
                    }//end of nested loop
                    for (int i = 0;i < nStars; i++){
                    System.out.print("*");
                    }//end of loop
                    }//end of 2nd if statement
                    else{
                        System.out.println("Invalid input, enter again.");
                    }//end of else statement
                    System.out.println("");//go to the next line 
            }//end of 1st if statement
            else{
                myString = myScanner.next();//store invalid input
                System.out.println("Invalid input, enter again.");
                }//end of else statement
        }//end of loop
        System.out.print("Enter Y or y to go again:");
                myString = myScanner.next();//store the answer
                if (myString.equals("y")||myString.equals("Y")){
                    numberOfRun++;//increment number of runs
                    System.out.println("===================");
                    System.out.println(numberOfRun + " run");
                }
                else{
                    y = 1;//increment counter which aborts for loop
                }//end of else statement
        }//end of loop
    }//end of main method
}//end of class