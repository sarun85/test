package com.arun.test.math;

import java.util.function.Predicate;
import java.util.stream.IntStream;

public class PrimeFunctional {
  public static void main(String[] args) {
    // Imperative- Saying how to do it
    // Mutability
    System.out.println(isPrime(43));

    // Declarative - Saying what to do
    // Immutability, Composition
    // Lazy - The Stream chain is not executed until a terminal function like collect/findfirst is
    // attached to it.
    // Transformation instead of mutation

    System.out.println(isPrimeFunctional(43));
  }

  private static boolean isPrime(int n) {
    if (n < 2) {
      return false;
    }
    if (n == 2 || n == 3) {
      return true;
    }
    if (n % 2 == 0 || n % 3 == 0) {
      return false;
    }
    for (int i = 5; i < n; i += 6) {
      if (n % i == 0 || n % (i + 2) == 0) {
        return false;
      }
    }
    return true;
  }

  private static boolean isPrimeFunctional(int n) {
    Predicate<Integer> isDivisible = divisor -> n % divisor == 0;
    // return n > 1 && IntStream.range(2, n).noneMatch(index -> n % index == 0);
    return n > 1 && IntStream.range(2, n).boxed().noneMatch(isDivisible);
  }

}
