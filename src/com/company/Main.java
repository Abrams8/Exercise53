package com.company;

public class Main {

    public static void main(String[] args) {
        for (int i = 1; i < 11; i++) {
            Thread thread = new MyThread();
            thread.setName("Thread " + i);
            thread.start();
        }
    }
}
