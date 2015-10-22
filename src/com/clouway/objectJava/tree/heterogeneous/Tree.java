package com.clouway.objectJava.tree.heterogeneous;


/**
 * @author Stanislava Kaukova(sisiivanovva@gmail.com)
 */
public class Tree {
  public Node root;
public void addNode(Node node, int key, Object obj) {
  if (root == null) {
    node = new Node(key,obj);
    root = node;
  }
  if (node.key > key) {
    if (node.left == null) {
      node.left = new Node(key,obj);
    }
    addNode(node.left, key,obj);
  }
  if (node.key < key) {
    if (node.right == null) {
      node.right = new Node(key,obj);
    }
    addNode(node.right, key,obj);
  }

}
  public void inOrder(Node node) {
    if (node != null) {
      inOrder(node.left);
      System.out.println("The key is:" +node.key);
      System.out.println("The object is:"+node.obj);
      inOrder(node.right);
    }
  }
}
