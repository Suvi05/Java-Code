package LLDProjects.InMemoryCache.algorithms;

import lombok.Getter;

@Getter
public class DoublyLinkedListNode<E> {
    DoublyLinkedListNode<E> next;
    DoublyLinkedListNode<E> prev;
    E element;

    //Have both first and last node that's why it is DLL
    public DoublyLinkedListNode(E element) {
        this.element = element;
        this.next = null;
        this.prev = null;
    }
}
