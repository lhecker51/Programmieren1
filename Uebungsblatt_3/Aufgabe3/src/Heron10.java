import java.util.InputMismatchException;
import java.util.Scanner;

public class Heron10 {

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

        //calculate approximation of root to x10
        double x = a;
        for (int i = 0; i < 10; i++) {
            double newX = 0.5 * (x + a/x);
            System.out.println("n" + (i+1) +"= " + newX);
            x = newX;
        }

        //nicht exakt: irationale Zahlen
    }
}
