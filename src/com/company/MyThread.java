package com.company;

public class MyThread extends Thread {

    @Override
    public void run() {
        int[] array = new int[10];
        int maxValue = 0;
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
            if (array[i] > maxValue) {
                maxValue = array[i];
            }
        }
        System.out.println(getName() + ": " + maxValue);
    }
}
