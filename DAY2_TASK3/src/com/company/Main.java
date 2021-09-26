package com.company;

public class Main {

    public static void main(String[] args) {
	    int n = 10;
	    int iarr[] = new int[n];
        int iarr2[] = new int[n];
        int value = 0;
	    for(int i=0; i<n; i++){
	        iarr[i] = i;
        }
        for(int i=0; i<n; i++){
            iarr2[i] = i;
        }

        iarr[0] = 5;
        iarr[4] = 5;
        iarr[2] = 5;
        iarr[5] = 4;
        iarr[6] = 4;

        System.out.println("Massive 1");
        for (int i=0; i<n; i++){
            System.out.print(iarr[i] + " ");
        }

        System.out.println();

        for (int el:iarr) {
            value =0;
            for (int i = 0; i < n; i++) {
                if (el == iarr[i]) {
                    value += 1;
                }
            }
            if (value > 1) {
                System.out.println("Repeating numbers are in the array");
                break;
            }
            System.out.print(value + " ");
        }
        System.out.println("Massive 2");
        for (int i=0; i<n; i++){
            System.out.print(iarr2[i] + " ");
        }

        System.out.println();

        for (int el:iarr){
            value =0;
            for (int i=0; i<n; i++){
                if(el == iarr2[i]){
                    value += 1;
                }
            }
            if(value > 2){
                System.out.println("Repeating numbers are in the array");
            }
            System.out.print(value + " ");
            if (el == iarr[iarr.length - 1]){
                System.out.println();
                System.out.println("Repeating numbers are't in the array");
            }
        }
    }
}
