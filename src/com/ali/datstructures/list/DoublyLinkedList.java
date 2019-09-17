package com.ali.datstructures.list;

public class DoublyLinkedList<T> extends AbstractList<T> {
    private Node<T> last;


    @Override
    public void addNodeAtFront(Node<T> node) {
        if(isEmpty()){
            last = node;
            first = node;
        }else {
            //New nodes next is the node being pointed by first.
            node.setNext(first);
            //previous 'first' previous points to current node.
            first.setPrevious(node);
            //finally first points to the current node passed.
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
        displayList(last,false);
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

    @Override
    public Node<T> deleteNodeWithValue(T value) {
        Node <T> currentNode =  first;
        if(!isEmpty()) {
            while (currentNode != null) {
                if (currentNode.getdataAtTheNode().equals(value)) {
                    if(currentNode.getNext() == null && currentNode.getPrevious() == null){
                        //only single node.
                        first = null;
                        last = null;
                        return currentNode;
                    }else if (currentNode == first){
                        //This is the first node.
                        Node<T> nextNode = first.getNext();
                        nextNode.setPrevious(null);
                        first = nextNode;
                        return currentNode;
                    }else if(currentNode == last){
                        //This is the last node.
                        currentNode.getPrevious().setNext(null);
                        last = currentNode.getPrevious();
                        return currentNode;
                    }else {
                        Node<T> currentNodesNextNode = currentNode.getNext();
                        Node<T> currentNodesPreviousNode = currentNode.getPrevious();
                        currentNodesPreviousNode.setNext(currentNodesNextNode);
                        currentNodesNextNode.setPrevious(currentNode.getPrevious());
                        return currentNode;
                    }
                }
                currentNode = currentNode.getNext();
            }
        }
        return null;
    }

}
