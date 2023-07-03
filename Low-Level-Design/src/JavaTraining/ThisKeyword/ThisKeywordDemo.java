package JavaTraining.ThisKeyword;

public class ThisKeywordDemo {
    int x;
    ThisKeywordDemo(){ //No Arg Constructor
        System.out.println(this); //This is like Object Reference //Implicit //obj1
        System.out.println(this.x);
    }
    public static void main(String[] args) {
        new ThisKeywordDemo(); //Address of Object created
    }
}
