/*Use do-while loops and the random number generator to
generate an integer between 0 and 100. Firstly, print out the number.
If the number is even, you will then print out that number 
of “*” characters; if the number is odd, then you will print
out that number of “&” characters.
Shuotao Diao, shd314@lehigh.edu*/
public class MakeSymbols{//define class name
    public static void main( String[] args ){//main method
    int randomNumber = (int)( Math.random()*101 );
    //generate random between 0 and 100 inclusively
    System.out.println("Random Number generated: " + randomNumber);
    //print out random number
    int i = 0;//declare counter
        if ( randomNumber % 2 == 0 && randomNumber != 0){//if randomNumber is even
        do{
        System.out.print("*");//print out *
        i++;//increment counter
        }while( i < randomNumber );//end of loop
        }//end of if statement
        else{//randomNumber is odd
        do{
        System.out.print("&");//print out &
        i++;//increment counter
        }while( i < randomNumber );//end of loop
        }//end of else statement
    System.out.println("");
    }//end of main method
}//end of class
