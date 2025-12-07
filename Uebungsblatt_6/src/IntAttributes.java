import java.lang.Integer;
public class IntAttributes {

    static String printStaticAttributes() {
        int bytes = Integer.BYTES;
        int max_value = Integer.MAX_VALUE;
        int min_value =  Integer.MIN_VALUE;
        int size = Integer.SIZE;
        Class<Integer> type = Integer.TYPE;

        String bytesString = ("BYTES: The number of bytes used to represent a int value in two's complement binary form: \n" + bytes + "\n");
        String maxString = ("MAX_VALUE: A constant holding the maximum value an int can have: \n" + max_value + "\n");
        String minString = ("MIN_VALUE: A constant holding the minimum value an int can have: \n" + min_value + "\n");
        String sizeString = ("SIZE: The number of bits used to represent an int value in two's complement binary form: \n" + size + "\n");
        String typeString = ("TYPE: The Class instance representing the primitive type int: \n" + type + "\n");
        String sb = String.valueOf(bytesString) +
                maxString +
                minString +
                sizeString +
                typeString;
        return sb;

    }
    static String printMethodValues() {
        int x = 100;
        int y = -100;
        int xCount = Integer.bitCount(x);
        int yCount = Integer.bitCount(y);
        int xRotate = Integer.rotateLeft(x, 2);
        int yRotate = Integer.rotateLeft(y, 2);
        int xTrailingZeros = Integer.numberOfTrailingZeros(x);
        int yTrailingZeros = Integer.numberOfTrailingZeros(y);
        int xReversed = Integer.reverse(x);
        int yReversed = Integer.reverse(y);
        String countString = "Bitcount x: " + xCount + "\nBitcount y: " + yCount + "\n";
        String rotateString = "Rotation with distance 2 x: " + xRotate + "\nRotation with distance 2 y: " + yRotate + "\n";
        String trailingZerosString = "Trailing zeros x: " + xTrailingZeros + "\nTrailing zeros y: " + yTrailingZeros + "\n";
        String reversedString = "Reversed x: " + xReversed + "\nReversed y: " + yReversed + "\n";
        String sb = String.valueOf(countString) + rotateString + trailingZerosString + reversedString;
        return sb;
    }
    public static void main(String args[]) {
        System.out.print(printStaticAttributes());
        System.out.println("------------------------");
        System.out.print(printMethodValues());
    }

}
