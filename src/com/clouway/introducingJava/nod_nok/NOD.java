package com.clouway.introducingJava.nod_nok;

/**
 * @author Ivan Kulekov (ivankulekov10@gmail.com)
 * @since Oct 06 , 2015 13:13
 */
public class NOD {
  //method gcd calculate the greatest common devisor
  public int gcd(int x, int y) {
    // cycle while/ while x is different than y
    while (x != y)
      if (x > y) x = x - y;
      else y = y - x;
    return x;
  }
}
