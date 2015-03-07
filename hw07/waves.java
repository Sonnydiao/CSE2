/*Prompt the user to enter an integer between 1 and 30
inclusively, and print out displays based on the input. 
For example, if the user enter 7. It will print out 7 waves.
The rule of printing out waves is that the ith wave is upside
down triangle which has i rows if i is odd. Vice versa. 
Shuotao Diao, shd314@lehigh.edu*/
import java.util.Scanner;//import Scanner class
public class waves{//class name
    public static void main(String[] args){//main method
        Scanner myScanner = new Scanner( System.in );
        int input; //declare input variable
        System.out.print("Enter a number between 1 and 30: ");
        input = myScanner.nextInt();
        System.out.println("FOR LOOP");//print out result based
        //on for loop
        for ( int i = 1 ; i <= input ; i++ ){//total numnber of 
        //triangle is input
            for ( int j = 1; j <= i ; j++ ){//ith triangle(row)
                if ( i % 2 == 1){//i is odd
                    for ( int k = j ; k <= i ; k++ ){//column
                        System.out.print(i);//print out i
                    }//end of 3rd for loop
                    System.out.println("");//go to the next line
                }//end of if statement
                else{//i is even
                    for ( int k = j ; k > 0 ; k-- ){//column
                        System.out.print(i);//print out i
                    }//end of 4th for loop
                    System.out.println("");//go to the next line
                }//end of else statement
            }//end of 2nd for loop
        }//end of 1st for loop
        System.out.println("");//go to the next line 
        System.out.println("WHILE LOOP");//print out result
        //based on while loop
        int i = 1, j = 1, k = 0;//initialize counter
        while ( i <= input ){//1st while loop total number of triangles
        j = 1;//refresh counter
            while ( j <= i ){//2nd while loop ith triangle
                if ( i % 2 == 1){//i is odd
                k = j;
                while ( k <= i){//3rd while loop
                    System.out.print(i);//print out i
                    k++;
                }//end of 3rd while loop
                System.out.println("");//go to the next line
                }//end of if statement
                else{
                k = j;
                while ( k > 0 ){//4th while loop
                    System.out.print(i);//print out i
                    k--;
                }//end of 4th while loop
                System.out.println("");//go to the next line
                }//end of else statement
                j++;//increment counter
            }//end of 2nd while statement
            i++;
        }//end of 1st while statement
        System.out.println("");//go to the next line 
        System.out.println("DO WHILE LOOP");//print out result
        i = 1;
        j = 1;
        k = 0;//initialize counter
        //based on do while loop
        do{//1st do while loop
            j = 1;//refresh counter
            do{//2nd do while loop
                if ( i % 2 == 1){//i is odd
                k = j;
                do{//3rd do while loop
                    System.out.print(i);//print out i
                    k++;
                }while ( k <= i);//end of 3rd do while loop
                System.out.println("");//go to the next line
                }//end of if statement
                else{//i is even
                    k = j;
                    do{//4th do while loop
                    System.out.print(i);//print out i
                    k--;
                }while ( k > 0 );//end of 4th do while loop
                System.out.println("");//go to the next line
                }
                j++;//increment counter
            }while( j <= i);//end of 2nd do while loop
            i++;//increment counter
        } while( i <= input );//end of 1st do while loop
    }//end of main method
}//end of class
