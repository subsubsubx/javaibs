package com.company;

import java.util.Arrays;

    public class Main {

        public static void main(String[] args) {
            int[] testarray = new int[]{15, 20, 25, 30, 35};
            int temp = testarray[0];
            testarray[0] = testarray[testarray.length - 1];
            testarray[testarray.length - 1] = temp;
            System.out.println(testarray[0] + testarray[testarray.length - 3]);
        }
    }