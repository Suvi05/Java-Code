package Lectures.Interview;

public class BinarySearch {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,6,7,8};
        int target=8;

        int result= binarySearch( arr, target);
        if(result== -1){
            System.out.println("Element not found in array");
        }
        else{
            System.out.println("Element found at " + result);
        }

    }
    public static int binarySearch(int[] arr, int target){
        return binary(arr, target,0,arr.length-1);
    }
    public static int binary(int[] arr, int target, int low, int high){
        if(low<=high){
            int mid=(low + high) /2;

            if( arr[mid]==target){
                return mid;
            }
            if(arr[mid]<target){
                return binary(arr, target, mid+1, high);
            }
            else{
                return binary(arr, target, low, mid-1);
            }
        }
        return -1;
    }
}