/*Create four methods that correspond to the four sentence 
components above. Makeeach method generate a random integer 
from 09,select a random adjective / subject /verb / object 
from a switch statement, and return the word as a string. 
Shuotao Diao, shd314@lehigh.edu*/
import java.util.Random;//import Random class
public class lab9{//class name
public static String adject(Random randomGenerator){
    //object method
    int randomInt = randomGenerator.nextInt(10);
    switch (randomInt){
        case 0: 
        case 1:
        case 2:
            return "quick";
        case 3:
        case 4:
        case 5:
            return "deceptive";
        default:
            return "cute";
    }//end of switch statement
}//end of adjective method
public static String subject(Random randomGenerator){
    //subject method
    int randomInt = randomGenerator.nextInt(10);
    switch (randomInt){
        case 0: 
        case 1:
        case 2:
            return "turtle";
        case 3:
        case 4:
        case 5:
            return "tiger";
        default:
            return "fox";
    }//end of switch statement
}//end of subject method
public static String verb(Random randomGenerator){
    //verb method
    int randomInt = randomGenerator.nextInt(10);
    switch (randomInt){
        case 0: 
        case 1:
        case 2:
            return "chased";
        case 3:
        case 4:
        case 5:
            return "punched";
        default:
            return "passed";
    }//end of switch statement
}//end of verb method
public static String object(Random randomGenerator){
    //object method
    int randomInt = randomGenerator.nextInt(10);
    switch (randomInt){
        case 0: 
        case 1:
        case 2:
            return "puma";
        case 3:
        case 4:
        case 5:
            return "lion";
        default:
            return "dog";
    }//end of switch statement
}//end of object
public static void main(String[] args){
    Random randomGenerator = new Random();
    String sentence = "";
    sentence = "The " + adject(randomGenerator) + " " + 
    subject(randomGenerator) + " " + verb(randomGenerator) + 
    " the " + object(randomGenerator) + ".";
    System.out.println(sentence);//print out result
}//end of main method

    
}//end of class