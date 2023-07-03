package JavaTraining.FlowControl;

public class BreakDemo {
    public static void main(String[] args) {
        for(int i=20;i>=1;i--){
            if(i==10){
                break;
            }
            System.out.println(i);
        }
        System.out.println("Out of the Loop");
    }
}
