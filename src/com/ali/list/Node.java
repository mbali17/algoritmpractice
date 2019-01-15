package com.ali.list;

public class Node<T> {
    private Node<T> next;
    private Node<T> previous;

    public Node<T> getPrevious() {
        return previous;
    }

    public void setPrevious(Node<T> previous) {
        this.previous = previous;
    }

    private T dataAtTheNode;

    public Node(T element){
        dataAtTheNode = element;
        next = null;
    }

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
