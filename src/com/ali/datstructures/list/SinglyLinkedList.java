package com.ali.datstructures.list;

public class SinglyLinkedList<T>  extends AbstractList<T> {

    @Override
    public void addNodeAtFront(Node<T> node) {
        node.setNext(first);
        first = node;
    }

    @Override
    public void addNodeAtLast(Node<T> node) {
        Node<T> currentNode = first;
        while (currentNode.getNext() != null) {
            currentNode = currentNode.getNext();
        }
        currentNode.setNext(node);
    }

}
