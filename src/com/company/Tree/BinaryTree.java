package com.company.Tree;

public class BinaryTree {

    protected Node root;

    public BinaryTree() {
        this.root = null;
    }

    public void copyTree() {
        if (this.root != null)
            this.root = copyTree(this.root);
    }

    // Display data in sorted order
    public void inorder() {
        if (this.root != null) {
            inorder(this.root);
        }
    }

    // Recursive sorted order display
    public void inorder(Node current) {
        if (current == null)
            return;
        inorder(current.getLeft());
        current.display();
        inorder(current.getRight());
    }    // Call to displayTree
    public void displayTree() {
        if (root != null)
            displayTree(root, 0);
    }

    // Displays tree like an actual tree
    public void displayTree(Node c, int indent) {
        int i;
        if (c != null) {
            if (c.getRight() != null)
                displayTree(c.getRight(), indent + 1);
            if (indent > 0) {
                for (i = 0; i < indent; ++i)
                    System.out.print("\t");
                System.out.print(" ");
            }
            if (c.getRight() != null) {
                System.out.println(" /");
                for (i = 0; i < indent; ++i) {
                    System.out.print("\t");
                }
                System.out.print(" ");
            }
            System.out.println(c.getInt());
            if (c.getLeft() != null) {
                for (i = 0; i < indent; ++i) {
                    System.out.print("\t");
                }
                System.out.print(" ");
                System.out.print(" \\\n");
                displayTree(c.getLeft(), indent + 1);
            }
        }
    }
}
