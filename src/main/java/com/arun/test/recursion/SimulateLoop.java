package com.arun.test.recursion;

public class SimulateLoop {
public static void main(String[] args) {
	//printNumDesc(5);
	//printNumAsc(5);
	printNumDescThenAsc(5);
}

private static void printNumDesc(int n) {
	if (n < 1) {
		return;
	}
	System.out.println(n);
	printNumDesc(n - 1);
}

private static void printNumAsc(int n) {
	if (n < 1) {
		return;
	}
	printNumAsc(n - 1);
	System.out.println(n);
}

private static void printNumDescThenAsc(int n) {
	if (n < 1) {
		return;
	}
	System.out.println(n);
	printNumDescThenAsc(n - 1);
	System.out.println(n);
}

}
