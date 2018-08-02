package com.ali.list;

public class Node<T> {
    private Node<T> next;
    private T dataAtTheNode;

    public Node<T> getNext() {
        return next;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }

    public T getdataAtTheNode() {
        return dataAtTheNode;
    }

    public void setdataAtTheNode(T dataAtTheNode) {
        this.dataAtTheNode = dataAtTheNode;
    }
}
