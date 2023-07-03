package JavaTraining.DataTypes;

public class VariableAddress {
    public static void main(String[] args) {
        int n=-20;
        VariableAddress a=new VariableAddress();
        VariableAddress b=new VariableAddress();
        System.out.println(a.hashCode()); //Object's Address
        System.out.println(b.hashCode());
        System.out.println(System.identityHashCode(n));
        int x=System.identityHashCode(n);//Premitive Type Address
        System.out.println(x);
    }
}
