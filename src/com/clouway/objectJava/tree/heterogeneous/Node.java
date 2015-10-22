package com.clouway.objectJava.tree.heterogeneous;

/**
 * @author Stanislava Kaukova(sisiivanovva@gmail.com)
 */
public class Node {
  int key;
  Node left;
  Node right;
  Object obj;
  public Node(int key,Object obj){
    this.key=key;
    this.obj=obj;
  }
}
