package com.clouway.objectJava.tree.homogeneneous;

/**
 * @author Stanislava Kaukova(sisiivanovva@gmail.com)
 */
public class DemoTree {
  public static void main(String[] args) {
    // create object
    Tree tree = new Tree();
    tree.addNode(tree.root, 50);
    tree.addNode(tree.root, 12);
    tree.addNode(tree.root, 16);
    tree.addNode(tree.root, 60);
    tree.addNode(tree.root, 6);
    System.out.println("The tree in inOrder:");
    tree.inOrder(tree.root);
    System.out.print(tree.searchNode(tree.root, 60) + " ");
    System.out.print("is search key");

  }
}
