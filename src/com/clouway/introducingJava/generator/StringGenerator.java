package com.clouway.introducingJava.generator;


/**
 * @author Stanislava Kaukova(sisiivanovva@gmail.com)
 */

public class StringGenerator {
  //Declare the method stringGenerator
  public String generate(int length, char first, char last) {
    //create a new StringBuilder
    StringBuilder str = new StringBuilder(length);
    for (int i = 0; i < length; i++) {
      //declare random string
      int randomGenerator = (int) ((last - first) * Math.random() + first);
      //explicit transformation from int to char on variable randomGenerator
      char c = (char) randomGenerator;
      str.append(new Character(c).toString());
    }
    return str.toString();
  }
}






