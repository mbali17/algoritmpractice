package com.ali.interfaces;

import com.ali.list.Node;

public interface List<T> {
    boolean isEmpty();
    void addNodeAtFront(Node<T> node);
    void addNodeAtLast(Node<T> node);
    boolean contains(T value);
    Node<T> deleteFirst();
    void displayList();
    void displayReverseList();
    Node<T> deleteLast();
    default boolean addNodeAfter(Node<T> node,T value){
        System.out.println("adding node after");
        return false;
    }
    Node<T> deleteNodeWithValue(T value);
}
