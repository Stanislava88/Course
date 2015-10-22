package com.clouway.objectJava.tree.heterogeneous;


/**
 * @author Stanislava Kaukova(sisiivanovva@gmail.com)
 */
public class DemoTree {
  public static void main(String[] args) {
    Tree tree = new Tree();
    Cat myCat = new Cat("Sisi");
    Dog myDog = new Dog("Lassie", 2);
    Person person = new Person("Maria");
    Double double1 = new Double(2.8);
    Integer integer=new Integer(5);
    tree.addNode(tree.root, 12, myCat.getName());
    tree.addNode(tree.root, 16, myCat.getName());
    tree.addNode(tree.root, 20, myDog.getName() + myDog.getAge());
    tree.addNode(tree.root, 10, myCat.getName());
    tree.addNode(tree.root, 40, double1.doubleValue());
    tree.addNode(tree.root, 17, person.getName());
    tree.addNode(tree.root,50,integer.intValue());
    tree.inOrder(tree.root);
  }
}

