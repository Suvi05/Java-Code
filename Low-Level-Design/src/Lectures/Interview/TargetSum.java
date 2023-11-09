package Lectures.Interview;

import java.util.HashSet;

public class TargetSum {
    public static void main(String[] args) {
        int[] array = {1, 3, 6, 7, 5, 0};
        int targetSum = 8;

        System.out.println("Input Array: " + java.util.Arrays.toString(array));
        System.out.println("Pairs with Sum " + targetSum + ":");
        findPairsWithSum(array, targetSum);
    }
    public static void findPairsWithSum(int[] array, int targetSum){
        HashSet<Integer> hs=new HashSet<>();
        for(int i:array){
            hs.add(i);
        }

        for(int i:array){
            int comp=targetSum-i;
            if(hs.contains(comp)){
                System.out.println(i +" - " + comp);
                hs.remove(i);
            }
        }
    }
}
