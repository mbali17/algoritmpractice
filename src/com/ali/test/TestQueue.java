package com.ali.test;

import com.ali.exceptions.QueueUnderflowException;
import com.ali.exceptions.StackOverFlowException;
import com.ali.queue.Queue;

public class TestQueue {
    //TODO: Add more test cases. Improvise this using the Junit test cases.
    public static void main(String[] args) {
        Queue<Integer> integerQueue = new Queue<>(5);
        int i=0;
        try {
            while (!integerQueue.isFull()) {
                integerQueue.enQueue(i);
                i++;
            }
            integerQueue.printCurrentQueueState();
            while (!integerQueue.isEmpty()) {
                integerQueue.deQueue();
            }
            integerQueue.enQueue(1000);//Uncomment this line to simulate stack over flow exception
            integerQueue.enQueue(2000);//Uncomment this line to simulate stack over flow exception
            integerQueue.enQueue(3000);//Uncomment this line to simulate stack over flow exception
            integerQueue.enQueue(4000);//Uncomment this line to simulate stack over flow exception
            integerQueue.enQueue(5000);//Uncomment this line to simulate stack over flow exception
            integerQueue.enQueue(2000);//Uncomment this line to simulate stack over flow exception
            integerQueue.printCurrentQueueState();

        } catch (StackOverFlowException e) {
            e.printStackTrace();
        } catch (QueueUnderflowException e) {
            e.printStackTrace();
        }

    }
}
