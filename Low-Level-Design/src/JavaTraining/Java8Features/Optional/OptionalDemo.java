package JavaTraining.Java8Features.Optional;

import java.util.Optional;

public class OptionalDemo {
    public static void main(String[] args) {
        Optional<String> empty = Optional.empty();
        //.empty returns an empty return instance for us
        System.out.println("isPresent: " + empty.isPresent());
        //.isPresent()-> returns true if there is anything in Optional

        Optional<String> data = Optional.of("Data inside optional class");
        System.out.println("isPresent: " + data.isPresent());

        System.out.println("Value: " + data.get());
        //get() will return us the value of this optional object
        //If it doesn't have anything then it will throw an Exception
        //Exception in thread "main" java.util.NoSuchElementException: No value present

        if (empty.isPresent()) {
            System.out.println(empty.get());
        }
        //Filter is a method that takes a "Predicate" and it will give us the
        // value of "optional" only if the Filter returns TRUE.
        System.out.println(data.filter(s -> s.equals("Data inside optional class")));
        System.out.println(data.filter(s -> s.equals("Changed Line")));
    }
}
/*
Output:
isPresent: false
isPresent: true
Value: Data inside optional class
Optional[Data inside optional class] ---> In case of TRUE
Optional.empty                       ---> In case of FALSE
 */
