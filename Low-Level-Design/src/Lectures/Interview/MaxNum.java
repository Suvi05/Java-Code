package Lectures.Interview;

import java.util.Scanner;

public class MaxNum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }

        System.out.println(maxresult(arr));
    }
    public static int maxresult(int[] arr){
        int fmax=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(arr[i]<0){
                fmax=Math.max(fmax,arr[i]);
            }
        }
        int sum=0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            if(sum<0){
                sum=0;
            }
            else{
                sum+=arr[i];
            }
        }
        return fmax;
    }
}
// 8,-1,-2,-0;