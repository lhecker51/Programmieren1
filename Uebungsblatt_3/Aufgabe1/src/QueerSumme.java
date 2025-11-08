import java.util.Scanner;

public class QueerSumme {

    private int queersumme(int x) {
        int y = 0;
        while (x > 0) {
            y = y + (x % 10);
            x = (x / 10);
        }
        return y;
    }

    private int queersummeHex(int x) {
        int y = 0;
        while (x > 0) {
            y = y + (x % 16);
            x = (x / 16);
        }

        return y;
    }

    void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Geben sie ihre Zahl ein:");
        boolean success = false;
        try {
            System.out.println("DezimalZahl:");
            int x = sc.nextInt();
            System.out.println("HexadezimalZahl:");
            int z = sc.nextInt(16);
            int ergebnis1 = queersumme(x);
            int ergebnis2 = queersummeHex(z);
            System.out.println("Die Quersumme der DezimalZahl lautet: " + ergebnis1);
            System.out.printf("Die Quersumme der HexadezimalZahl lautet: 0x%x (%d)\n", ergebnis2, ergebnis2);
        } catch (Exception e) {
            System.out.println("Bitte eine valide Zahl eingeben.");
        }
    }
}
