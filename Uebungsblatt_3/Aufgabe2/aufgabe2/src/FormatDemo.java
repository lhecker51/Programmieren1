public class FormatDemo {

    public static void main(String[] args) {

        intFormatDemo(100);
        intFormatDemo(1023);
        intFormatDemo(0xFFF1234);
        intFormatDemo(-3);

        doubleFormatDemo(2.5);
        doubleFormatDemo(3.141592653);
        doubleFormatDemo(1e12);
        doubleFormatDemo(-0.0001234);
    }

    static void intFormatDemo(int x){
        System.out.printf("%+d%n", x);
        System.out.printf("0x%08X%n", x);
        String binary = String.format("%32s",Integer.toBinaryString(x));
        System.out.println(binary.replace(" ", "0"));
        System.out.printf("[%10d]%n", x);
        System.out.printf("[%-10d]%n", x);
    }
    static void doubleFormatDemo(double d){
        System.out.printf("%25.2f%n", d);
        System.out.printf("%25E%n", d);
        System.out.printf("%25A%n", d);
    }
}
