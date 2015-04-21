/*Generate two 2-dimensional random matrix. And compute the product
of Matrix 1 and Matrix. 
Shuotao Diao, shd314@lehigh.edu*/
import java.util.Scanner;//import Scanner class
public class Multiply{//class name
    public static void main(String[] args){//main method
        Scanner myScanner = new Scanner( System.in );//declare Scanner object
        int matrix1Width = 0;
        while(true){
        System.out.print("Please enter the width of matrix 1: ");
        if (myScanner.hasNextInt()){
        matrix1Width = myScanner.nextInt();//store width of matrix 1
          if(matrix1Width > 0){//input is positive integer
              break;
          }//end of if 
          else{//input isn't positive integer
              System.out.println("Error: input isn't postive integer");
          }//end of else
        }//end of if
        else{
            myScanner.next();
            System.out.println("Error: invalid input!");
        }
        }//end of while loop
        int matrix1Height = 0;
        while(true){
        System.out.print("Please enter the height of matrix 1: ");
        if (myScanner.hasNextInt()){
        matrix1Height = myScanner.nextInt();//store length of matrix 1
          if(matrix1Height > 0 ){
              break;
          }
          else{
              System.out.println("Error: input isn't postive integer");
          }
        }
        else{
            myScanner.next();
            System.out.println("Error: invalid input!");
        }
        }
        int[][] matrix1;//declare 2-dimensional arrays called matrix 1
        matrix1 = randomMatrix(matrix1Width , matrix1Height);//generate random matrix
        printMatrix(matrix1);//display matrix 1
        int matrix2Width = 0;
        while(true){
        System.out.print("Please enter the width of matrix 2: ");
        if (myScanner.hasNextInt()){
        matrix2Width = myScanner.nextInt();//store width of matrix 1
          if(matrix2Width > 0 ){
              break;
          }
          else{
              System.out.println("Error: input isn't postive integer");
          }
        }//end of if
        else{
            myScanner.next();
            System.out.println("Error: invalid input!");//print out error warning
        }
        }//end of while loop
        int matrix2Height = 0;
        while(true){
        System.out.print("Please enter the height of matrix 2: ");
        if(myScanner.hasNextInt()){
        matrix2Height = myScanner.nextInt();//store length of matrix 2
          if(matrix2Height > 0){
              if (matrix2Height == matrix1Width){
              break;//break the while loop
              }
              else{
                  System.out.println("Error: width of matrix 1 doesn't equal to " + 
            " the height of matrix 2!");
              }
          }
          else{
              System.out.println("Error: input isn't postive integer");
          }
        }
        else{
            myScanner.next();
            System.out.println("Error: invalid input!");//print out error warning
        }//end of else statement
        }
        int[][] matrix2;//declare 2-dimensional arrays called matrix 2
        matrix2 = randomMatrix(matrix2Width , matrix2Height);//generate random matrix
        printMatrix(matrix2);//display matrix 2
        int[][] matrixProduct;
        matrixProduct = matrixMultiply(matrix1, matrix2 );//compute of product of 
        //matrix 1 and matrix 2
    }//end of main method
    public static int[][] randomMatrix(int width, int height){
        int[][] matrix = new int[height][width];//row major
        for(int i = 0; i < height; i++){
            for(int j = 0; j < width; j++){
                matrix[i][j] = (int) (21 * Math.random() - 10);//generate random
                //variable between -10 and 10
            }
        }
        return matrix;
    }//end of randomMartix method
    public static void printMatrix(int[][] matrix){//display matrix
        for(int i = 0; i < matrix.length; i++){
            System.out.print("[ ");//print out brace
            for(int j = 0; j < matrix[i].length; j++){
                System.out.print(matrix[i][j] + " ");//print out one cell of array
            }
            System.out.println("]");//print out brace
        }
    }//end of printMatrix method
    public static int[][] matrixMultiply(int[][] matrix1, int[][] matrix2){
        if (matrix1[0].length == matrix2.length){
            //width of matrix 1 equals to the height of matrix 2
            int[][] matrix = new int[ matrix1.length ][ matrix2[0].length ];
            //declare new array called matrix
            //compute matrix product
            for (int i = 0; i < matrix1.length; i++ ){
                for (int j = 0; j < matrix2[0].length; j++ ){
                    matrix[i][j] = 0;
                    for (int k = 0; k < matrix1[i].length; k++){
                        matrix[i][j] += matrix1[i][k] * matrix2[k][j];
                    }//end of for loop
                }//end of for loop
            }//end of for loop
            System.out.println("Product of two matrices: ");
            printMatrix(matrix);//display prodcut of two matrices
            return matrix;//return matrix
        }//end of if statement
        else{
            System.out.println("Error: width of matrix 1 doesn't equal to " + 
            " the height of matrix 2!");//print out error
            return null;//return null
        }
    }//end of matrixMultiply method
}//end of class