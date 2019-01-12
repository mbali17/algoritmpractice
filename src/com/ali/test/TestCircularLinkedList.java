package com.ali.test;

import com.ali.interfaces.List;
import com.ali.list.CircularLinkedList;
import com.ali.list.Node;

public class TestCircularLinkedList {

    public static void main(String[] args) {
        List<Integer> circularLinkedList = new CircularLinkedList<>();
        Node<Integer> node1 = new Node(1);
        Node<Integer> node2 = new Node(3);
        Node<Integer> node3 = new Node(5);
        Node<Integer> node4 = new Node(7);
        Node<Integer> node5 = new Node(99999);

        circularLinkedList.addNodeAtFront(node1);
        circularLinkedList.addNodeAtFront(node2);
        circularLinkedList.addNodeAtFront(node3);
        circularLinkedList.addNodeAtLast(node4);
        circularLinkedList.addNodeAtLast(node5);

        circularLinkedList.displayList();

        circularLinkedList.deleteFirst();
        circularLinkedList.displayList();
    }
}
