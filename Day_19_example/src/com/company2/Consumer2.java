package com.company2;

public class Consumer2 extends Thread {
    Store2 store;

    Consumer2(Store2 store) {
        this.store = store;
    }

    public void run() {
        try {
            while (true) {
                store.fromStore();
                sleep(500);
            }
        } catch (Exception e) {
        }
    }
}
