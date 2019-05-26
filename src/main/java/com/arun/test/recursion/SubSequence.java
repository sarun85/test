package com.arun.test.recursion;

public class SubSequence {
public static void main(String[] args) {
	int[] arr = {1 , 2, 3};
	printSubSeq(arr, 0, 0);
}

private static void printSubSeq(int[] arr, int start, int end) {
	if (end == arr.length) {
		return;
	}
	System.out.print("[");
	for (int i = start; i < end; i++){ 
        System.out.print(arr[i] + ", "); 
    }
    System.out.println(arr[end] + "]");
    start += 1;
    if (start > end) {
    	start = 0;
    	end += 1;
    }
    printSubSeq(arr, start, end);
	return;
}
}
