/*This program aims to test something uncertain
Shuotao Diao */

public class TestError02{
    public static void main(String[] args){
        //int n, m = 6;
        //if ( m > 5 ){
        //    n = 4;
        //}
        //System.out.println("n = " + n);
        int n = 5, m = 7, k = 0;
        if (n * m * 2 % 6 == 4 ){
            k = 20;
        }
        if ((n + m) / 0.5 > 10){
            k += 8;
        }
        System.out.println("k = " + k);
    }
}