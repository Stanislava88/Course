package com.clouway.introducingJava.sort;

import java.util.Arrays;

/**
 * @author Ivan Kulekov (ivankulekov10@gmail.com)
 * @since Oct 07 , 2015 11:29
 */
public class DemoQuick {
  public static void main(String[] args) {
    //declare masiv
    int[] array = {2, 5, 3, 8, 6, 9};
    System.out.print("The array element before sort:");
    System.out.println(Arrays.toString(array));
    QuickSort sort = new QuickSort(array);
    System.out.print("The array elements after sort are:");
    sort.sort();
    System.out.println(Arrays.toString(array));
  }
}
