/*4D ragged array containing random doubles between 0 and 30 is
generated. For a given subarray within the 4D array, make sure 
its length is between X and Y elements long, where X and Y are 
user integer inputs and X < Y.
Shuotao Diao, shd314@lehigh.edu*/
import java.util.Scanner;//import Scanner Class
public class FourDwins{//class name
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);//declare Scanner object
        System.out.print("Enter an integer X: ");//prompt the user to enter the value of X
        int X = myScanner.nextInt();//store the value of X
        System.out.print("Enter an integer Y where Y > X: ");//prompt the user 
        //to enter the value of Y
        int Y = myScanner.nextInt();//store the value of Y
        int range = Y - X + 1;
        //generate the length of 3D array
        int length3D = (int) (range * Math.random()) + X;
        //System.out.println(length3D);
        //generate the length of 2D array
        int length2D = (int) (range * Math.random()) + X;
        //System.out.println(length2D);
        //generate the length of 1D array
        int length1D = (int) (range * Math.random()) + X;
        //System.out.println(length1D);
        int numberOfMembers = 3 * length1D * length2D * length3D;
        double sum = 0;
        double[][][][] array = new double[3][length3D][length2D][length1D];
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < length3D; j++){
                for(int k = 0; k < length2D; k++){
                    for(int l = 0; l < length1D; l++){
                        array[i][j][k][l] = ((int)(310 * Math.random())) / 10.0;//1 decimal point
                        sum += array[i][j][k][l];//sum up the members
                    }//end of 4th for loop
                }//end of 3rd for loop
            }//end of 2nd for loop
        }//end of 1st for loop
        System.out.println("Original Array:");
        printArray(array);
        for(int i = 0; i < 3; i++){
            
            sort3DArray(array[i]);
        }
        System.out.println("Sorted Array:");
        printArray(array);
        double mean = sum / numberOfMembers;
        System.out.println("Members : " + numberOfMembers);
        System.out.println("Sum : " + (int)(sum * 10) / 10.0);
        System.out.println("Mean: " + (int)(mean * 10) / 10.0);
    }//end of main method  
    public static void printArray(double[][][][] array){
        System.out.print("{");
        for(int i = 0; i < 3; i++){
            System.out.print("{");
            for(int j = 0; j < array[0].length; j++){
                System.out.print("{{");
                for(int k = 0; k < array[0][0].length; k++){
                    //System.out.print("{");
                    for(int l = 0; l < array[0][0][0].length; l++){
                        if(l == array[0][0][0].length - 1 && k == array[0][0].length - 1){
                            System.out.print(array[i][j][k][l]);
                        }
                        else{
                        System.out.print(array[i][j][k][l] + ", ");
                        }
                    }//end of 4th for loop
                    /*if(k == array[0][0][0].length - 1){
                    System.out.print("}");
                }
                else {
                    System.out.print("}, ");
                }*/
                }//end of 3rd for loop
              if(j == array[0][0].length - 1){
                System.out.print("}}");
            }
            else{
            System.out.print("}}, ");
            }  
            }//end of 2nd for loop
            if(i == 2){
                System.out.print("}");
            }
            else{
            System.out.print("}, ");
            }
        }//end of 1st for loop
        System.out.println("}");
    }//end of printArray method
    public static void sort3DArray(double[][][] array){
        //System.out.println(array[0].length);
        //System.out.println(array[0][0].length);
        for(int i = 0; i < array.length;i++ ){
            for(int j = 0;j < array[0].length;j++){
                for(int k = 0;k < array[0][0].length;k++ ){
                    double min = array[i][j][k];
                    //System.out.println(min);
                    double temp = 0;
                    int index1 = j, index2 = k;
                    for(int l = j;l < array[0].length;l++){
                        for(int m = k;m < array[0][0].length;m++)
                        if (min > array[i][l][m]){
                            min = array[i][l][m];
                            index1 = l;
                            index2 = m;
                        }
                    }
                    //swap
                    //if(index1 != j && index2 != k){
                    temp = array[i][j][k];
                    array[i][j][k] = array[i][index1][index2];
                    array[i][index1][index2] = temp;
                    //}
                }
            }
        }//end of 1st for loop
        //return array;
    }//end of sort3DArray
}//end of class