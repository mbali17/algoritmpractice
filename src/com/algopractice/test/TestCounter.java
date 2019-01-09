package com.algopractice.test;

import com.ali.adt.Counter;

public class TestCounter {

    public static void main(String[] args) {
        Counter firstCounter = new Counter("First Counter");
        firstCounter.increment();
        System.out.println("Counter: "+firstCounter.toString());
    }
}
