package com.ali.list;

public class DoublyLinkedList<T> extends AbstractList<T> {
    private Node<T> last;
    private Node<T> previous;


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
    public void addNodeAfter(Node<T> node, T value) {
            if(isEmpty()){
                return;
            }else {
                Node <T> runnerNode =  first;
                while (runnerNode != null){
                    if(runnerNode.getdataAtTheNode().equals(value)){
                        Node<T> nextNode = runnerNode.getNext();
                        nextNode.setPrevious(node);
                        node.setNext(nextNode);
                        runnerNode.setNext(node);
                        node.setPrevious(runnerNode);
                        return;
                    }else {
                        runnerNode= runnerNode.getNext();
                    }
                }
            }
    }

    public void displayReverseList(){
        Node<T> temp = last;
        while (temp !=  null){
            System.out.println(temp.getdataAtTheNode());
            temp = temp.getPrevious();
        }
    }
}
