package JavaTraining.Java8Features.DefaultMethod;

public interface A {
    //This "default" can only be used in Interface
    default void m1() {
        System.out.println("Default method m1() inside Interface A");
    }
}
