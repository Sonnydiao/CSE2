/*This program aims to as the user questions in order to
guess waht number the user is thinking of 
Shuotao Diao, shd314@lehigh.edu*/
import java.util.Scanner; //import scanner class
public class WhichNumber{//define the name of the class
    public static void main(String[] args){
        //main method which is required by Java program
        Scanner myScanner = new Scanner( System.in );
        //declare new Scanner object
        System.out.println("Think of a number between" + 
        "1 and 10 inclusive");
        //prompt the user to think of a number between 1 and 10 inclusive
        System.out.print("Is the number even?(Y/N)");
        //promt the user to answer whether the number is even
        String answer = myScanner.next(); //store the input as string
        if(answer.equals("Y")||answer.equals("y")){//it is even
            System.out.print("Is it divisible by 3?(Y/N)");
            //ask the user whether it is divisible by 3
            answer = myScanner.next(); //store the input
            if(answer.equals("Y")||answer.equals("y")){//it is divisible by 3
                System.out.print("Is your number 6?(Y/N)");
                answer = myScanner.next();
                if(answer.equals("Y")||answer.equals("y")){
                    //it is 6
                    System.out.println("Yay!");
                    //show that the guess is correct
                    return;//leave the program
                }
                else if(answer.equals("N")||answer.equals("n")){
                    //it is not 6
                    System.out.println("Your number is not valid");
                    //show that the number the user think of is not valid
                    return;//leave the program 
                }
                else{//input is not valid 
                    System.out.println("Sorry, that is not a valid input.");
                    return;//leave the program
                }
            }
            else if(answer.equals("N")||answer.equals("n")){
                //it is not divisible by 3
                System.out.print("Is it divisble by 4?(Y/N)");
                answer = myScanner.next();
                if(answer.equals("Y")||answer.equals("y")){
                    //it is divisble by 4
                    System.out.print("Is the number divided by 4 " + 
                    "greater than 1?(Y/N)");
                    //ask the user whether quotient is greater than 1
                    answer = myScanner.next();
                    if(answer.equals("Y")||answer.equals("y")){
                        //quotient is greater than 1
                        System.out.print("Is your number 8?(Y/N)");
                        answer = myScanner.next();
                        if(answer.equals("Y")||answer.equals("y")){
                            //it is 8
                            System.out.println("Yay!");
                            return;
                        }
                        else if(answer.equals("N")||answer.equals("n")){
                            //it is not 8
                            System.out.println("Your number is not valid");
                            //show that the number the user think of is not valid
                            return;//leave the program 
                        }
                        
                        else{//input is not valid 
                        System.out.println("Sorry, that is not a valid input.");
                        return;//leave the program
                        }
                    }
                    else if(answer.equals("N")||answer.equals("n")){
                        //quotient is not greater than 1
                        System.out.print("Is your number 4?(Y/N)");
                        answer = myScanner.next();
                        if(answer.equals("Y")||answer.equals("y")){
                            //it is 4
                            System.out.println("Yay!");
                            return;
                        }
                        else if(answer.equals("N")||answer.equals("n")){
                            //it is not 4
                            System.out.println("Your number is not valid");
                            //show that the number the user think of is not valid
                            return;//leave the program 
                        }
                        else{//input is not valid 
                        System.out.println("Sorry, that is not a valid input.");
                        return;//leave the program
                        }
                    }
                }
                else if(answer.equals("N")||answer.equals("n")){
                    //it is not divisible by 4
                    System.out.print("Is it divisible by 5?(Y/N)");
                    answer = myScanner.next();
                    if(answer.equals("Y")||answer.equals("y")){
                        //it is divisible by 5
                    System.out.print("Is your number 10?(Y/N)");
                        answer = myScanner.next();
                        if(answer.equals("Y")||answer.equals("y")){
                            //it is 10
                            System.out.println("Yay!");
                        }
                        else if(answer.equals("N")||answer.equals("n")){
                            //it is not 10
                            System.out.println("Your number is not valid");
                            //show that the number the user think of is not valid
                            return;//leave the program 
                        }
                        
                        else{//input is not valid 
                        System.out.println("Sorry, that is not a valid input.");
                        return;//leave the program
                        }    
                    }
                    else if(answer.equals("N")||answer.equals("n")){
                        //it is not divisible by 5
                        System.out.print("Is your number 2?(Y/N)");
                        answer = myScanner.next();
                        if(answer.equals("Y")||answer.equals("y")){
                            //it is 2
                            System.out.println("Yay!");
                        }
                        else if(answer.equals("N")||answer.equals("n")){
                            //it is not 2
                            System.out.println("Your number is not valid");
                            //show that the number the user think of is not valid
                            return;//leave the program 
                        }
                        
                        else{//input is not valid 
                        System.out.println("Sorry, that is not a valid input.");
                        return;//leave the program
                        }    
                    }
                else{//input is not valid 
                    System.out.println("Sorry, that is not a valid input.");
                    return;//leave the program
                }
                }
            }        
    
        }
        else if(answer.equals("N")||answer.equals("n")){//it is odd
            System.out.println("Is it divisible by 3?(Y/N)");
            //ask the user whether it is divisible by 3
            answer = myScanner.next(); //store the input
            if(answer.equals("Y")||answer.equals("y")){
                //it is divisible by 3
                System.out.print("When divided by 3, is the result " + 
                "greater than 1?");
                answer = myScanner.next();
                if(answer.equals("Y")||answer.equals("y")){
                    //quotient is greater than 1 
                    System.out.println("Is your number 9?(Y/N)");
                    //ask the user whether it is 9
                    answer = myScanner.next();//store the input
                    if(answer.equals("Y")||answer.equals("y")){
                        //it is 9
                        System.out.println("Yay!");
                        //show that the guess is correct
                        return;//leave the program
                    }
                    else if(answer.equals("N")||answer.equals("n")){
                    //it is not 6
                    System.out.println("Your number is not valid");
                    //show that the number the user think of is not valid
                    return;//leave the program 
                    }
                    else{//input is not valid 
                    System.out.println("Sorry, that is not a valid input.");
                    return;//leave the program
                    }
                }
                else if(answer.equals("N")||answer.equals("n")){
                    //quotient is not greater than 1
                    System.out.println("Is your number 3?(Y/N)");
                    answer = myScanner.next();
                    if(answer.equals("Y")||answer.equals("y")){
                        //it is 3
                        System.out.println("Yay!");
                        //guess is corect
                    }
                    else if(answer.equals("N")||answer.equals("n")){
                        //it is not 3
                        System.out.println("Your number is not valid");
                        return;
                    }
                    else{//input is not valid 
                    System.out.println("Sorry, that is not a valid input.");
                    return;//leave the program
                    }
                }
            }
            else if(answer.equals("N")||answer.equals("n")){
                //it is not divisble by 3
                System.out.print("Is it greater than 6?");
                answer = myScanner.next();
                if(answer.equals("Y")||answer.equals("y")){
                    //it is greater than 6
                    System.out.println("Is your number 7(Y/N)");
                    answer = myScanner.next();
                    if(answer.equals("Y")||answer.equals("y")){
                        System.out.println("Yay!");
                    }
                    else if(answer.equals("N")||answer.equals("n")){
                        //it is not 7
                        System.out.println("Your number is not valid");
                        return;
                    }
                    else{//input is not valid 
                        System.out.println("Sorry, that is not a valid input.");
                        return;//leave the program
                    }
                }
                else if(answer.equals("N")||answer.equals("n")){
                    //it is not greater than 6
                    System.out.print("Is it less than 3?(Y/N)");
                    //ask the user whether is is less than 3
                    answer = myScanner.next();
                    if(answer.equals("Y")||answer.equals("y")){
                        //it is less than 3
                        System.out.print("Is your number 1?(Y/N)");
                        //ask the user whether the number is 1
                        answer = myScanner.next();
                        if(answer.equals("Y")||answer.equals("y")){
                            //it is 1
                            System.out.println("Yay!");
                            return;
                        }
                        else if(answer.equals("N")||answer.equals("n")){
                        //it is not 7
                            System.out.println("Your number is not valid");
                            return;
                        }
                        else{//input is not valid 
                            System.out.println("Sorry, that is not a valid input.");
                            return;//leave the program
                        }
                    }
                    else if(answer.equals("N")||answer.equals("n")){
                        //it is not less than 3
                        System.out.println("Is your number 5");
                        //ask the user whether the number is 5
                        answer = myScanner.next();//store the input
                        if(answer.equals("Y")||answer.equals("y")){
                            //it is 5
                            System.out.println("Yay!");
                            return;
                        }
                        else if(answer.equals("N")||answer.equals("Y")){
                            //it is not 5
                            System.out.println("Your number is not valid.");
                            return;
                        }
                        else{//input is not valid 
                            System.out.println("Sorry, that is not a valid input.");
                            return;//leave the program
                        }
                    }
                }
            }
        }
        else{//input is not valid 
            System.out.println("Sorry, that is not a valid input.");
            return;//leave the program
        }
    }//end of main method 
}//end of class
