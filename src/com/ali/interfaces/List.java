package com.ali.interfaces;

import com.ali.list.Node;

public interface List<T> {
    boolean isEmpty();
    void addNodeAtFront(Node<T> node);
    void addNodeAtLast(Node<T> node);
    boolean contains(T value);
    Node<T> deleteFirst();
    void displayList();
}
