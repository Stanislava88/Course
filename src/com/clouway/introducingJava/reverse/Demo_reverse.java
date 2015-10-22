package com.clouway.introducingJava.reverse;

import java.util.Arrays;

/**
 * @author Stanislava Kaukova(sisiivanovva@gmail.com)
 */
public class Demo_reverse {
  public static void main(String[] args) {
    int[] arr = {2, 8, 3, 6, 9, 4};
    int[] rev = new int[6];
    System.out.println("The array elements before reverse are:");
    System.out.println(Arrays.toString(arr));
    arrReverse arrRev = new arrReverse();
    System.out.println("The array elements after reverse are:");
    arrRev.reverse(arr, rev);
    System.out.println(Arrays.toString(rev));
  }
}
