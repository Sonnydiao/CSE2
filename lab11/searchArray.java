/*Create array 1 and use linear search to find maximum and minimum
of this array. 
Create array 2 with increasing random number and find maximun and 
minimum of this array. 
Prompt the user to enter a positive integer. Find out whether the input
is in the array 2. 
Shuotao Diao, shd314@lehigh.edu*/
import java.util.Scanner;//import Scanner class
public class searchArray{//class name
    public static void main(String[] args){//main method
        Scanner myScanner = new Scanner(System.in);
        int [] array1, array2;
        array1 = new int[50];//initialize array1 with size 50
        array2 = new int[50];//initialize array2 with size 50
        //fill array1 with random 
        for (int i = 0; i < array1.length; i++){
            array1[i] = (int)(Math.random() * 101);
        }//end of for loop
        int min = array1[0], max = array1[0];
        for (int i = 1; i < array1.length; i++){
            if (min > array1[i]){//array1[i] is less than min
                min = array1[i];
            }//end of if 
            if (max < array1[i]){//array1[i] is larger than max
                max = array1[i];
            }//end of if
        }//end of for loop
        System.out.println("The maximum of array1 is : " + max);
        System.out.println("The minimum of array1 is : " + min);
        array2[0] = (int)(Math.random() * 101);
        for (int i = 1; i < array2.length; i++){
            array2[i] = array2[i - 1] + (int)(Math.random() * 101);
        }//end of for loop
        min = array2[0];
        max = array2[49];
        System.out.println("The maximum of array2 is : " + max);
        System.out.println("The minimum of array2 is : " + min);
        int input = 0;
        int lowerBound = 0;
        int upperBound = 49;
        int index = ((upperBound - lowerBound) / 2);
        System.out.print("Enter a positive integer: ");
        if (myScanner.hasNextInt()){
            input = myScanner.nextInt();
            if (input > 0 ){//input is postive integer
                while( array2[index] != input){
                    if (array2[index] < input){
                        lowerBound = index ;
                        index = (upperBound - lowerBound) / 2;
                    }//end of if
                    else if (array2[index] > input) {
                        upperBound = index ;
                        index = (upperBound - lowerBound) / 2;
                    }
                    if(array2[index] == input){
                        System.out.println(input + " was found in the list");
                        break;
                    }//end of if
                    if(index == lowerBound || index == upperBound){
                        if(array2[upperBound] == input){
                        System.out.println(input + " was found in the list");
                        break;
                        }//end of if
                        System.out.println(input + " was not found in the list");
                        System.out.println("The number below the key was " + array2[lowerBound]);
                        System.out.println("The number above the key was " + array2[upperBound]);
                        break;//break the while loop
                    }
                }//end of while loop
            }//end of if
            else{
                System.out.println("");
                System.out.println("You did not enter a postive integer.");
            }
        }//end of if
        else{
            myScanner.next();
            System.out.println("");
            System.out.println("You did not enter an integer.");
        }//end of else
    }//end of main method
}//end of class
