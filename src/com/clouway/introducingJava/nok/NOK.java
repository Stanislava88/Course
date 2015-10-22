package com.clouway.introducingJava.nok;

/**
 * @author Ivan Kulekov (ivankulekov10@gmail.com)
 * @since Oct 06 , 2015 13:41
 */
public class NOK {


  //a metod for claculate the greatest common divisor
  public int gcd(int x,int y) {
    while (x != y)
      if (x > y) x = x - y;
      else y = y - x;
    return x;
  }
}


