import java.math.BigInteger;
import java.util.Scanner;

public class Factorial {

    static BigInteger factorial(int n) {
        if (n == 0) {
            return BigInteger.ONE;
        } else {
            BigInteger result = BigInteger.ONE;
            for (int i = 2; i <= n; i++) {
                result = result.multiply(BigInteger.valueOf(i));
            }
            return result;
        }
    }

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Put in your desired number: ");
        System.out.println(factorial(input.nextInt()));
    }
}
