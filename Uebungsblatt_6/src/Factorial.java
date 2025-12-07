import java.math.BigInteger;
import java.util.Scanner;

public class Factorial {

    static BigInteger factorial(int n) {
        if (n == 0) {
            return BigInteger.ONE;
        } else {
            int i = n-1;
            int x = n;
            while(i > 0) {
                x =  x * i;
                i--;
            }
            return new BigInteger(String.valueOf(x));
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Put in your desired number: ");
        System.out.println(factorial(input.nextInt()));
    }
}
