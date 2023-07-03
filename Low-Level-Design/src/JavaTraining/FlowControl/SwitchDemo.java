package JavaTraining.FlowControl;

import java.util.Scanner;

public class SwitchDemo {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();

        switch (x){
            case 1:
                System.out.println("Case 1");
                //break; // Switch Fall Through
            case 1+2-1:
                System.out.println("Case 2");
                //break;
            case 3:
                System.out.println("Case 3");
                //break;
            default:
                System.out.println("Default Condition");
        }
        System.out.println("Code Finished");
    }
}
