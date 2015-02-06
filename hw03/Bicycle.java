/*This program is to promt the user to enter the number of 
counts and number of seconds. Then it will diplay the total
distance in miles, time in minutes and average velocity (mph).
Shuotao Diao, shd314@lehigh.edu*/
import java.util.Scanner; //import scanner class
//define the name of class
public class Bicycle{
    public static void main(String[] args){
        //main method required by Java program
        Scanner myScanner = new Scanner( System.in );
        //promt the user to enter number of counts
        System.out.print("Enter the number " +
        "of counts(an interger >0): ");
        //store the number of counts 
        int countsTrip = myScanner.nextInt();
        //promt the user to enter number of seconds
        System.out.print("Enter the number " +
        "of seconds(an integer >0): ");
        int secsTrip = myScanner.nextInt();
        final double PI = 3.14159;//PI ratio of circumference
        double wheelDiameter = 27.0;//diameter of wheel is 27 inches
        double feetPerMile = 5280;
        double inchesPerFoot = 12;
        double secondsPerMinute = 60;
        double minutePerHour = 60;
        //calculate the distance (inches)
        double distanceTrip = PI * wheelDiameter * countsTrip;
        //convert the distance into miles
        distanceTrip/= inchesPerFoot * feetPerMile;
        //convert time into minutes 
        double minuteTrip = secsTrip / secondsPerMinute;
        minuteTrip = (int) (minuteTrip * 10) / 10.0;
        //convert time into hours
        double hourTrip = minuteTrip / minutePerHour;
        //compute the average velocity mph
        double velocity = distanceTrip / hourTrip;
        velocity = (int) (velocity * 100) / 100.00;
        distanceTrip = (int) (distanceTrip *100) / 100.00;
        //display distance in miles and time in minutes
        System.out.println("The distance was " + 
        distanceTrip + " miles and took " +
        minuteTrip + " minutes.");
        System.out.println("The average mph was " + 
        velocity);
    }//end of main method
}//end of class
