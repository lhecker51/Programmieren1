import java.util.InputMismatchException;
import java.util.Scanner;

public class HeronFixpoint {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number: ");
        boolean gotNumber = false;
        double a = 0;

        //entering the number
        while (!gotNumber) {
            //check if input is number
            try {
                a = scanner.nextDouble();
                gotNumber = true;
            } catch (InputMismatchException e) {
                scanner.nextLine();
                System.out.println("Must be an integer");
            }

            //check if number is positive
            if (a < 0) {
                System.out.println("Please enter a positive number");
                gotNumber = false;
            }
        }

        //calculate approximation of root
        double x = a;
        int counter = 1;
        boolean isSameNumber = false;

        while (!isSameNumber) {
            double newX = 0.5 * (x + a/x);
            if (newX == x) {
                isSameNumber = true;
            } else {
                System.out.println("x" +counter + "=" + newX);
                x = newX;
                counter++;
            }
        }
    }
}
