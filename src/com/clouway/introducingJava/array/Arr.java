package com.clouway.introducingJava.array;

/**
 * @author Stanislava Kaukova (sisiivanovva@gmail.com)
 * @since Oct 06 , 2015 10:25
 */
public class Arr {
  //the method return minimal element from masiv
  public int getMinElement(int[] arr) {
    // declare variables min
    int min;
    min = arr[0];
    for (int i = 0; i <arr.length; i++)
      //compares minimal element with 'i'element
      if (min > arr[i]) min = arr[i];
    //return minimal element
    return min;
  }
//  the method return sum
  public int getSum(int [] arr) {
    int Sum;
    Sum=0;
    for (int i = 0; i < arr.length; i++) {
      Sum=Sum+arr[i];
    }
    return Sum;
  }
}



