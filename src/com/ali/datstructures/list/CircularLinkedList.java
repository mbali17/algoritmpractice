package com.ali.datstructures.list;

public class CircularLinkedList<T> extends AbstractList<T> {

    private Node<T> last;
    @Override
    public void addNodeAtFront(Node<T> node) {
        if(isEmpty()){
            last = node;
        }
        node.setNext(first);
        first = node;
    }

    @Override
    public void addNodeAtLast(Node<T> node) {
        if(isEmpty()){
            first = node;
            last = node;
        }else {
            last.setNext(node);
            last = node;
        }
    }
}
