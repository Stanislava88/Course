package com.clouway.introducingJava.array;

import java.util.Arrays;

/**
2 * @author Ivan Kulekov (ivankulekov10@gmail.com)
 * @since Oct 06 , 2015 14:03
 */
public class Demo {
  public static void main(String[] args) {
    int[] arr = new int[] {2,3,8,9};
    Arr array = new Arr();
    System.out.println("Minimal element is:" + array.getMinElement(arr));
    System.out.println("sum is:" + array.getSum(arr));
    // Print the elements from masiv on the console
    System.out.print("Elements are:");
    System.out.println(Arrays.toString(arr));
  }
}

