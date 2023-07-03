package JavaTraining.DataTypes;

public class ImplicitTC {
    public static void main(String[] args) {
        byte b=100;
        int i=b;
        System.out.println(i);
        long l=i;
        System.out.println(l);

        byte d=65;
        char cha= (char)d;//Doubt to resolve
        System.out.println(cha);

        char ch='s';
        int x=ch;
        System.out.println(x);
    }
}
