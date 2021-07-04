package com.company;

public class Main {

    public static void main(String[] args) {
        Thread threadOne = new MyThread();
        threadOne.setName("ThreadOne");
        Thread threadTwo = new MyThread();
        threadTwo.setName("ThreadTwo");
        Thread threadThree = new MyThread();
        threadThree.setName("ThreadTree");
        threadOne.start();
        threadTwo.start();
        threadThree.start();
    }
}
