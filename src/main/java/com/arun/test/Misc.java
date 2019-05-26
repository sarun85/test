package com.arun.test;

public class Misc {
public static void main(String[] args) {
	System.out.println(exactly3Divisors(30));
}

public static int exactly3Divisors(int N)
{
    int count = 0;
    for (int i = N; i > 3; i--) {
        if (has3Factors(i)) {
            count++;
        }
    }
    return count; 
}

public static boolean has3Factors(int N) {
    int factors = 2;
    for (int i = 2; i <= N/2; i++) {
        if (N % i == 0) {
            factors++;
            System.out.println(N);
        }
        if (factors == 4) {
            return false;
        }
    }
    return factors == 3;
}
}
