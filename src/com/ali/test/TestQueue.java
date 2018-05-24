package com.ali.test;

import com.ali.exceptions.QueueUnderflowException;
import com.ali.exceptions.StackOverFlowException;
import com.ali.queue.Queue;

public class TestQueue {
    //TODO: Add more test cases.
    public static void main(String[] args) {
        Queue<Integer> integerQueue = new Queue<>(5);
        int i=0;
        try {
            while (!integerQueue.isFull()) {
                integerQueue.insert(i);
                i++;
            }
            integerQueue.printCurrentQueueState();
            //integerQueue.insert(1000);
            while (!integerQueue.isEmpty()) {
                integerQueue.remove();
            }
        } catch (StackOverFlowException e) {
            e.printStackTrace();
        } catch (QueueUnderflowException e) {
            e.printStackTrace();
        }

    }
}
