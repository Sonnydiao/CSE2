/*Printing out smilely faces 
Shuotao Diao shd314@lehigh.edu*/

public class SmileGenerator{//define name of class
    public static void main(String[] args){
        //main method 
        int i = 0;//initialize counter
        //step 1 part 1
        System.out.println("Step 1");//show step 1
        while ( i < 5 ){
            System.out.print(":)");//printing out smiley faces
            i++;//counter plus 1 
        }
        System.out.println("Step 2");//show step 2
        //step 2 part 2
        int numberOfSmilelyFaces = (int) ( 100 * Math.random()) + 1;
        //generate random number of simlely faces
        i = 0;//initialize counter
        while ( i < numberOfSmilelyFaces ){
            System.out.print(":)");//printing out smiley faces
            i++;//counter plus 1 
        }
        System.out.println("Step 3");//show step 3
        i = 0;//initialize counter
        while ( i < numberOfSmilelyFaces ){
            System.out.print(":)");//printing out smiley faces
            i++;//counter plus 1 
            if ( i >= 30 ){
                break;
            }
        }
        System.out.println("Step 4");//show step 4
        i = 0;//initialize counter
        int j = 0, k = 2 ;//define another counter which is used to
        //determine when to retrun
        while ( i < 10 ){
            System.out.print(":)");//print out smilely face
            if ( i == j ){//detect when to add enter
                j += k;
                k++;
                System.out.println("");
            }
            i++;
        }
    }//end of main method
}//end of class