package com.ali.test;

import com.ali.interfaces.List;
import com.ali.list.Node;
import com.ali.list.SinglyLinkedList;

public class TestSinglyLinkedList {
    public static void main(String[] args) {
        Node<Integer> node1 = new Node(1);
        Node<Integer> node2 = new Node(3);
        Node<Integer> node3 = new Node(5);
        Node<Integer> node4 = new Node(7);
        Node<Integer> node5 = new Node(99999);
        List<Integer> myList = new SinglyLinkedList<>();
        myList.addNodeAtFront(node1);
        myList.addNodeAtFront(node2);
        myList.addNodeAtFront(node3);
        myList.addNodeAtFront(node4);
        myList.addNodeAtLast(node5);
        myList.deleteFirst();
        //System.out.println("List length: "+ getListLength(node1));
        myList.displayList();
        /*
        Node<Integer> deletedNOde = myList.deleteFirst();
        System.out.println("After deletion: "+deletedNOde.getdataAtTheNode());*/
        System.out.println("does the list contain : "+myList.contains(3));
        //myList.displayList();
        System.out.println("Is the list empty: "+myList.isEmpty());
    }

    private static int getListLength(Node<Integer> node) {
        System.out.println("iterating the list from a given point");
        int noOfElements = 0;
        while (node != null) {
            ++noOfElements;
            System.out.println("data at the node"+node.getdataAtTheNode());
            node = node.getNext();
        }
        return noOfElements;
    }
}
