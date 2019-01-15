package com.ali.test;

import com.ali.interfaces.List;
import com.ali.list.DoublyLinkedList;
import com.ali.list.Node;

public class TestDoublyLinkedList {
    public static void main(String[] args) {
        List<Integer> doublyLinkedList = new DoublyLinkedList<>();
        Node<Integer> node1 = new Node(1);
        Node<Integer> node2 = new Node(3);
        Node<Integer> node3 = new Node(5);
        Node<Integer> node4 = new Node(7);
        Node<Integer> node5 = new Node(99999);
        Node<Integer> node6 = new Node(1032544);

        doublyLinkedList.addNodeAtLast(node4);
        doublyLinkedList.addNodeAtLast(node5);
        doublyLinkedList.addNodeAtFront(node1);
        doublyLinkedList.addNodeAtFront(node2);
        doublyLinkedList.addNodeAtFront(node3);

        doublyLinkedList.displayList();
        doublyLinkedList.addNodeAfter(node6,7);
        ((DoublyLinkedList<Integer>) doublyLinkedList).displayReverseList();
    }
}
