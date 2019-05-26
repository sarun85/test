package com.arun.test.recursion;

/**
 * PowerSet - Iteration and Recursion.
 *
 */
public class GeneratePowerSet {
public static void main(String[] args) {
	genPowerSet("abc", -1, "");
}

private static void genPowerSet(String str, int index, String curr) {
	System.out.println(curr);
	for (int i = index + 1; i < str.length(); i++) {
		curr += str.charAt(i);
		//System.out.println("index: " + i);
		genPowerSet(str, i, curr);
		
		curr = curr.substring(0, curr.length() - 1);
		//System.out.println("curr-Substring: "  + curr + " - index : " + i);
	}
	
	
}
}
