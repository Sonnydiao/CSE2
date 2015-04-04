/*(1) The randomInput() method generates an array of 10 random integers between 0
to 9. Implement randomInput so that it fills the array with random integers and
returns the filled array.
(2) The method delete(list,pos) takes, as input, an integer array called list and an
integer called pos. It should create a new array that has one member fewer than
list, and be composed of all of the same members except the member in the
position pos.
Shuotao Diao, shd314@lehigh.edu*/

import java.util.Scanner;
public class RemoveElements{
public static void main(String [] arg){
Scanner scan=new Scanner(System.in);
int num[]=new int[10];
int newArray1[];
int newArray2[];
int index,target;
String answer="";
do{
System.out.print("Random input 10 ints [09]");
num = randomInput();//generate random intger array
String out = "The original array is:";
out += listArray(num);
System.out.println(out);
System.out.print("Enter the index ");
index = scan.nextInt();
newArray1 = delete(num,index);
String out1="The output array is ";
out1+=listArray(newArray1); //return a string of the form "{2, 3, 9}"
System.out.println(out1);
System.out.print("Enter the target value ");
target = scan.nextInt();
newArray2 = remove(num,target);
String out2="The output array is ";
out2+=listArray(newArray2); //return a string of the form "{2, 3, 9}"
System.out.println(out2);
System.out.print("Go again? Enter 'y' or 'Y', anything else to quit")
;
answer=scan.next();
}while(answer.equals("Y") || answer.equals("y"));
}
public static String listArray(int num[]){
String out="{";
for(int j=0;j<num.length;j++){
if(j>0){
out+=", ";
}
out+=num[j];
}
out+="} ";
return out;
}
//randomInput method which is used to generate random integer array
public static int [] randomInput(){
    int [] num = new int[10];//initialize the size of integer array
    for (int i = 0; i < num.length;i++){
        num[i] = (int) (Math.random() * 10);
    }//end of for loop
    return num;
}//end of random Input
//delete method which is sued to delete the value in targeted position
public static int [] delete(int [] num, int pos){
    int [] newArray1 = new int[num.length - 1];
    if (pos < 0 || pos > num.length){//index is not valid
        System.out.println("The index is not valid.");
        return num;
    }//end of if
    else{ //index is valid
    System.out.println("Index " + pos + " is removed");
    for (int i = 0; i < num.length - 1; i++){
        if (i >= pos){//elements which are behind targeted element
            newArray1[i] = num[i + 1];
        }//end of if
        else {
            newArray1[i] = num[i];//elements which are in the front of targeted element
        }
    }//end of for loop
    return newArray1;
    }//end of else
    
}//end of delete method
//remove all the elements which are equal to target value
public static int [] remove(int [] num, int target){
    boolean value = false;//initialize boolean value which shows 
    //whether there are elements equal to target value
    int j = 0;//counter which is used to record number of elements 
    //which are equal to targeted value
    for (int i = 0;i < num.length;i++){
        if (num[i] == target){//if element is equal to target
            j++;
        }
    }//end of for
    int [] newArray2 = new int[num.length - j];
    if (j > 0){
        System.out.println("Element " + target + " has been found");
        for (int i = 0, k = 0; i < num.length - j;){
            //i is used to target the position in array newArray2
            //k is used to target the position in array num
        if (num[k] == target){//if element is equal to target
            k++;
        }//end of if
        else{
            newArray2[i] = num[k];
            k++;
            i++;
        }//end of else
        }//end of for
        return newArray2;
    }//end of if
    else{
        System.out.println("Element " + target + " was not found");
        return num;
    }//end of else
}//end of remove method
}