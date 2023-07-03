package JavaTraining.ObjectReference;

public class Demo1 {
    static Demo1 obj;
    static {
        System.out.println(Demo1.obj);   //Address
        Demo1.obj=new Demo1();
    }

    public static void main(String[] args) {

        System.out.println(Demo1.obj); //Address
    }
}
