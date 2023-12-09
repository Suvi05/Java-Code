package JavaTraining.Java8Features.Streams;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class MoreMethods {
    public static void main(String[] args) {
        //Firstly we will do it without streams
        List<Integer> l1 = new ArrayList<>();
        for (int i = 0; i <= 10; i++) {
            l1.add(i);
        }
        System.out.println(l1);

        long count = l1.stream().filter(i -> i % 2 == 0).count();
        System.out.println("Number of Even Numbers are: " + count);

        List<Integer> l2 = l1.stream().sorted().collect(Collectors.toList());
        System.out.println("Sorted List: " + l2);

        //Comparators using Streams
        //Comparator is Functional Interface-Has only 1 abstract method- toCompare()
        //Implementing it using Lambda Expression
        Comparator<Integer> comp = (i1, i2) -> i1.compareTo(i2);

        long max = l1.stream().filter(i -> i % 2 != 0).max(comp).get();
        System.out.println("Max : " + max);

        long min = l1.stream().filter(i -> i % 2 != 0).min(comp).get();
        System.out.println("Min : " + min);

        //For-Each loop using Streams
        l1.stream().forEach(i -> System.out.print(i + " "));
    }
}
/*
Output:
[0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
Number of Even Numbers are: 6
Sorted List: [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10]
Max : 9
Min : 1
0 1 2 3 4 5 6 7 8 9 10
 */
