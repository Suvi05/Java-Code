package JavaTraining.Basics;

public class test {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int temp = a;
        a = b;
        b = temp;

        fun(a, b);

        System.out.println("a " + a);
        System.out.println("b " + b);
    }

    private static void fun(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
    }
}
