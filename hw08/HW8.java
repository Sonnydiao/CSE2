/*MG's adventure world
Shuotao Diao, shd314@lehigh.edu*/
import java.util.Scanner;
public class HW8{//class name
  public static void main(String[] args){
    char option;
    Scanner scan = new Scanner(System.in);
    System.out.println("Welcome to MG's adventure world. Now your journey begins. Good luck!");
    System.out.println("Please hit 'C' or 'c' to continue, anything else to quit-");
    String input = getInput(scan, "Cc");
    System.out.println("You are in a dead valley.");
    System.out.println("Please hit 'C' or 'c' to continue, anything else to quit-");
    input = getInput(scan, "Cc");
    System.out.println("You walked and walked and walked and you saw a cave!");
    cave();
    System.out.println("Please hit 'C' or 'c' to continue, anything else to quit-");
    input = getInput(scan, "Cc");
    System.out.println("You entered a cave!");
    System.out.println("Please hit 'C' or 'c' to continue, anything else to quit-");
    input = getInput(scan, "Cc");
    System.out.println("Unfortunately, you ran into a GIANT!");
    giant();
    //System.out.println("Enter 'A' or 'a' to Attack, 'E' or 'E' to Escape, ANYTHING else is to YIELD");
    input = getInput(scan, "AaEe", 10);
    System.out.println("Congratulations! You SURVIVED! Get your REWARD!");
    System.out.println("There are three 3 tressure box in front of you! Enter the box number you want to open!");
    box();
    input = getInput(scan);
    System.out.println("Hero! Have a good day!");
  }//end of main method
  public static void giant() {
        System.out.println("                                 ---------                    ");
        System.out.println("                                |  /    \\|                   ");
        System.out.println("                      ZZZZZH    |    O    |    HZZZZZ             ");
        System.out.println("                           H     -----------   H              ");
        System.out.println("                      ZZZZZHHHHHHHHHHHHHHHHHHHHHZZZZZ                   ");
        System.out.println("                           H    HHHHHHHHHHH    H                      ");
        System.out.println("                      ZZZZZH    HHHHHHHHHHH    HZZZZZ               ");
        System.out.println("                                HHHHHHHHHHH                   ");
        System.out.println("                                HHH     HHH                   ");
        System.out.println("                               HHH       HHH                   ");
    }//end of giant method

    public static void cave() {
        System.out.println("                              *****   * * * * * * * *        ");
        System.out.println("                         ***         ***                      ");
        System.out.println("                      ***               ***                   ");
        System.out.println("                 |    ***               ***                   ");
        System.out.println("                 |    ***               ***                   ");
        System.out.println("             O __|__  ***               ***                   ");
        System.out.println("           ******l    ***               ***                   ");
        System.out.println("            * *       ***               ***                   ");
        System.out.println("           *   *      ********************* * * * * * *       ");
    }//end of cave method
    
    public static void box(){
       System.out.println("                      *********************     *********************    *********************             ");
        System.out.println("                     ***               ***     ***               ***    ***               ***              ");
        System.out.println("                     ***       1       ***     ***       2       ***    ***       3       ***              ");
        System.out.println("                     ***               ***     ***               ***    ***               ***              ");
        System.out.println("                     *********************     *********************    *********************               "); 
    }//end of box method
    public static String getInput(Scanner scan, String string){
       String input = scan.next();
       if (input.equals("C")||input.equals("c")){//input is equal to C or c
           return "";
       }
       else{//otherwise
           System.out.println("Yea, right LOSER!");//print out "Yea, right LOSER"
           System.exit(0);//exit java program
           return "";
       }
        
    }//end of getInput method
    public static String getInput(Scanner scan, String string, int trial){
        String input = "";//initialize input
        int random = 0;//random number
        for (int i = trial;i > 0;){
            System.out.println("Enter 'A' or 'a' to Attack, 'E' or 'e' to Escape, ANYTHING else is to YIELD");
            input = scan.next();
            switch ( input.charAt(0) ){
               case 'A'://input is A
               case 'a'://input is a
                   random = (int)( 2 * Math.random() );
                   if ( random == 1){
                       i--;
                   }
                   break;//break the switch statement
               case 'E'://input is E
               case 'e'://input is e
                   random = (int)( 10 * Math.random() + 1 );
                   if ( random == 10 ){
                       return "";
                   }
                   break;//break the switch statement
               default: 
                   System.out.println("Executed by the Giant. Game Over!");
                   //print out game over
                   System.exit(0);//exit java program
                   return "";
            }//end of switch
        }//end of for loop
        return "";
    }//end of method
    public static String getInput(Scanner scan){
        String input = scan.next();//store input
        switch ( input.charAt(0) ){
            case '1'://input is 1 
                System.out.println("Congratulations! You find Princess Annie! May the stars guide you both!");
                break;
            case '2'://input is 2
                System.out.println("Congraulations! It is GPA 4.0! Go with honor, my hero!");
                break;
            case '3'://input is 3
                System.out.println("Congraulations! You become the owner of Arsenal FC! Victoria Concordia Cresict!");
                break;
            default://otherwise
               System.out.println("A Wrong Number! You get nothing! Better restart the game LOL");
               System.exit(0);//exit java program
        }//end of swicth statement
        return "";
    }//end of method
}//end of class 