package com.ali.list;

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

    public Node<T> deleteFirst(){
        Node<T> tempNode = first;
        first = tempNode.getNext();
        return tempNode;
    }
}
