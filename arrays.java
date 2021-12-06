package com.company;

public class Main {
	
    public static void main(String[] args) {
        int[] testarray = new int[]{15, 20, 25, 30, 35};
        int first = testarray[0];
        int last = testarray[testarray.length - 1];
        int mid = testarray[testarray.length - 3];
int temp = first;
first = last;
last = temp;
int res = mid + first;
System.out.println(res);
    }
}