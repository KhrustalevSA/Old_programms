package com.company;

class Leaf{
    Object arr[] = new Object[5];
    Object value;
    Leaf(){

    }
}

class Tree{
    private Leaf root;
    private Leaf choice_way;

    public void add(Object parent, Object obj) {
        Leaf new_leaf = new Leaf();
        if (root == null) {
            root.arr[0] = new_leaf;
        }

    }
}

public class Main {

    public static void main(String[] args) {
        Leaf le = new Leaf();
        Tree tr = new Tree();
        tr.add(tr,le);
        System.out.println("1");
    }
}
