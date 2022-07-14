package com.epam.rd.autotasks;

class CycleSwap {
    static void cycleSwap(int[] array) {
        if(array.length > 0) {
            int temporaryNum = array[array.length - 1];
            System.arraycopy(array, 0, array, 1, array.length - 1);
        array[0] = temporaryNum;
        }
    }



        static void cycleSwap(int[] array, int shift) {
        if(array.length > 0) {
                for(int j = 0; j < shift; j++) {
                    int temporaryNum = array[array.length - 1];
                    System.arraycopy(array, 0, array, 1, array.length - 1);
                    array[0] = temporaryNum;
                }
                }
            }
}