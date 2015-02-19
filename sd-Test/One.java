/*This program aims to test error*/
public class One{
  public static void main(String arg[]){
      float x,u;
      int y,z;
      y = (int)2.1;
      x = 1.2f;
      z = 3;
      if (z == 3){
          int v = 3;
          z++;
      }
      System.out.println( "The value of x: " + 
      x + " y: " + y + " and z: " + z);
  }
}