package com.ali.list;

import com.ali.interfaces.List;

public abstract class AbstractList<T> implements List<T> {
    Node<T> first;
    @Override
    public boolean isEmpty() {
        return first == null;
    }

    @Override
    public void displayList() {
        Node<T> currentNode = first;
        if(!isEmpty()) {
            System.out.print("List (first -> last): ");
            while (currentNode != null) {
                System.out.print("{" + currentNode.getdataAtTheNode() + "} ");
                currentNode = currentNode.getNext();
            }
            System.out.println();
        }else {
            System.out.println("No Elements to display");
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

    public Node<T> deleteFirst(){
        Node<T> tempNode = first;
        first = tempNode.getNext();
        return tempNode;
    }

    public Node<T> deleteLast(){
        System.out.println("Concrete implementation to be provided by the child class.");
        return null;
    }

    public void displayReverseList(){
        System.out.println("Concrete implementation to be provided by the child class.");
    }

    @Override
    public Node<T> deleteNodeWithValue(T value) {
        return null;
    }
}
