package Lectures.Interview;

public class OddTimes {
    public static void main(String[] args) {
        int arr[] = new int[]{ 2, 3, 5, 4, 5, 2, 4, 3, 5,5,2, 2, 4, 4, 2 };
        int result=calculateOdd(arr);
        System.out.println(result);
    }
    public static int calculateOdd(int[] arr){
        int ans=0;
        for(int i=0;i<arr.length;i++){
            ans=ans^arr[i];
        }
        return ans;
    }
}
