package com.clouway.introducingJava.generator;

/**
 * Generate the string with adjustable length
 * @author Stanislava Kaukova(sisiivanovva@gmail.com)
 */
public class DemoStringGenerator {
  //Declare the method 'main'
  public static void main(String[] args) {
    //declare and create a string object
    StringGenerator str=new StringGenerator();
    //print the result on the console
    System.out.println("The string is:"+ str.generate(7, '0', 'z'));
  }
}
