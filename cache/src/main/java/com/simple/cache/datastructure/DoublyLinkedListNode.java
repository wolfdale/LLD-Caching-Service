package com.simple.cache.datastructure;

public class DoublyLinkedListNode<E> {
    E key;
    DoublyLinkedListNode<E> next;
    DoublyLinkedListNode<E> prev;

    public DoublyLinkedListNode(E key) {
        this.key = key;
        this.next = null;
        this.prev = null;
    }
}
