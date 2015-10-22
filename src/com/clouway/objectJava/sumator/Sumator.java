package com.clouway.objectJava.sumator;

import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * @author Stanislava Kaukova(sisiivanovva@gmail.com)
 */
public class Sumator {


  public int sum(int a, int b) {
    int sum = a + b;
    return sum;
  }

  public double sum(double c, double d) {
    double sum1 = c + d;
    return sum1;
  }

  public String sum(String a, String b) {
    String sum2 = a + b;
    return sum2;
  }

  public BigInteger sum(BigInteger a, BigInteger b) {
    BigInteger sum = a;
    sum = sum.add(b);

    return sum;
  }

  public BigDecimal sum(BigDecimal a, BigDecimal b) {
    BigDecimal sum = a;
    sum = sum.add(b);
    return sum;
  }
}


