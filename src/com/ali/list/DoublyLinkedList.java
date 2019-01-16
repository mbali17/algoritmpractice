package com.ali.list;

public class DoublyLinkedList<T> extends AbstractList<T> {
    private Node<T> last;


    @Override
    public void addNodeAtFront(Node<T> node) {
        if(isEmpty()){
            last = node;
            first = node;
        }else {
            node.setNext(first);
            first.setPrevious(node);
            first = node;
        }
    }

    @Override
    public void addNodeAtLast(Node<T> node) {
        if(isEmpty()){
            first =  node;
            last = node;
        }else {
            last.setNext(node);
            node.setPrevious(last);
            last = node;
        }
    }

    @Override
    public boolean addNodeAfter(Node<T> node, T value) {
            if(isEmpty()){
                return false;
            }else {
                Node <T> runnerNode =  first;
                while (runnerNode != null){
                    if(runnerNode.getdataAtTheNode().equals(value)){
                        Node<T> nextNode = runnerNode.getNext();
                        if(runnerNode == last){
                            runnerNode.setNext(node);
                            node.setPrevious(runnerNode);
                            last=node;
                        }else {
                            nextNode.setPrevious(node);
                            node.setNext(nextNode);
                            runnerNode.setNext(node);
                            node.setPrevious(runnerNode);
                        }
                        return true;
                    }else {
                        runnerNode= runnerNode.getNext();
                    }
                }
            }
            return false;
    }

    @Override
    public void displayReverseList(){
        Node<T> temp = last;
        while (temp !=  null){
            System.out.println(temp.getdataAtTheNode());
            temp = temp.getPrevious();
        }
    }

    @Override
    public Node<T> deleteLast() {
        Node<T> temp = last;
        if(!isEmpty()) {
            if (first.getNext() == null) {
                //This signifies there is only one node
                first = null;
            } else {
                last.getPrevious().setNext(null);
            }
            last = last.getPrevious();
        }
        return temp;
    }

    @Override
    public Node<T> deleteFirst() {
        Node<T> temp = first;
        if(!isEmpty()) {
            if (first.getNext() == null) {
                //This signifies there is only one node
                last = null;
            } else {
                first.getNext().setPrevious(null);
            }
            first = first.getNext();
        }
        return temp;
    }
}
