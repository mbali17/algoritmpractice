package com.ali.list;

import com.ali.interfaces.List;

public class SinglyLinkedList<T>  implements List<T> {
    private Node<T> first;


    @Override
    public boolean isEmpty() {
        return first == null;
    }

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

    @Override
    public void displayList() {
        Node<T> currentNode = first;
        while (currentNode != null) {
            System.out.println("data at the node"+currentNode.getdataAtTheNode());
            currentNode = currentNode.getNext();
        }

    }

    @Override
    public boolean contains(T value) {
        Node<T> currentNode = first;
        while (currentNode != null ){
            if(currentNode.getdataAtTheNode().equals(value)) {
                return true;
            }
            currentNode = currentNode.getNext();
        }
        return false;
    }
}
