package com.ali.queue;

import com.ali.exceptions.QueueUnderflowException;
import com.ali.exceptions.StackOverFlowException;
import com.ali.exceptions.StackUnderFlowException;

import java.util.Arrays;
import java.util.prefs.Preferences;
import java.util.stream.IntStream;

/**
 * Implement Queue datastructure using array.
 * @param <T>
 * TODO : Fix the current status method to print the values between front and rear.
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
        front = -1;
    }

    /**
     * Checks if the current queue is full.
     * @return {@code true} if number of items is same as size of the array else {@code false}
     */
    public boolean isFull(){
        //Check if the rear of the queue has reached the.
        return rear == this.size-1;
    }

    /**
     * Checks if the current queue is empty.
     * @return {@code true} if the rear is -1 otherwise {@code false}
     */
    public boolean isEmpty(){
        //Check if the queue is processed completely.
        return (front ==-1 && rear == -1);
    }

    /**
     *
     * @param element
     * @throws StackOverFlowException
     */
    public void enQueue(T element) throws StackOverFlowException{
        if(isFull()){
            throw new StackOverFlowException("The Queue is full,Try after some time");
        }else if(isEmpty()){
            ++front;
            ++rear;
        }else{
            ++rear;
        }
        queueElements[rear] = element;
        ++noOfItems;
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
    public T deQueue() throws QueueUnderflowException {
        if(isEmpty() ){
            //Re-initialize the queue.
            System.out.println("Re-initializing the array, the value of front is "+ front + " and th value of rear is" + rear);
            reInitializeQueue();
            throw new QueueUnderflowException("There are no more elements to be removed.");
        }else if (front == rear ){
            T elementAtTheFront = getElementAndIncrrementFront();
            --noOfItems;
            reInitializeQueue();
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
        front=-1;
        rear=-1;
    }

    public void printCurrentQueueState(){
        for(int i=front; i< rear;i++ ){
            System.out.println(queueElements[i]);
        }
    }
}
