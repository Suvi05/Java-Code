//package Lectures.Interview;
//
//import java.util.HashMap;
//import java.util.Map;
//import java.util.Set;
//
//public class Test {
//    public static void main(String[] args) {
//        int arr[]={1,0,-3,0,-1,3,0};
//
//        HashMap<Integer,Integer> map=new HashMap<Integer,Integer>();
//        for(int i=0;i<arr.length;i++){
//            if(map.containsKey(arr[i])){
//                int of=map.get(arr[i]);
//                int nf=of+1;
//                map.put(arr[i],nf);
//            }
//            else{
//                map.put(arr[i],1);
//            }
//        }
//        if(checkBalanced(map)==true){
//            System.out.println("Balanced Array");
//        }
//        else{
//            System.out.println("Not Balanced Array");
//        }
//        System.out.println(map);
//    }
//    public static boolean checkBalanced(HashMap map){
//        Set<Map.Entry<Integer,Integer>> mset= map.entrySet();
//        for(){
//
////            if(mset.getKey() != 0){
////                if(mset.getKey() != (- (mset.getKey())){
////                    return false;
////                }
////            }
//        }
//        return true;
//    }
//}
//
////// Iterating HashMap through for loop
////        for (Map.Entry<String, String> set :foodTable.entrySet()) {
////
////        // Printing all elements of a Map
////        System.out.println(set.getKey() + " = "
////        + set.getValue());
////        }
