/*A two dimensional ragged array of five rows of
ints is generated. The jth row should have
length equal to j*3+5.(1) Fill the array with random numbers in the 
range 0...39.(2) Display the array.(3) Sort each row of the array in ascending order.
(4) Display the array.(5) Convert each member array into a new member array 
that is the same size asthe largest member array, and initialize
all new array members to zero.
Shuotao Diao, shd314@lehigh.edu*/
public class raggedArray{//classs name
    public static void main(String[] args){//main method
        System.out.println("The array before sorting");
        int[][] array1 = new int[5][];//delcare 2-D array called array1
        for(int i = 0; i < array1.length;i++){
            array1[i] = new int[i * 3 + 5];
            System.out.print("Row " + i +" : ");
            for(int j = 0;j < array1[i].length;j++){
                array1[i][j] = (int)(Math.random() * 40);//fill the array with random numbers
                System.out.print(" " + array1[i][j]);//print out the member at ith row and jth column
                if(array1[i][j] < 10){
                    System.out.print(" ");//add a space if value is less than 10
                }
            }//end of for loop
            System.out.println("");//go to the next line
        }//end of for loop
        System.out.println("The array after sorting");
        for(int i = 0;i < array1.length;i++){
           sortArray(array1[i]);//sort array1
           System.out.print("Row " + i +" : ");
           for(int j = 0;j < array1[i].length;j++){
               System.out.print(" " + array1[i][j]);//print out the member at ith row and jth column
               if(array1[i][j] < 10){
                    System.out.print(" ");//add a space if value is less than 10
                }
           }
           System.out.println("");//go to the next line
        }//end of for loop
        int[][] array2 = new int[5][4 * 3 + 5];
        //fill the array2 with zeros
        for(int i = 0;i < 5;i++){
            for(int j = 0;j < array2[0].length;j++){
                array2[i][j] = 0;
            }//end of for loop
        }//end of for loop
        //copy array1 to array2
        for(int i = 0;i < 5;i++){
            for(int j = 0;j < array1[i].length;j++){
                array2[i][j] = array1[i][j];
            }
        }
        System.out.println("The array after sorting and copying");
        for(int i = 0;i < 5;i++){
            System.out.print("Row " + i + " :");
            for(int j = 0;j < array2[i].length;j++){
                System.out.print(" " + array2[i][j]);
                if(array2[i][j] < 10){
                    System.out.print(" ");//add a space if value is less than 10
                }
            }
            System.out.println("");
        }
    }//end of main method
    public static void sortArray(int[] array){
        int temp = 0;
        for(int i = 0; i < array.length;i++){
            for(int j = i + 1; j < array.length;j++){
                if(array[i] > array[j]){//swap
                    temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
            }//end of for
        }//end of for loop
    }//end of sortArray method
}//end of class