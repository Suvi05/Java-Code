package JavaTraining.ThisKeyword;

public class ThisKeywordDemo2 {
    int x;
    public static void main(String[] args) {
        new ThisKeywordDemo2(); //In-Memory //Ganesh
        new ThisKeywordDemo2();
    }
    ThisKeywordDemo2(){
        System.out.println(this);
        System.out.println(this.x);
    }
}
