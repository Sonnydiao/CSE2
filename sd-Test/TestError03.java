/*This program aims to test something uncertain */
public class TestError03{
    public static void main(String[] args){
        /*int k = 50, j = 12;
        if ( k / j > 2 && k % j  > 1){
            k++;
            if ( j % k > 14){
            k++;
            j++;
        }
        else{
            j--;
        }
        }
        else{
            k /= 2;
        }
        System.out.println(j + " " + k);*/
        /*int k = 22;
        char x = 't';
        switch (x) {
            case 'y':
                System.out.println('y');
            case 'Y':
                System.out.println('Y');
                k /= 2;
            case 'n':
                break;
            case 'N':
                System.out.println('N');
                k += 5;
                break;
            default:
                System.out.println("deault ");
                k *= 5;
        }
        System.out.printf("k = %2.2f\n", (double)k);*/
        System.out.println("7 + 2 * 7 % 4 > 5 + 1 == true == false && ! true || false: " +
        (7 + 2 * 7 % 4 > 5 + 1 == true == false && ! true || false));
        System.out.println("7 > 2 || (int) 2.6 * 3 == 14 & ! false != true: " + 
        (7 > 2 || (int) 2.6 * 3 == 14 & ! false != true));
        String a = 2 + "hello" + 3;
        System.out.println(a);
        System.out.println("'a'>'b'" + ('a'>'b'));
        int x = 1,y;
        double z = 1.2d;
        z = 2 / x;
        System.out.println("z = " + z + "x = " + x);
    }
}