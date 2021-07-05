package com.company;

public class Main {

    public static void main(String[] args) {
        Thread threadOne = new MyThread();
        threadOne.setName("ThreadOne");
        Thread threadTwo = new MyThread();
        threadTwo.setName("ThreadTwo");
        Thread threadThree = new MyThread();
        threadThree.setName("ThreadTree");
        Thread threadFour = new MyThread();
        threadFour.setName("ThreadFour");
        Thread threadFive = new MyThread();
        threadFive.setName("ThreadFive");
        Thread threadSix = new MyThread();
        threadSix.setName("ThreadSix");
        Thread threadSeven = new MyThread();
        threadSeven.setName("ThreadSeven");
        Thread threadEight = new MyThread();
        threadEight.setName("ThreadEight");
        Thread threadNine = new MyThread();
        threadNine.setName("ThreadNine");
        Thread threadTen = new MyThread();
        threadTen.setName("ThreadTen");
        threadOne.start();
        threadTwo.start();
        threadThree.start();
        threadFour.start();
        threadFive.start();
        threadSix.start();
        threadSeven.start();
        threadEight.start();
        threadNine.start();
        threadTen.start();
    }
}
