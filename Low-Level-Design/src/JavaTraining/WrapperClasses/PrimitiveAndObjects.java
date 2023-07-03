package JavaTraining.WrapperClasses;

public class PrimitiveAndObjects {
    public static void main(String[] args) {
        int x=100; //Primitive Data Type
        Integer y=Integer.valueOf(x);    //Boxing   ->> PDT -> Object
        int z=y.intValue(); //Unboxing  ->>  Object -> PDTA

        long a=10000;
        Long b= Long.valueOf(a);
        long c= b.longValue();
    }
}
