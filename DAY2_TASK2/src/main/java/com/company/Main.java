package com.company;

public class Main {

    public static void main(String[] args) {
        int n = 25;
        for(int i=1; i<n; i++){
            for(int j=i; j<n;j++){
                if (i*i + j*j < n){
                    System.out.print(i*i + j*j + " ");
                }
            }
        }
    }
}