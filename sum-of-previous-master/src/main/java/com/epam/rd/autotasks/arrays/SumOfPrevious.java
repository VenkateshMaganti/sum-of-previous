package com.epam.rd.autotasks.arrays;

import java.util.Arrays;

public class SumOfPrevious {

    public static void main(String[] args) {
        int[] array = new int[]{1, -1, 0, 4, 6, 10, 15, 25};

        System.out.println(Arrays.toString(getSumCheckArray(array)));
    }

    public static boolean[] getSumCheckArray(int[] array){
        int len = array.length;
        boolean res[] = new boolean[len];

        //put your code here
        if(len >= 2) {
            res[0] = false;
            res[1] = false;

            for(int i = 2; i < len; i++) {
                if(array[i] == array[i - 1] + array[i - 2]) {
                    res[i] = true;
                } else {
                    res[i] = false;
                }

            }
        }

        return res;
        //throw new UnsupportedOperationException();
    }
}
