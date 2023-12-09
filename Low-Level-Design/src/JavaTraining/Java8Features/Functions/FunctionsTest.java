package JavaTraining.Java8Features.Functions;

import java.util.function.Function;

public class FunctionsTest {
    public static void main(String[] args) {
        //Function<Input type,Return type>
        Function<String, Integer> f = i -> (i.length());
        System.out.println(f.apply("Sumit"));
        System.out.println(f.apply("Sumit Verma"));
        System.out.println(f.apply("Khushi Verma"));
    }
}
