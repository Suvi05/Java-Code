package Lectures.Interview;

import java.util.LinkedList;
import java.util.Stack;

class Node {
    Node next;
    int data;

    Node(int data) {
        this.data = data;
        this.next = null;
    }
}

public class ReverseLinkedListV1 {
    public static void main(String[] args) {
        LinkedList<Integer> list=new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println(list);
        Stack<Integer>st=new Stack<>();
        for (int i:list){
            st.push(i);
        }
        LinkedList<Integer> result=new LinkedList<>();
        while (st.size()>0){
            result.add(st.pop());
        }
        System.out.println(result);
    }
}

