package com.company;

public class Main {

    public static void main(String[] args) {
        char carr[][] = new char[10][10];

        for(int i=0; i<10; i++){
            for(int j=0; j<10; j++){
                carr[i][j] = '1';
            }
        }

        for(int i=0; i<5; i++){
            for(int j=0; j<5; j++){
                carr[i][j] = '0';
            }
        }

        for(int i=0; i<10; i++){
            for(int j=0; j<10; j++){
                System.out.print(carr[i][j]+ " ");
            }
            System.out.println();
        }
    }
}
