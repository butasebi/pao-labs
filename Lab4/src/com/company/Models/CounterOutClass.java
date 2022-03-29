package com.company.Models;

public class CounterOutClass implements Task{
    static int counter = 0;

    public static int getCounter() {
        return counter;
    }

    public CounterOutClass() {
        this.counter = this.counter + 1;
    }

    @Override
    public void execute() {
        System.out.println(counter);
    }
}
