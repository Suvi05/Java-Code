package JavaTraining.Java8Features.Predicates;

import java.util.function.Predicate;

public class PredicateJoins {
    public static void main(String[] args) {
        int[] x = {2, 5, 7, 10, 20, 30, 40, 50, 55, 58};
        Predicate<Integer> p1 = i -> (i > 10);
        Predicate<Integer> p2 = i -> (i % 2 == 0);

        System.out.println("Greater than 10");
        method(p1, x);
        System.out.println("Even Numbers");
        method(p2, x);
        System.out.println("Greater than 10 and Even Numbers");
        method(p1.and(p2), x);
        System.out.println("Smaller than 10 and Even Numbers");
        method(p1.negate().and(p2), x);
        System.out.println("Greater than 10 and Odd Numbers");
        method(p1.and(p2.negate()), x);
        System.out.println("Smaller than 10 and Odd Numbers");
        method(p1.negate().and(p2.negate()), x);
    }

    public static void method(Predicate p, int[] x) {
        for (int eachValue : x) {
            if (p.test(eachValue)) {
                System.out.print(eachValue + " ");
            }
        }
        System.out.println();
    }
}
