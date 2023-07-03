package JavaTraining.SuperMethod;

public class Child extends Parent{
    int c,d;

    Child(int a, int b,int c, int d){
        super(a,b);  //Parent Class ke Constructor ko call kiya
        this.c=c; //30
        this.d=d; //40
    }

    void display(){
        System.out.println(" Parent A :" +a);
        System.out.println(" Parent B :" +b);
        System.out.println(" Child C :" +c);
        System.out.println(" Child D :" +d);
    }
}
