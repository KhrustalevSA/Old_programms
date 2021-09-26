package com.company2;

public class Main2 {

    public static void main(String[] args) {
        Store2 s = new Store2();
        Thread p1 = new Producer2(s);
        Thread p2 = new Producer2(s);
        Thread p3 = new Producer2(s);
        Thread c1 = new Consumer2(s);
        Thread c2 = new Consumer2(s);
        p1.start();
        p2.start();
        p3.start();
        c1.start();
        c2.start();
    }
}
