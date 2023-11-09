package Lectures.Interview;

import java.util.LinkedList;
import java.util.Stack;

class ListNode {
    ListNode next;
    int data;

    ListNode(int data) {
        this.data = data;
        this.next = null;
    }
}

class MyLinkedList{
    ListNode head;
    //Append Function
    void append(int data){
        ListNode newNode=new ListNode(data);
        if(head==null){
            head=newNode;
            return;
        }
        ListNode current=head;
        while(current.next!=null){
            current=current.next;
        }
        current.next=newNode;
    }

    //Print Function
    void printLL(){
        ListNode current=head;
        if(current==null){
            System.out.println("No Elements in Linked List");
        }
        else{
            while(current!=null){
                System.out.print(current.data+ "->");
                current=current.next;
            }
        }
    }
    //Reverse Function
    void reverseLL(){
        ListNode prev=null;
        ListNode current=head;
        ListNode next;

        while(current!=null){
            next=current.next;
            current.next=prev;
            prev=current;
            current=next;
        }
        head=prev;
    }
}
public class ReverseLinkedListV2 {
    public static void main(String[] args) {
        MyLinkedList list=new MyLinkedList();
        list.append(1);
        list.append(2);
        list.append(3);
        list.append(4);
        list.append(5);

        list.printLL();
        list.reverseLL();
        System.out.println("Reversed Linked List:");
        list.printLL();
    }
}

