package JavaTraining.Java8Features.Predicates;

import java.util.function.Predicate;

public class GreaterThanTwenty {
    public static void main(String[] args) {
        //Predicate is a functional interface and have only 1 method
        //Here we are declaring the body of "test" method
        Predicate<Integer> p = i -> (i > 20);
        //it is checking if "i" is greater than 20

        System.out.println(p.test(15));
        System.out.println(p.test(25));
    }
}
