package com.clouway.introducingJava.sort;

import java.util.Arrays;

/**
 * @author Ivan Kulekov (ivankulekov10@gmail.com)
 * @since Oct 07 , 2015 11:30
 */
public class QuickSort {
  public int[] array;

  //create constructor
  public QuickSort(int[] array) {
    this.array = array;
  }

  private void quickSort(int[] array, int left, int right) {
    int i = left;
    int p = right;
    int temp;
    int pivot = array[(left + right) / 2];
    while (i <= p) {
      while (array[i] < pivot) {
        i++;
      }
      while (array[p] > pivot) {
        p--;
      }
      if (i <= p) {
        temp = array[i];
        array[i] = array[p];
        array[p] = temp;
        i++;
        p--;

      }
    }
  }

  public void sort() {
    int left = 0;//first element
    int right = array.length - 1; //last element
    //calls the method quickSort
    quickSort(array, left, right);
  }
}


