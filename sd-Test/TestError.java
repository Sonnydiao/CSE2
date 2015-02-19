/*This program aims to verify some questions 
Shuotao Diao shd314@lehigh.edu*/
public class TestError{
    public static void main(String[] args){
        int a = 2;
        double b = 2;
        boolean c = a ==b;
        System.out.println(a + "==" + b + " is " + c);
        boolean d = 2 < 3 || 5 * 2 == 11 && 5 > 6;
        System.out.println(d);
        boolean e = true || true && false;
        System.out.println("e = " + e);
        double f = 3 % 12 + 5 * 4 % 11 / 2.0;
        System.out.println("3 % 12 + 5 * 4 % 11 / 2.0 = " + f);
        boolean g = 2 < 0 && 3 / (1 - 1) > 0;
        System.out.println("2 < 0 && 3 / (1 - 1) > 0 :" + 
        (2 < 0 && 3 / (1 - 1) > 0) );
        System.out.println(" 3 / (1 - 1) = " + (3 / (1 - 1)));
    }
}