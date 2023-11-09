package Lectures.Interview;

import java.util.HashMap;

public class DistinctElementsInWindow {
    public static void main(String[] args) {
        int[] arr={1,2,1,1,1,5,2,1,1,3,4,5};
        int k=3;

        int[] result= distinct(arr,k);
        for(int element:result){
            System.out.print(element+" ");
        }
    }
    public static int[] distinct(int[] arr,int k){
        int[] res=new int[arr.length-k+1];

        HashMap<Integer, Integer> fm=new HashMap<>();
        //At the addition of element 0 to k
        for(int i=0;i<k;i++){
            if(fm.containsKey(arr[i])){
                int of= fm.get(arr[i]);
                int nf=of+1;
                fm.put(arr[i],nf);
            }
            else {
                fm.put(arr[i],1);
            }
            //COUNT AND ADD IN MY RESULT
            int count=0;
            int con=0;
            for(int element:fm.keySet()) {
                count++;
            }
            res[con]=count;
            con++;
        }
        //For rest of the elements k to length-1
        int left=0;
        int right;
        for(int i=left;i<arr.length-k;i++){
            left=i;
            right=i+k;
            if(fm.containsKey(arr[left])){
                int of= fm.get(arr[left]);
                int nf=of-1;
                fm.put(arr[left],nf);
            }
            else if(fm.containsKey(arr[right])){
                int of= fm.get(arr[right]);
                int nf=of+1;
                fm.put(arr[right],nf);
            }
            else {
                fm.put(arr[i],1);
            }
            int count=0;
            int con=0;
            for(int element:fm.keySet()) {
                count++;
            }
            res[con]=count;
            con++;
        }
        return res;
    }
}
