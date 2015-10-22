package com.clouway.introducingJava.reverse;

/**
 * @author Stanislava Kaukova(sisiivanovva@gmail.com)
 */
public class arrReverse {
  public void reverse(int[] arr, int[] rev) {
    int length = arr.length;
    for (int i = 0; i < arr.length; i++)
      rev[length - 1 - i] = arr[i];
  }
}

