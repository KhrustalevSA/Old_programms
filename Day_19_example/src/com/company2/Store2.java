package com.company2;

public class Store2 {
    private long product = 0;
    public synchronized void toStore() throws Exception{
        while(product==10){
            wait();
        }
        ++product;
        System.out.println("Привезли, стало " + product);
        notify();
    }
    public synchronized void fromStore() throws Exception{
        while(product==0){
            wait();
        }
        --product;
        System.out.println("Увезли, осталось " + product);
        notify();
    }
}
