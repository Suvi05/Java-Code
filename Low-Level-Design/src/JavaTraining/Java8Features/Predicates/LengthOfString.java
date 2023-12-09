package JavaTraining.Java8Features.Predicates;

import java.util.function.Predicate;

public class LengthOfString {
    public static void main(String[] args) {
        Predicate<String> p = s -> (s.length() > 5);
        System.out.println(p.test("Sumit Verma"));
        System.out.println(p.test("Sumit"));
    }
}
