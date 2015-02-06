/* Test01 for reviewing Chapter 2 
Shuotao Diao shd314@lehidh.edu */

import java.util.Scanner;
public class CurrentTime{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        long totalMilliseconds = System.currentTimeMillis();
        long totalSeconds = totalMilliseconds/1000;
        long currentSeconds = totalSeconds%60;
        System.out.print("Do you want to display time?" +
        "1(Y)/0(N)");
        int answer = input.nextInt();
        if (answer == 1)
          System.out.println(" Current Seconds: " + 
          currentSeconds);
          else
          System.out.println(" No display");
          
    }
}