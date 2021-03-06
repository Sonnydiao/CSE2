/*4D ragged array containing random doubles between 0 and 30 is
generated. For a given subarray within the 4D array, make sure 
its length is between X and Y elements long, where X and Y are 
user integer inputs and X < Y.
Shuotao Diao, shd314@lehigh.edu*/
import java.util.Scanner;//import Scanner Class
public class FourDwins{//class name
    public static void main(String[] args){
        Scanner myScanner = new Scanner(System.in);//declare Scanner object
        int X = 0;
        while(true){
        System.out.print("Enter an integer X: ");//prompt the user to enter the value of X
        if(myScanner.hasNextInt()){
            X = myScanner.nextInt();//store the value of X
            if(X > 0){
                break;
            }
            else{
                System.out.println("Error:Input is negative!");
            }
        }
        else{
           System.out.println("Error:Input isn't integer!");
           myScanner.next();
        }
        }
        int Y = 0;//declare integer variable called Y
        while(true){
        System.out.print("Enter an integer Y where Y > X: ");//prompt the user 
        //to enter the value of Y
        if(myScanner.hasNextInt()){
            Y = myScanner.nextInt();//store the value of Y
            if(Y > X){
                break;
            }
            else{
                System.out.println("Error:Input isn't larger than X!");
            }
        }
        else{
            System.out.println("Error:Input isn't integer!");
            myScanner.next();
        }
        }
        int range = Y - X + 1;
        double[][][][] array;
        array = new double[3][][][];
       // double[][][][] array = new double[3][length3D][length2D][length1D];
        for(int i = 0; i < 3; i++){
            //generate the length of 3D array
            int length3D = (int) (range * Math.random()) + X;
            array[i] = new double[length3D][][];
            for(int j = 0; j < length3D; j++){
                //generate the length of 2D array
                int length2D = (int) (range * Math.random()) + X;
                array[i][j] = new double[length2D][];
                for(int k = 0; k < length2D; k++){
                    //generate the length of 1D array
                    int length1D = (int) (range * Math.random()) + X;
                    array[i][j][k] = new double[length1D];
                    for(int l = 0; l < length1D; l++){
                        array[i][j][k][l] = ((int)(310 * Math.random())) / 10.0;//1 decimal point
                    }//end of 4th for loop
                }//end of 3rd for loop
            }//end of 2nd for loop
        }//end of 1st for loop
        System.out.println("Original Array:");
        printArray(array);//print out array
        sort4DArray(array);//sort 4D array
        System.out.println("Sorted Array:");
        printArray(array);
        statArray(array);//compute sum, mean and number of members of array
        //and print out the result
    }//end of main method  
    public static void printArray(double[][][][] array){
        System.out.print("{");
        for(int i = 0; i < 3; i++){
            System.out.print("{");
            for(int j = 0; j < array[i].length; j++){
                System.out.print("{");
                for(int k = 0; k < array[i][j].length; k++){
                    System.out.print("{");
                    for(int l = 0; l < array[i][j][k].length; l++){
                        if(l == array[i][j][k].length - 1){
                            System.out.print(array[i][j][k][l]);
                        }
                        else{
                        System.out.print(array[i][j][k][l] + ", ");
                        }
                    }//end of 4th for loop
                    if(k == array[i][j][k].length - 1){
                    System.out.print("}");
                }
                else {
                    System.out.print("}, ");
                }
                }//end of 3rd for loop
              if(j == array[i][j].length - 1){
                System.out.print("}");
            }
            else{
            System.out.print("}, ");
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
            for(int j = 0;j < array[i].length;j++){
                for(int k = 0;k < array[i][j].length;k++ ){
                    double min = array[i][j][k];
                    //System.out.println(min);
                    double temp = 0;
                    int index = k;
                        for(int m = k + 1;m < array[i][j].length;m++)
                        if (min > array[i][j][m]){
                            min = array[i][j][m];
                            index = m;
                        }
                    //swap
                    //if(index1 != j && index2 != k){
                    temp = array[i][j][k];
                    array[i][j][k] = array[i][j][index];
                    array[i][j][index] = temp;
                    //}
                }
            }
        }//end of 1st for loop
        //return array;
    }//end of sort3DArray
    public static void sort4DArray(double[][][][] array){
        for(int i = 0; i < 3; i++){
            sort3DArray(array[i]);
        }
        int index1 = 0;
        int index2 = 0;
        for(int i = 1; i < 3; i++){
            for(int j = i - 1;j >= 0; j--){
                index1 = j + 1;
                index2 = j;
                if (array[index1].length < array[index2].length){
                double[][][] temp;
                //swap
                temp = array[index1];
                array[index1] = array[index2];
                array[index1] = temp;
            }
                else if(array[index1].length == array[index2].length){
                    if(minArray(array[index1]) < minArray(array[index2])){
                        double[][][] temp;
                        //swap
                        temp = array[index1];
                        array[index1] = array[index2];
                        array[index1] = temp;
                    }
                }
            }
        }
    }
    public static void statArray(double[][][][] array){
        double sum = 0;
        for(int i = 0; i < 3; i++){
            for(int j = 0; j < array[i].length; j++){
                for(int k = 0; k < array[i][j].length; k++){
                    for(int l = 0; l < array[i][j][k].length; l++){
                        sum += array[i][j][k][l];//sum up the members
                    }//end of 4th for loop
                }//end of 3rd for loop
            }//end of 2nd for loop
        }//end of 1st for loop
        int numberOfMembers = 3 * array[0].length * array[0][0].length * array[0][0][0].length;
        double mean = sum / numberOfMembers;
        System.out.println("Members : " + numberOfMembers);
        System.out.println("Sum : " + (int)(sum * 10) / 10.0);
        System.out.println("Mean: " + (int)(mean * 10) / 10.0);
    }
    public static double minArray(double[][][] array){
        double min = 0;
        for(int i = 0; i < array.length;i++){
            for(int j = 0; j < array[i].length;j++){
                for(int k = 0;k < array[i][j].length;k++){
                    if(min > array[i][j][k]){
                        min = array[i][j][k];
                    }
                }
            }
        }
        return min;
    }//end of minArray method
}//end of class