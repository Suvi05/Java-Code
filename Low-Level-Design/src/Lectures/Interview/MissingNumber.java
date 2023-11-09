package Lectures.Interview;

public class MissingNumber {
    public static void main(String[] args) {
        int[] arr= {0,1,4,5,6,7,99,10000};
        int missingNumber=findMissingNumber(arr);
        System.out.println(missingNumber);
    }
    public static int findMissingNumber(int[] arr){
        int left=0;
        int right= arr.length-1;
            while (left<=right){
                int mid= (left+right)/2;

                if(arr[mid]==mid){
                    left=mid+1;
                }
                else{
                    right=mid-1;
                }
            }
        return left;
    }
}
