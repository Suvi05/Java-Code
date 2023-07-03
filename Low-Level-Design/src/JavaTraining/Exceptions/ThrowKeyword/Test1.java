package JavaTraining.Exceptions.ThrowKeyword;

public class Test1 {
    public static void main(String[] args) {
        Test1 t = new Test1();
        try {
            t.divide();
        } catch (ArithmeticException ae) {
            System.out.println("Can't divide with 0");
        }
    }

    public static void divide() {
        int a = 100, b = 0, c;
        c = a / b;
        System.out.println(c);
    }
}
