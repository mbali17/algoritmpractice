package com.ali.datstructures.list;

import com.ali.datstructures.interfaces.List;

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
        //this checks for if there is no element in the list.
        if(isEmpty()){
            System.out.println("The List is empty.");
            return null;
        }
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

    @Override
    public void displayList(Node<T> fromNode, boolean lookForward) {
        Node<T> temp = fromNode;
        if(!isEmpty() && !lookForward) {
            System.out.print("List (last ->first): ");
            while (temp != null) {
                System.out.print("{"+temp.getdataAtTheNode() +"} " );
                temp = temp.getPrevious();
            }
            System.out.println();
        }else if(!isEmpty() && lookForward) {
            System.out.print("List (first ->Last): ");
            while (temp != null) {
                System.out.print("{"+temp.getdataAtTheNode() +"} " );
                temp = temp.getNext();
            }
            System.out.println();
        }
    }
}
