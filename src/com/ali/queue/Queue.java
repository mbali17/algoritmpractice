package com.ali.queue;

import com.ali.exceptions.QueueUnderflowException;
import com.ali.exceptions.StackOverFlowException;
import com.ali.exceptions.StackUnderFlowException;

import java.util.Arrays;

public class Queue <T extends Comparable<T>>{
    //Variables needed for the data structure.
    private int size;
    private T[] queueElements;
    private int front;//Points to the front of the queue.
    private int rear; //Points to the end of the array
    private int noOfItems;

    public Queue(int size) {
        this.size = size;
        queueElements = (T[]) new Comparable[this.size];
        rear = -1;
    }

    /**
     * Checks if the current queue is full.
     * @return {@code true} if number of items is same as size of the array else {@code false}
     */
    public boolean isFull(){
        //Check if the rear of the queue has reached end  and the elements at the front of the queue is not processed.
        return (rear == size-1 && front==0);
    }

    /**
     * Checks if the current queue is empty.
     * @return {@code true} if the rear is -1 otherwise {@code false}
     */
    public boolean isEmpty(){
        //Check if the queue is never processed or is processed completely.
        return (rear == -1 || front == this.size-1);
    }

    /**
     *
     * @param element
     * @throws StackOverFlowException
     */
    public void insert(T element) throws StackOverFlowException{
        if(isFull()){
            throw new StackOverFlowException("The Queue is full,Try after some time");
        }
        queueElements[++rear] = element;
        noOfItems++;
    }

    /**
     * @return the element at the beginning of the queue.
     */
    public T peekQueue(){
        return queueElements[front];
    }

    /**
     * Removes the element at the front of the queue.
     * @return  element which is being removed at the front of the queue.
     */
    public T remove() throws QueueUnderflowException {
        if(isEmpty()){
            //Re-initialize the queue.
            front=0;
            rear=-1;
            throw new QueueUnderflowException("There are no more elements to be removed.");
        }
        return queueElements[front++];
    }

    public void printCurrentQueueState(){
        Arrays.stream(queueElements).forEach(System.out::println);
    }
}
