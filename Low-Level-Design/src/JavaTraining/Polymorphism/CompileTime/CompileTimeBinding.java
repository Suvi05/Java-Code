package JavaTraining.Polymorphism.CompileTime;

public class CompileTimeBinding {
    void add(int a, int b) {
        int result = a + b;
        System.out.println("1 :" + result);
    }

    void add(float a, float b) {
        float result = a + b;
        System.out.println("2 :" + result);
    }

    void add(int a, int b, int c) {
        int result = a + b + c;
        System.out.println("3 :" + result);
    }

    public static void main(String[] args) {
        CompileTimeBinding obj = new CompileTimeBinding();
        obj.add(30, 40); //1 : 70
        obj.add(30f, 40f);//2 : 70.0f
        obj.add(30, 40, 50); //3 : 120

    }
}
