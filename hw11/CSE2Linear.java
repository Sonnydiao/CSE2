/*Prompt the user to enter 15 grades which are from smallest to
largest. Print out error if the user didn't enter correct grades.
Then scamble the sorted array randomly.
Shuotao Diao, shd3142lehigh.edu*/
import java.util.Scanner;//import Scanner class
public class CSE2Linear{//class name
    public static void main(String[] args){//main method
        Scanner myScanner = new Scanner( System.in );
        System.out.println("Enter 15 ints for final grades in CSE2:");
        int[] grades = new int[15];//declare integer array called grades
        //enter the first grade
        while(true){
            System.out.print("[0] : ");
            if(myScanner.hasNextInt()){//input is integer
                grades[0] = myScanner.nextInt();//store input integer
                if(grades[0] >= 0 && grades[0] <=100){//input is in the range
                    break;
                }
                else{
                    System.out.println("Eroor: Input is out of the range from 0-100");
                    System.out.print("Please enter again: ");
                }
            }//end of if
            else{//input is not integer
                myScanner.next();
                System.out.println("Error: Input is not integer!");
                System.out.print("Please enter again: ");
            }//end of else
        }
        for(int i = 1; i < 15;){
            System.out.print("[" + i + "] : ");
            if(myScanner.hasNextInt()){//input is integer
                grades[i] = myScanner.nextInt();//store input integer
                if(grades[i] >= 0 && grades[i] <= 100){//input is in the range
                    if(grades[i] >= grades[i - 1] ){//greater or equal to the last one
                        i++;
                    }//end of if 
                    else{
                        System.out.println("Eroor: Input is not greater or equal to the last one!");
                        System.out.print("Please enter again: ");
                    }//end of else
                }
                else{
                    System.out.println("Eroor: Input is out of the range from 0-100!");
                    System.out.print("Please enter again: ");
                }
            }//end of if 
            else{//input is not integer
                myScanner.next();
                System.out.println("Error: Input is not integer!");
                System.out.print("Please enter again: ");
            }//end of else
        }//end of for loop
        System.out.print("The grades sorted are: ");
        for(int i = 0; i < grades.length; i++){//print out array
            System.out.print(grades[i] + " ");
        }
        binarySearch(myScanner, grades);
        //int[] gradesScramble = new int[15];
        //gradesScamble = scramble(grades);
        scramble(grades);
        System.out.println("Scrambled:");
        for(int i = 0; i < grades.length; i++){//print out array
            System.out.print(grades[i] + " ");
        }
        linearSearch(myScanner, grades);
    }//end of main method
    public static void binarySearch(Scanner scan, int[] array){
        int target = 0;
        while(true){
            System.out.print("Enter a grade to search for: ");
            if (scan.hasNextInt()){//input is integer
               target = scan.nextInt();
               if (target >= 0 && target <= 100){
                   break;//break the while loop
               }//end of if
            }//end of if
            else{//input is not integer
                scan.next();
            }//end of else
        }
        int lowerBound = 0, upperBound = 14;//declare upperBound and lowerBound
        int i = 1, index = (upperBound + lowerBound) / 2;//declare counter and index
        while(target != array[index]){
            i++;
            if(array[index] < target){
                lowerBound = index;//renew lowerBound
                index = (upperBound + lowerBound) / 2;//renew index
            }//end of if
            else if (array[index] > target){
                upperBound = index;//renew upperBound
                index = (upperBound + lowerBound) / 2;//renew index
            }//end of else if
            if (target == array[index]){
                break;
            }//end of if
            if (index == lowerBound || index == upperBound){
                if (target == array[upperBound]){
                    i++;
                    break;
                }//end of if
                System.out.println(target + " wasn't found in the list with " +
                i + " iterations");
                return;
            }
            if (target == array[index]){
                break;
            }//end of if
        }//end of while
        System.out.println(target + " was found in the list with " +
                i + " iterations");
    }//end of binarySearch method
    public static void scramble(int[] array){
        int intermediate = 0;
        int index = 0;
        for (int i = 0; i < 8; i++ ){
            intermediate = array[i];
            index = (int)( Math.random() * 15 );
            array[i] = array[index];
            array[index] = intermediate;
        }
    }//end of scramble
    public static void linearSearch(Scanner scan, int[] array){
        int target = 0;
        while(true){
            System.out.print("Enter a grade to search for: ");
            if (scan.hasNextInt()){//input is integer
               target = scan.nextInt();
               if (target >= 0 && target <= 100){
                   break;//break the while loop
               }//end of if
            }//end of if
            else{//input is not integer
                scan.next();
            }//end of else
        }
        int counter = 1;
        for(int i = 0; i < array.length; i++, counter++){
            if(target == array[i]){
                System.out.println(target + " was found in the list with " + counter + " iterations");
                return;
            }
        }//end of for loop
        System.out.println(target + "wasn't found in the list");
    }//end of linearSearch
}//end of class