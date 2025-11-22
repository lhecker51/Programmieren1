public class ComplexTest {
    static void main() {
        //expected values i calculated myself
        Complex expectedValueOne = new Complex(4, -1);
        Complex expectedValueTwo = new Complex(3, -26);
        Complex expectedValueThree = new Complex(-97, 94);
        Complex expectedValueFour = new Complex(0.92, -0.56);
        //Complex-Objects for Test-cases
        Complex addOne = new Complex(1, -9);
        Complex addTwo = new Complex(3, 8);
        Complex subOne = new Complex(5, -6);
        Complex subTwo = new Complex(2, 20);
        Complex mulOne = new Complex(3, 14);
        Complex mulTwo = new Complex(5, 8);
        Complex divOne = new Complex(5, 2);
        Complex divTwo = new Complex(3, 4);
        Complex mulProofOne = new Complex(0, 1);
        Complex mulProofTwo = new Complex(0, 1);
        //calculating (calling the methods)
        Complex testAdd = addOne.add(addTwo);
        Complex testSub = subOne.sub(subTwo);
        Complex testMul = mulOne.mul(mulTwo);
        Complex testDiv = divOne.div(divTwo);
        Complex testMulProof = mulProofOne.mul(mulProofTwo);
        //Printing all calculations
            //System.out.println(testAdd.toString());
            //System.out.println(testSub.toString());
            //System.out.println(testMul.toString());
            //System.out.println(testDiv.toString());
            //System.out.println(testMulProof.toString());
        //comparing my results to the program's
        System.out.println("Comparison: ");
        System.out.println("Addition of ( " + addOne.toString() + " ) and ( " + addTwo + " ): " + Complex.getText(testAdd.equals(expectedValueOne), expectedValueOne, testAdd));
        System.out.println("Subtraction of ( " + subOne.toString() + " ) and ( " + subTwo + " ): " + Complex.getText(testSub.equals(expectedValueTwo), expectedValueTwo, testSub));
        System.out.println("Multiplication of ( " + mulOne.toString() + " ) and ( " + mulTwo + " ): " + Complex.getText(testMul.equals(expectedValueThree), expectedValueThree, testMul));
        System.out.println("Division of ( " + divOne.toString() + " ) and ( " + divTwo + " ): " + Complex.getText(testDiv.equals(expectedValueFour), expectedValueFour, testDiv));

    }


}
