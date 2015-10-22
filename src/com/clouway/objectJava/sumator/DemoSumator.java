package com.clouway.objectJava.sumator;

import java.math.BigDecimal;
import java.math.BigInteger;

/**
 * @author Stanislava Kaukova(sisiivanovva@gmail.com)
 */
public class DemoSumator {
  public static void main(String[] args) {
    Sumator suma = new Sumator();
    BigInteger s1 = new BigInteger("124456");
    BigInteger s2 = new BigInteger("6789");
    BigDecimal a1 = new BigDecimal(123456789);
    BigDecimal a2 = new BigDecimal(987456);

    System.out.println("sum of Integer number is:" + suma.sum(4, 5));
    System.out.println("sum of Double number is:" + suma.sum(4.5, 3.8));
    System.out.println("sum of String is:" + suma.sum("456", "789"));
    System.out.println("sum of BigInteger is:" + suma.sum(s1, s2));
    System.out.println("sum of BigDecimal number is:" + suma.sum(a1, a2));


  }
}


