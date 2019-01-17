package com.ali.datstructures.queue;

import com.ali.datstructures.exceptions.QueueOverflowException;
import com.ali.datstructures.exceptions.QueueUnderflowException;
import com.ali.datstructures.exceptions.StackOverFlowException;

/**
 * Implement Queue data structure using array.
 * <p>
 *     Implements the Queue data structure using the Array.This implementation of the queue can be used when the
 *     queue size is fixed and is only re-initialized once the array is completely filled and  processed (when the rear
 *     and the front reaches the end of the queue. )
 * @param <T> Type of elements
 */
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
        front = 0;
    }

    /**
     * Checks if the current queue is full.
     * @return {@code true} if rear is same as size of the array else {@code false}
     */
    public boolean isFull(){
        //Check if the rear of the queue has reached the.
        return rear == this.size-1;
    }

    /**
     * Checks if the current queue is empty.
     * @return {@code true} if the rear and front is -1 otherwise {@code false}
     */
    public boolean isEmpty(){
        //Check if the queue is processed completely.
        return (noOfItems == 0);
    }

    /**
     *
     * @param element To be added to the front of the queue.
     * @throws StackOverFlowException when the array is full.
     */
    public void enQueue(T element) throws QueueOverflowException {
        if(isFull()){
            throw new QueueOverflowException("The Queue is full,Try after some time");
        }else{
            ++rear;
        }
        queueElements[rear] = element;
        ++noOfItems;
    }

    /**
     * @return the element at the front of the queue.
     */
    public T peekQueue(){
        return queueElements[front];
    }

    /**
     * Removes the element at the front of the queue.
     * @return <T> element which is being removed at the front of the queue.
     */
    public T deQueue() throws QueueUnderflowException {
        if(isEmpty() ){
            //Re-initialize the queue by initializing rear to -1. Which makes this a circular queue
            // (Invoke reInitializeQueue())
            throw new QueueUnderflowException("There are no more elements to be removed.");
        }else if (front == rear ){
            T elementAtTheFront = getElementAndIncrrementFront();
            --noOfItems;
            //Re-initialize the queue by initializing rear to -1. Which makes this a circular queue.
            // (Invoke reInitializeQueue())
            return   elementAtTheFront;
        }
        else {
            T elementAtTheFront = getElementAndIncrrementFront();
            --noOfItems;
            return  elementAtTheFront;
        }

    }

    private T getElementAndIncrrementFront() {
        T  elementAtTheFront =  peekQueue();
        front++;
        return elementAtTheFront;
    }

    private void reInitializeQueue() {
        front=0;
        rear=-1;
    }

    /**
     * Prints the current elements in the queue.
     */
    public void printCurrentQueueState(){
        if(isEmpty())
            System.out.println("No ELements to print");
        for(int i=front; i< rear;i++ ){
            System.out.println(queueElements[i]);
        }
    }
}
