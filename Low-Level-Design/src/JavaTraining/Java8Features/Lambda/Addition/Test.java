package JavaTraining.Java8Features.Lambda.Addition;

public class Test {
    public static void main(String[] args) {
        Addition add = (int a, int b) -> System.out.println("Output is " + (a + b));
        add.addition(10, 20);
    }
}
