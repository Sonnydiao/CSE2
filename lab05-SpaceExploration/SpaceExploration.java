/*A random year from 2000 to 2010 inlcusively is generated. 
Then output all events in the timeline that have occurred from
2000 uo untile the year that has been randomly selected. 
Shuotao Diao shd314@lehigh.edu*/

public class SpaceExploration{//class name
    public static void main(String[] args){
        //main method required by Java program
        int year = (int)(Math.random() * 11) + 2000;
        //a year from 2000 to 2010 is randomly selected 
        System.out.println("Here is a timeline of space " + 
        "exploration events from " + year + " to 2000");
        //print out a timeline of space exploration from
        //randomly selected year to 2000
        switch (year){
            //randomly selected year is 2010
            case 2010: System.out.println("2010: Spacex " + 
                       "successfully sends spacecraft to " +
                       "orbit and bakc");
            //randomly selected year is 2009 
            case 2009: System.out.println("2009: N/A");
            //randomly selected year is 2008
            case 2008: System.out.println("2008: Kepler " + 
                       "launched to study deep space.");
            //randomly selected year is 2007
            case 2007: System.out.println("2007: N/A");
            //randomly selected year is 2006
            case 2006: System.out.println("2006: Spacecraft " + 
                       "returns with collections from a comet");
            //randomly selected year is 2005
            case 2005: System.out.println("2005: Spacecarft " + 
                       "collies with comet");
            //randomly selected year is 2004
            case 2004: System.out.println("2004: N/A");
            //randomly selected year is 2003
            case 2003: System.out.println("2003: Largest " + 
                       "infrared telescope released");
            //randomly selected year is 2002
            case 2002: System.out.println("2002: N/A");
            //randomly selected year is 2001
            case 2001: System.out.println("2001: First " +
                       "spacecraft lands on asteroid");
            //randomly selected year is 2000
            case 2000: System.out.println("2000: First " + 
                       "spacecraft orbits an asteroid");
        }//end of switch statement
        
    }//end of main method
}//end of class