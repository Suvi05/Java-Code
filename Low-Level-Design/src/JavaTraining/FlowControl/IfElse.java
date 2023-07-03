package JavaTraining.FlowControl;

public class IfElse {
    public static void main(String[] args) {
        int x=20;
        int y=20;

        if(x>y){  //False - 0
            System.out.println("X is greater than Y");
        }else if(y>x){
            System.out.println("Y is greater than X");
        }else{
            System.out.println("X and Y are Equal");
        }
    }
}
