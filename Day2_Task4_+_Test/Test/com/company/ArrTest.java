package com.company;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrTest {

    @Test
    void sort() {
        Arr arrSort = new Arr();
        int[] arr_needed = new int[]{0,1,2,4,4,5,6,9,17,20};
        arrSort.Sort();
        int[] arr = arrSort.getIarr();

        assertArrayEquals(arr_needed,arr);
    }
}