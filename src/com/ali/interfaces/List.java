package com.ali.interfaces;

import com.ali.list.Node;

public interface List<T extends Comparable<T>> {
    boolean isEmpty();
    void addNodeAtFront(Node<T> node);
    void addNodeAtLast(Node<T> node);
    boolean contains(T value);
}
