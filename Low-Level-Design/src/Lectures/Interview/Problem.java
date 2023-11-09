package Lectures.Interview;

import java.util.Scanner;
public class Problem {
    public static void main(String[] args) {
        int[] arr=new int[5];
        arr[0]=4;
        arr[1]=11;
        arr[2]=20;
        arr[3]=23;
        arr[4]=30;

        int h=7;

        System.out.println("ANSWER " + cal(arr,h));

    }
    public static int cal(int[] arr, int h){
        int max=Integer.MIN_VALUE;
        for(int m:arr){
            if(m>max){
                max=m;
            }
        }
        for(int i=1;i<=max;i++){
            int ans=0;
            for(int data:arr){
                ans+=data/i;
            }
            if(ans==h){
                return i;
            }
        }
        return 0;
    }
}
