package JavaTraining.Operators;

public class EqualTo {
    public static void main(String[] args) {
        int[] arr=new int[]{5,10,15,3,2};
        int x=20;
        for(int i=0;i<arr.length;i++){
            if(arr[i]==x){
                System.out.println("Yes this no. is present");
                //break;
            }
        }
       // System.out.println("Sorry this no. is not present");
    }
}
