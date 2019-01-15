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

    public Node<T> deleteFirst(){
        Node<T> tempNode = first;
        first = tempNode.getNext();
        return tempNode;
    }


}
