package JavaTraining.Java8Features.Streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class FilterEvenNumbers {
    public static void main(String[] args) {
        //Firstly we will do it without streams
        List<Integer> l1 = new ArrayList<>();
        for (int i = 0; i <= 10; i++) {
            l1.add(i);
        }
        System.out.println(l1);
        //For Loop
        List<Integer> l2 = new ArrayList<>();
        for (int i : l1) {
            if (i % 2 == 0) {
                l2.add(i);
            }
        }
        System.out.println("Output of for loop : " + l2);
        //Streams
        //l1(collection).stream().filter(Lambda Expression to filter out Even numbers)
        // .collect(processing)(Collectors.toList());
        List<Integer> l3 = l1.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());
        System.out.println("Output of Streams : " + l3);
    }
}
