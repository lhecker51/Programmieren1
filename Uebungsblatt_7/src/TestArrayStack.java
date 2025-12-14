public class TestArrayStack {
    public static void main(String[] args) {

        ArrayStack intStack = new ArrayStack();

        System.out.println("intStack: " + intStack);
        intStack.push(1);
        intStack.push(2);
        intStack.push(3);
        System.out.println("intStack: " + intStack);
        System.out.println("Top element: " + intStack.top());
        intStack.push(4);
        intStack.push(5);
        System.out.println("intStack: " + intStack);
        System.out.println("Size of stack: " + intStack.size());
        System.out.println("is empty? " + (intStack.isEmpty() ? "yes" : "no"));
        intStack.pop();
        intStack.pop();
        System.out.println("intStack: " + intStack);
        System.out.println("Top element: " + intStack.top());
        System.out.println("Element removed: " + intStack.pop());
        intStack.pop();
        intStack.pop();
        System.out.println("intStack: " + intStack);
        System.out.println("is empty? " + (intStack.isEmpty() ? "yes" : "no"));

        ArrayStack stringStack = new ArrayStack();

        System.out.println("stringStack: " + stringStack);
        stringStack.push("one");
        stringStack.push("tow");
        stringStack.push("three");
        System.out.println("stringStack: " + stringStack);
        System.out.println("Top element: " + stringStack.top());
        stringStack.push("four");
        stringStack.push("five");
        System.out.println("stringStack: " + stringStack);
        System.out.println("Size of stack: " + stringStack.size());
        System.out.println("is empty? " + (stringStack.isEmpty() ? "yes" : "no"));
        stringStack.pop();
        stringStack.pop();
        System.out.println("Top element: " + stringStack.top());
        System.out.println("Element removed: " + stringStack.pop());
        System.out.println("stringStack: " + stringStack);
        stringStack.pop();
        stringStack.pop();
        System.out.println("stringStack: " + stringStack);
        System.out.println("is empty? " + (stringStack.isEmpty() ? "yes" : "no"));
    }
}
