package com.ali.datstructures.interfaces;

import com.ali.datstructures.list.Node;

public interface List<T> {
    boolean isEmpty();
    void addNodeAtFront(Node<T> node);
    void addNodeAtLast(Node<T> node);
    boolean contains(T value);
    Node<T> deleteFirst();
    void displayList();

    /**
     * Displays the current list from a given node until the end of the list.
     * This  is applicable only to the list supporting next and previous look up.
     * @param fromNode -- Node from which the traversal begins.
     * @param lookForward -- {@code True} loops forward {@code False} loops back words.
     */
    void displayList(Node<T> fromNode,boolean lookForward);
    void displayReverseList();
    Node<T> deleteLast();
    default boolean addNodeAfter(Node<T> node,T value){
        System.out.println("adding node after");
        return false;
    }
    Node<T> deleteNodeWithValue(T value);
}
