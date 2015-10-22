package com.clouway.introducingJava.nod_nok;

/**
 * Calculate the most common devisor
 *
 * @author Stanislava Kaukova(sisiivanovva@gmail.com)
 * @return the most common devosor of the number
 * @since Oct 05 , 2015 15:11
 */
public class DemoNodNok {
  public static void main(String[] args) {
    int x=6;
    int y=8;
    NOD nod = new NOD();
    System.out.println("NOD is:" + nod.gcd(x,y));
    System.out.println("NOK is:"+(x*y/nod.gcd(x,y)));
  }

}


