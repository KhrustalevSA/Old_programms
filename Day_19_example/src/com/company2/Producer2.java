package com.company2;

public class Producer2 extends Thread {
    Store2 store;

    Producer2(Store2 store) {
        this.store = store;
    }

    public void run() {
        try {
            while (true) {
                store.toStore();
                sleep(700);
            }
        } catch (Exception e) {
        }
    }
}
