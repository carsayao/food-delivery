package com.company.Tree;
import com.company.Store;
import com.company.Driver;

public class Node {

    protected double d;
    protected int height;
    protected Store store;
    protected Driver driver;
    protected Node left;
    protected Node right;

    // Double (driver proximity)
    public Node(double d) {
        this.d = d;
        this.height = 1;
        this.store = null;
        this.driver = null;
        this.left = null;
        this.right = null;
    }

    // Constructor passing in a store name
    public Node(String storeIn) {
        this.d = 0;
        this.height = 1;
        this.store = new Store(storeIn);
        this.driver = null;
        this.left = null;
        this.right = null;
    }

    // Constructor passing in a store instance
    public Node(Store storeIn) {
        this.store = new Store(storeIn);
    }

    // Set height
    public void setHeight(int h) {
        this.height = h;
    }

    // Get height
    public int getHeight() {
        if (this == null)
            return 0;
        else
            return this.height;
            //return getHeight(this);
    }

    // Get height of left subtree
    public int getLeftHeight() {
        if (this.getLeft() == null)
            return 0;
        else
            return this.getLeft().getHeight();
    }

    // Get height of right subtree
    public int getRightHeight() {
        if (this.getRight() == null)
            return 0;
        else
            return this.getRight().getHeight();
    }

    // Get balance, height of left subtree - height of right subtree
    public int getBalance() {
        if (this == null)
            return 0;
        return (this.getLeftHeight() -
                this.getRightHeight());
    }

    // Set int
    public void set(double d) {
        this.d = d;
    }

    // Set left
    public void setLeft(Node left) {
        this.left = left;
    }

    // Set right
    public void setRight(Node right) {
        this.right = right;
    }

    // Get left
    public Node getLeft() {
        return this.left;
    }

    // Get right
    public Node getRight() {
        return this.right;
    }

    /*
     *  Rotate left
     *  In a diagram:
     *      a                       b
     *        \                   /   \
     *         b    becomes..    a     c
     *          \
     *           c
     */
    public Node rotateLeft() {
        Node b = this.getRight();
        Node a = this;
        a.setRight(b.getLeft());
        b.setLeft(a);
        a.setHeight(max(a.getLeftHeight(),
                        a.getRightHeight()) +1);
        b.setHeight(max(b.getLeftHeight(),
                        b.getRightHeight()) +1);
        return b;
    }

    /*
     *  Rotate right
     *  In a diagram:
     *        c                     b
     *       /                    /   \
     *      b       becomes...   a     d
     *     /
     *    a
     */
    public Node rotateRight() {
        Node b = this.getLeft();
        Node c = this;
        c.setLeft(b.getRight());
        b.setRight(c);
        b.setHeight(max(b.getLeftHeight(),
                        b.getRightHeight()) +1);
        c.setHeight(max(c.getLeftHeight(),
                        c.getRightHeight()) +1);
        return b;
    }

    // Return max int
    public int max(int a, int b) {
        if (a > b)
            return a;
        else
            return b;
    }

    // Compare max int. Return true if this.i >= i
    public boolean compare(double d) {
        if (d > this.d || d == this.d)
            return true;
        else
            return false;
    }

    // Display node contents
    public void display() {
        System.out.println(d);
    }

    //*
    // Return this.i
    public double getInt() {
        return this.d;
    }
    //*/

    // Return driver data
    public double getData() {
        return this.driver.getProximity();
    }
}

