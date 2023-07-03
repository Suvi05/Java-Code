package JavaTraining.Exceptions.RuntimeException;

public class ArrayIndexOutOfBound {
    public static void main(String[] args) {
        int arr[] = {10, 20, 30};  //3

        System.out.println("Elements in this Array  : ");
        for (int i = 0; i <= arr.length; i++) { // 0   1   2   3
            System.out.println(arr[i]); //arr[3]
        }
        System.out.println("If you want to enter more..");
    }
}
