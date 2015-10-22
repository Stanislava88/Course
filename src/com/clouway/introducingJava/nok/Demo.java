package com.clouway.introducingJava.nok;


public class Demo {
  public static void main(String[] args) {
    int x=6;
    int y=9;
    NOK nok = new NOK();
    System.out.println("NOK is:" + (x * y) / nok.gcd(x,y));
  }
}



