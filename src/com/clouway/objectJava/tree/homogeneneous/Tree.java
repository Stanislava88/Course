package com.clouway.objectJava.tree.homogeneneous;


/**
 * @author Stanislava Kaukova(sisiivanovva@gmail.com)
 */
public class Tree {
  TreeNode root;

  // add new node

  public void addNode(TreeNode node, int value) {
    if (root == null) {
      node = new TreeNode(value);
      root = node;
    }
    if (node.key > value) {
      if (node.left == null) {
        node.left = new TreeNode(value);
      }
      addNode(node.left, value);
    }
    if (node.key < value) {
      if (node.right == null) {
        node.right = new TreeNode(value);
      }
      addNode(node.right, value);
    }

  }

  // method to crawl tree
  public void inOrder(TreeNode node) {
    if (node != null) {
      inOrder(node.left);
      System.out.println(node.key);
      inOrder(node.right);
    }
  }

  public int searchNode(TreeNode node, int value) {
    if (node != null && node.key == value) {
      return value;
    }
    if (node.key > value && node.left != null) {
      return searchNode(node.left, value);
    }
    if (node.key < value && node.left != null) {
      return searchNode(node.right, value);
    } else {
      return 0;
    }

  }
}




