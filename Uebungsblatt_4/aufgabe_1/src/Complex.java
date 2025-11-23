public class Complex {
    double real;
    double imaginary;

    public Complex(double real, double imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public Complex() {

    }

    Complex add(Complex other) {
        double a = this.real;
        double b = this.imaginary;
        double c = other.real;
        double d = other.imaginary;
        return new Complex(a+c, b+d);
    }

    Complex sub(Complex other) {
        double a = this.real;
        double b = this.imaginary;
        double c = other.real;
        double d = other.imaginary;
        return new Complex(a-c, b-d);
    }

    Complex mul(Complex other) {
        double a = this.real;
        double b = this.imaginary;
        double c = other.real;
        double d = other.imaginary;
        return new Complex(a*c - b*d, a*d + b*c);
    }

    Complex div(Complex other) {
        double a = this.real;
        double b = this.imaginary;
        double c = other.real;
        double d = other.imaginary;
        return new Complex((a*c + b*d)/(Math.pow(c, 2)+ Math.pow(d,2)), ((b*c)-(a*d))/(Math.pow(c, 2)+ Math.pow(d, 2)));
    }
    public String toString() {
        double a = this.real;
        double b = this.imaginary;
        if (b > 0) {
            return a + " + " + b + "i".replaceAll("0*$", "");
        } else if (b < 0) {
            return a + " " + b + "i".replaceAll("0*$", "");
        } else {
            return a + " ";
        }
    }
    public boolean equals(Complex other) {
        double a = this.real;
        double b = this.imaginary;
        double c = other.real;
        double d = other.imaginary;
        return (Math.abs(a - c) < 1e-12 && Math.abs(b-d) < 1e-12);
    }
    public static String getText(boolean result, Complex expectedValue, Complex actualValue) {
        if (result) {
            return "result is: ( " + actualValue + " ). OK";
        } else {
            return "FAILED: expected (" + expectedValue + "), actual (" + actualValue + ")";
        }
    }
}
