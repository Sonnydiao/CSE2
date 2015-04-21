/*print out and operate on row and column major
matrices represented by two dimensional arrays 
Shuotao Diao, shd314@lehigh.edu*/

import java.util.Scanner;//import Scanner class
public class Matrices{//class name
    public static void main(String[] args){//main method
        Scanner myScanner = new Scanner( System.in );//declare 
        //Scanner object
        System.out.print("Width: ");//prompt the user to enter width of matrix
        int width = myScanner.nextInt();//store input 
        System.out.println("");//go to the next line
        System.out.print("length: ");//prompt the user to enter length of matrix
        int length = myScanner.nextInt();//store input 
        System.out.println("");//go to the next line
        System.out.println("Row-Major? (Y/N): ");
        String input = myScanner.next();
        boolean format = true;
        switch (input){
            case "y":
            case "Y": format = true;
                      break;
            case "n":
            case "N": format = false;
                      break;
            default : break;
        }
        int[][] matrix;
        if (format){
            matrix = new int[length][width];//row major
        }
        else{
            matrix = new int[width][length];//column major
        }
        matrix = increasingMatrix(width, length, format);
        printMatrix(matrix,format);
    }//end of main method
    public static int[][] increasingMatrix(int width, int length, boolean format){
        int[][] matrix;//declare matrix array
        if (format){//row-major generate
            matrix = new int[length][width];
        for(int i = 0; i < length; i++){
            for(int j = 0; j < width; j++){
                matrix[i][j] = i * width + j + 1;
            }//end of 2nd for
        }//end of 1st for
        }//end of if
        else{//column-major generate
            matrix = new int[width][length];
            for(int i = 0; i < width;i++){
                for(int j = 0; i < length;j++){
                    matrix[i][j] = i + j * length + 1;
                }
            }
        }
        return matrix;//return martix array
    }//end of increasingMartix
   public static void printMatrix(int[][] array, boolean format){
       if(format){//row major
           for(int i = 0; i < array.length; i++){//row
               System.out.print("[ ");
               for(int j = 0; j < array[i].length; j++){
                   System.out.print(array[i][j] + " ");
               }
               System.out.println("]");
           }
       }
       else{//column major
       for(int j = 0; j< array[0].length;j++){
           System.out.print("[ ");
           for(int i = 0; i < array.length;i++){//column
               System.out.print(array[i][j] + " ");
           }
           System.out.println("]");
       }
       }
   }//end of printMatrix
}//end of class