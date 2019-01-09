package com.algopractice.adt;


public class Counter {
    private int counter;
    private String counterName;

    public Counter(String counterName) {
        this.counterName = counterName;
    }

    public void increment(){
        this.counter+=1;
    }

    public int getCurrentCounterValue(){
        return this.counter;
    }

    @Override
    public String toString() {
        return this.counterName + "=" + this.counter;
    }
}
