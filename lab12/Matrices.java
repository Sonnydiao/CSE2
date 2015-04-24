/*print out and operate on row and column major
matrices represented by two dimensional arrays 
Shuotao Diao, shd314@lehigh.edu*/

//import java.util.Scanner;//import Scanner class
public class Matrices{//class name
    public static void main(String[] args){//main method
        //Scanner myScanner = new Scanner( System.in );//declare 
        //Scanner object
        System.out.println("Matrix 1");
        //System.out.print("Width: ");//prompt the user to enter width of matrix
        //int widthMatrix1 = myScanner.nextInt();//store input
        int widthMatrix1 = (int)(Math.random() * 6) + 1;//genterate the width of matrix
        int widthMatrix2 = widthMatrix1;//let the width of matrix2 equal to the width of matrix1
        //System.out.print("Height: ");//prompt the user to enter length of matrix
        //int heightMatrix1 = myScanner.nextInt();//store input 
        int heightMatrix1 = (int)(Math.random() * 6) + 1;//generate the height of matrix
        int heightMatrix2 = heightMatrix1;//let the height of matrix2 equal to the width of matrix1
        //System.out.println("Row-Major? (Y/N): ");
        //String inputMatrix1 = myScanner.next();
        boolean formatMatrix1 = true;
        /*switch (inputMatrix1){
            case "y":
            case "Y": formatMatrix1 = true;
                      break;
            case "n":
            case "N": formatMatrix1 = false;
                      break;
            default : break;
        }*/
        int[][] matrix1;
        matrix1 = increasingMatrix(widthMatrix1, heightMatrix1, formatMatrix1);//genterate matrix 1
        System.out.println("Generating a matrix with width " 
        +  widthMatrix1 + " and height " + heightMatrix1 + " :");
        printMatrix(matrix1,formatMatrix1);//print out the matrix1
        /*printMatrix(matrix1,formatMatrix1);//print out the matrix1
        //prompt the user to enter widths and heights of matrix 2
        System.out.println("*************************");
        System.out.println("Matrix 2");
        System.out.print("Width: ");//prompt the user to enter width of matrix
        int widthMatrix2 = myScanner.nextInt();//store input 
        System.out.print("Height: ");//prompt the user to enter length of matrix
        int heightMatrix2 = myScanner.nextInt();//store input 
        System.out.println("Row-Major? (Y/N): ");
        String inputMatrix2 = myScanner.next();*/
        boolean formatMatrix2 = true;
        /*switch(inputMatrix2){
            case "y":
            case "Y": formatMatrix2 = true;
                      break;
            case "n":
            case "N": formatMatrix2 = false;
                      break;
            default : break;
        }*/
        int[][] matrix2;
        matrix2 = increasingMatrix(widthMatrix2, heightMatrix2, formatMatrix2);//generate matrix 2
        System.out.println("*************************");
        System.out.println("Matrix 2");
        System.out.println("Generating a matrix with width " 
        +  widthMatrix2 + " and height " + heightMatrix2 + " :");
        printMatrix(matrix2,formatMatrix2);//print out the matrix2
        int widthMatrix3 = (int)(Math.random() * 6) + 1;//genterate the width of matrix
        int heightMatrix3 = (int)(Math.random() * 6) + 1;//genterate the width of matrix
        boolean formatMatrix3 = false;
        int[][] matrix3 = increasingMatrix(widthMatrix3, heightMatrix3, formatMatrix3);//generate matrix 3
        System.out.println("*************************");
        System.out.println("Matrix 3");
        System.out.println("Generating a matrix with width " 
        +  widthMatrix3 + " and height " + heightMatrix3 + " :");
        printMatrix(matrix3,formatMatrix3);//print out matrix 3
        System.out.println("Add two matrices");
        int[][] addMatrix1 = addMatrix(matrix1,formatMatrix1,matrix2,formatMatrix2);
        System.out.println("Output:");
        printMatrix(addMatrix1,true);//print out sum of two matrices
        System.out.println("*************************");
        System.out.println("Add two matrices");
        int[][] addMatrix2 = addMatrix(matrix1,formatMatrix1,matrix3,formatMatrix3);
        System.out.println("Output:");
        printMatrix(addMatrix2,true);//print out sum of two matrices
    }//end of main method
    public static int[][] increasingMatrix(int width, int height, boolean format){
        int[][] matrix;//declare matrix array
        if (format){//row-major generate
            matrix = new int[height][width];
        for(int i = 0; i < height; i++){
            for(int j = 0; j < width; j++){
                matrix[i][j] = i * width + j + 1;
            }//end of 2nd for
        }//end of 1st for
        }//end of if
        else{//column-major generate
            matrix = new int[width][height];
            for(int i = 0; i < width;i++){
                for(int j = 0; j < height;j++){
                    matrix[i][j] = i + j * width + 1;
                }
            }
        }
        return matrix;//return martix array
    }//end of increasingMartix
   public static void printMatrix(int[][] array, boolean format){
       if(array == null){
           System.out.println("The array was empty.");
           return;
       }//end of if
       if(format){//row major
           for(int i = 0; i < array.length; i++){//row
               System.out.print("[ ");
               for(int j = 0; j < array[0].length; j++){
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
   public static int[][] translate(int[][] array, boolean format){
       int[][] newArray = new int[array[0].length][array.length];//declare new 2-D array
       if(!format){//column major
         for(int i = 0;i < array[0].length;i++){
            for(int j = 0;j < array.length;j++){
                newArray[i][j] = array[j][i];
            }//end of for   
         }//end of for
         return newArray;
       }
       else{//row major
           return array;
       }
   }//end of translate method
   public static int[][] addMatrix(int[][] a, boolean formatMatrix1, 
   int[][] b, boolean formatMatrix2){
       int[][] matrix1;
       if(!formatMatrix1){//column major
            System.out.println("tanslate column major into row major");
            matrix1 = translate(a,formatMatrix1);//translate the array1
            formatMatrix1 = true;//it is row major now
        }//end of if statement
        else{//row major
            matrix1 = a;
        }
        int[][] matrix2;
        if(!formatMatrix2){//column major
            System.out.println("tanslate column major into row major");
            matrix2 = translate(b,formatMatrix2);//translate the array2
            formatMatrix2 = true;//it is row major now
        }//end of if statements 
        else{//row major
            matrix2 = b;
        }
        if(matrix1.length == matrix2.length && matrix1[0].length == matrix2[0].length){
            int[][] matrix = new int[matrix1.length][matrix1[0].length];
            for(int i = 0; i < matrix.length; i++){
                for(int j = 0; j < matrix[0].length; j++){
                    matrix[i][j] = matrix1[i][j] + matrix2[i][j];
                }
            }
            printMatrix(matrix1,formatMatrix1);//print out the matrix1
            System.out.println("plus");
            printMatrix(matrix2,formatMatrix2);//print out the matrix2
            return matrix;
        }
        else{
            System.out.println("The arrays can't be added!");
            return null;
        }
   }
}//end of class