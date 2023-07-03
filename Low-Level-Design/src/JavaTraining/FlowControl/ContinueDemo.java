package JavaTraining.FlowControl;

public class ContinueDemo {
    public static void main(String[] args) {
        for (int i=1;i<=20;i++){
            if(i==10){
                continue;
            }
            System.out.println(i);
        }
        System.out.println("Out of the For Loop");
    }
}
