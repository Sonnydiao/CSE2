//This program is to store two kinds of data, the time 
//elipased in seconds, and the number of rotations of the 
//front wheel. Distance in miles for each trip is computed 
//based on the data we store.  
// Shuotao Diao, shd314@lehigh.edu
public class Cyclometer {
    //main method 
    public static void main(String[] args) {
        int secsTrip1=480;  //time elapsed in seconds for 
        //trip 1
        int secsTrip2=3220;  //time elapsed in seconds for
        //trip 2
        int countsTrip1=1561;  //number of rotations for 
        //trip 1 
        int countsTrip2=9037;  //number of rotations for
        //trip 2
        double wheelDiameter=27.0; //diameter of wheel in foot
        double PI=3.14159;  //value of PI
        double feetPerMile=5280; //1 mile = 5280 feet
        double inchesPerFoot=12; //1 foot = 12 inches
        double secondsPerMinute=60;  //1 min = 60 secs
        double distanceTrip1, distanceTrip2, totalDistance;
        //initialize distance in miles for each trip and 
        //total distance
        System.out.println("Trip 1 took "+
        (secsTrip1/secondsPerMinute)+" minutes and had "+
        countsTrip1+" counts.");
        //display the amounts of minutes and number of 
        //rotations trip 1 took 
        System.out.println("Trip 2 took "+
        (secsTrip1/secondsPerMinute)+" minutes and had"+
        countsTrip1+" counts.");
        //display the amounts of minutes and number of 
        //rotations trip 2 took
        //compute the values for the distances
        distanceTrip1=countsTrip1*wheelDiameter*PI;
        //above gives distance in inches
        //(for each count, a rotation of the wheel travels
        //the diameter in inches times PI)
        distanceTrip1/=inchesPerFoot*feetPerMile;
        //convert the distance into miles
        distanceTrip2=countsTrip2*wheelDiameter*PI/
        (inchesPerFoot*feetPerMile);
        totalDistance=distanceTrip1+distanceTrip2;
        System.out.println("Trip 1 was "+distanceTrip1+" miles");
        System.out.println("Trip 2 was "+distanceTrip2+" miles");
        System.out.println("The total distance was "+
        totalDistance+" miles");//display total distance
        
    }  //end of main method
}  //end of class