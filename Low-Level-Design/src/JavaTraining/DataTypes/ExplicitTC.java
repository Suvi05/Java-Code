package JavaTraining.DataTypes;

public class ExplicitTC {

    public static void main(String[] args) {
        int i=100;
        byte b=(byte) i;
        System.out.println(b);

        int x=100; //Out Of Range
        char ch=(char) x;
        System.out.println(ch);
    }
}
