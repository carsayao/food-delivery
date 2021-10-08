package com.company.Tree;

public class BalancedTree extends BinaryTree {

    public int balance;

    public BalancedTree() {
        this.root = null;
        this.balance = 0;
    }

    // Insert wrapper function
    public void insert(int num) {
        this.root = insert(root, num);
    }

    // Insert and balance recursive function
    private Node insert(Node c, int num) {
        // Create new node
        if (c == null) {
            c = new Node(num);
            return c;
        }
        // Compare node data, if passed in data < this data,
        // go left. Else, go right.
        if (c.compare(num) == false)
            c.setLeft(insert(c.getLeft(), num));
        else
            c.setRight(insert(c.getRight(), num));
        c.setHeight(max(c.getLeftHeight(),
                c.getRightHeight()) +1);
        this.balance = c.getBalance();
        // Left left, then return rotated subtree
        if (this.balance > 1 && num < c.getLeft().getInt())
            return c.rotateRight();
        // Right right
        if (this.balance <  -1 && num > c.getRight().getInt())
            return c.rotateLeft();
        // Left right, rotate left with left node as pivot,
        // then rotate right with current as pivot
        if (this.balance > 1 && num > c.getLeft().getInt()) {
            c.setLeft(c.getLeft().rotateLeft());
            return c.rotateRight();
        }
        // Right left
        if (this.balance < -1 && num < c.getRight().getInt()) {
            c.setRight(c.getRight().rotateRight());
            return c.rotateLeft();
        }
        // Return current to last function call to connect tree
        return c;
    }

    // Return max int
    public int max(int a, int b) {
        if (a > b)
            return a;
        else
            return b;
    }

    // Call to displayTree
    public void displayTree() {
        if (root != null)
            displayTree(root, 0);
    }

}
