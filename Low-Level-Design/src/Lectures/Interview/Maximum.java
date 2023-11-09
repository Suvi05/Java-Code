package Lectures.Interview;

public class Maximum {
    public static void main(String[] args) {
        int arr[]= {3,2,1,4,6,7,9,10,2,22};
        int max=Integer.MIN_VALUE;
        int smax=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            if(max<arr[i]){
                smax=max;
                max=arr[i];
            }
            else if (arr[i]>smax){
                smax=arr[i];
            }
        }
        System.out.println(smax);
    }
}
