package JavaTraining.Operators;

public class BitwiseOperators {
    public static void main(String[] args) {
        boolean a=true;
        boolean b=false;
        boolean c=true;
        boolean d=false;
        System.out.println(a&b); // 1 & 0
        System.out.println(a&c); // 1 & 1
        System.out.println(b&d); // 0 & 0
        //in & - 0 is powerful

        System.out.println("");
        System.out.println(a|b); // 1 | 0 - 1
        System.out.println(a|c); // 1 | 1 - 1
        System.out.println(b|d); // 0 | 0 - 0
        //in | - 1 is powerful

        System.out.println("");
        System.out.println(a^b); // 1 ^ 0 - 1
        System.out.println(a^c); // 1 ^ 1 - 0
        System.out.println(b^d); // 0 ^ 0 - 0
        //in ^ - 1 for Different & 0 for same

        System.out.println(4&5);
        System.out.println(4|5);
        System.out.println(4^5);
    }
}
