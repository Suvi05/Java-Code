package LLDProjects.InMemoryCache.algorithms;

import LLDProjects.InMemoryCache.algorithms.exceptions.InvalidElementException;
import LLDProjects.InMemoryCache.algorithms.exceptions.InvalidNodeException;
import lombok.Getter;

//I have made it in different class so that it can be reused.
@Getter
public class DoublyLinkedList<E> {
    DoublyLinkedListNode<E> first;
    DoublyLinkedListNode<E> last;

    public DoublyLinkedList() {
        first = null;
        last = null;
    }

    //This method is used to detach a specified node from the doubly linked list.
    //The method takes a DoublyLinkedListNode as an argument, which represents the node to be detached.
    public void detachNode(DoublyLinkedListNode<E> node) {
        //This check is essential to ensure that you're not trying to detach a null node,
        //which would result in a NullPointerException.
        if (node == null) {
            return;
        }
        if (node.equals(first)) {
            //It updates the first reference to point to the next node (first = first.next).
            first = first.next;
            //Then, it checks if the new first node is not null. If it's not null,
            //it sets the prev reference of the new first node to null (first.prev = null).
            if (first != null) {
                first.prev = null;
            }
        } else if (node.equals(last)) {
            //It updates the last reference to point to the previous node (last = last.prev).
            last = last.prev;
            //Then, it checks if the next reference of the new last node is not null.
            //If it's not null, it sets the next reference of the new last node to null (last.next = null).
            if (last.next != null) {
                last.next = null;
            }
        }
        //If the given node is neither the first nor the last node, it must be in the middle of the list.
        else {
            //It updates the next reference of the node before the given node (node.prev.next)
            //to point to the node after the given node (node.next).
            node.prev.next = node.next;
            //It updates the prev reference of the node after the given node (node.next.prev)
            //to point to the node before the given node (node.prev).
            node.next.prev = node.prev;
        }
    }

    public void addNodeAtLast(DoublyLinkedListNode<E> node) {
        if (node == null) {
            throw new InvalidNodeException();
        }
        if (last == null) {
            last = node;
            first = node;
        } else {
            last.next = node;
            node.prev = last;
            node.next = null;
            last = node;
        }
    }

    public DoublyLinkedListNode<E> addElementAtLast(E element) {
        if (element == null) {
            throw new InvalidElementException();
        }
        DoublyLinkedListNode<E> newNode = new DoublyLinkedListNode<>(element);
        addNodeAtLast(newNode);
        return newNode;
    }
}
