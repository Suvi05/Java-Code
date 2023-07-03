package JavaTraining.Operators;

import jdk.swing.interop.SwingInterOpUtils;

public class RelationalOperators {
    public static void main(String[] args) {
        System.out.println(10 < 20);
        System.out.println(10 <= 15);
        System.out.println(10 > 20);

        System.out.println((int)'a');
        System.out.println((int)'A');

        System.out.println('a' > 10);
        System.out.println('a' < 'A'); // 97 < 65

        System.out.println(10 != 20);
        //== -> This checks Equality

    }
}
