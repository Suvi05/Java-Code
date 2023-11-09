package LLDProjects.InMemoryCache.cache.strategy;

import LLDProjects.InMemoryCache.algorithms.DoublyLinkedList;
import LLDProjects.InMemoryCache.algorithms.DoublyLinkedListNode;

import java.util.HashMap;
import java.util.Map;

//Least Recently Used Algorithm
public class LRUEvictionStrategy<Key> implements EvictionStrategy<Key> {
    //LRU needs a Doubly Linked List and one HashMap
    private DoublyLinkedList<Key> dll;
    private Map<Key, DoublyLinkedListNode<Key>> mapper;

    public LRUEvictionStrategy() {
        this.dll = new DoublyLinkedList<>();
        this.mapper = new HashMap<>();
    }

    @Override
    public void keyAccessed(Key key) {
        //I'll check if key is already there in hashmap?
        if (mapper.containsKey(key)) {
            //If it was there then I'll remove it from there
            dll.detachNode(mapper.get(key));
            //And then will store that in front
            dll.addNodeAtLast(mapper.get(key));
        } else {
            //If it is accessed first time then I'll create a new node
            //And will store it in last because of LRU Algo
            DoublyLinkedListNode<Key> newNode = dll.addElementAtLast(key);
            mapper.put(key, newNode);
        }
    }

    @Override
    public Key evictKey() {
        DoublyLinkedListNode<Key> first = dll.getFirst();
        if (first == null) {
            return null;
        }
        dll.detachNode(first);
        return first.getElement();
    }
}
