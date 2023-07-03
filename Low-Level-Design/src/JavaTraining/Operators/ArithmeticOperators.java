package JavaTraining.Operators;

public class ArithmeticOperators {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        int c=30;

        System.out.println(a+b); //Addition
        System.out.println(a-b);
        System.out.println(a*b);
        System.out.println(a/b);
        System.out.println(a%b);

        String s1= "abc";
        String s2= "xyz";

        System.out.println(s1+s2);//String Contcatination

        System.out.println(a+b+c+s1); //60abc
        System.out.println(s1+a+b+c); //abc 10 20 30
        System.out.println(a+b+s1+c); //30abc30
        System.out.println(a+b+s1+c+a);

    }
}
