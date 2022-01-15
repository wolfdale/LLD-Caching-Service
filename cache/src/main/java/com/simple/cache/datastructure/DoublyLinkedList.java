package com.simple.cache.datastructure;

public class DoublyLinkedList<E> {
    DoublyLinkedListNode<E> tail;
    DoublyLinkedListNode<E> head;

    public DoublyLinkedList() {
        this.head = new DoublyLinkedListNode<E>(null);
        this.tail = new DoublyLinkedListNode<E>(null);
        head.next = tail;
        tail.prev = head;
    }


}
