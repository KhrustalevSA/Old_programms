package com.company;

public class Arr {
    int iarr[] = new int[10];
    public void Sort() {                            // Задание с сортровкой массива
        int value;
        for (int i = 9; i >= 0; --i) {
            iarr[i] = i;
        }
        iarr[3] = 20;
        iarr[7] = 17;
        iarr[8] = 4;

        for (int i = 0; i < 10; i++) {
            System.out.print(iarr[i] + " ");
        }
        System.out.println();

        int j = 0;
        while (j != 9) {                            // Сортровка без использования встроенных методов
            if (iarr[j] > iarr[j + 1]) {
                value = iarr[j];
                iarr[j] = iarr[j + 1];
                iarr[j + 1] = value;
                j = 0;
            }
            j++;

        }
        for (int i = 0; i < 10; i++) {
            System.out.print(iarr[i] + " ");
        }
    }

    public int[] getIarr() {
        return iarr;
    }
}
