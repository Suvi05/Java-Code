package JavaTraining.Exceptions.ThrowKeyword;

public class Test {
    public static void main(String[] args) {
        int a = 100, b = 0, c;
        try {
            c = a / b;
            System.out.println(c);
        } catch (ArithmeticException ae) {
            System.out.println("Can't divide with 0");
        }
    }
}
