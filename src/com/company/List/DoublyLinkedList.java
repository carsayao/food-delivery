/**
 *  Carlos Miguel Sayao
 *  DoublyLinkedList.java
 *
 *  DoublyLinkedList manages our orders.
 */
package com.company.List;

public class DoublyLinkedList extends GenericList {

    protected dNode head;
    protected dNode tail;

    // Constructor
    public DoublyLinkedList() {
        this.head = null;
        this.tail = null;
    }

    // Append function wrapper to include a LinkedList
    public void append(String storeIn, String foodIn,
                       LinkedList listIn) {
        this.head = append(head, storeIn, foodIn, listIn);
    }

    // Append function for the added LinkedList
    private dNode append(dNode head, String storeIn, String foodIn,
                         LinkedList listIn) {
        if (head == null) {
            head = new dNode(storeIn, foodIn, listIn);
            tail = head;
            return head;
        }
        head.setNext(append(head.getNext(), storeIn, foodIn,
                listIn));
        head.getNext().setPrev(head);
        return head;
    }

    // Recursive displayList() function wrapper
    public void displayList() {
        if (this.head == null) {
            System.out.println("List is empty!");
            return;
        }
        displayList(head);
    }

    // Recursive display function
    private void displayList(dNode current) {
        if (current == null)
            return;
        current.food.display();
        displayList(current.getNext());
    }

    // Method to make sure tail is at the correct place
    public void getTail() {
        if (this.head == null) {
            System.out.println("No list, therefore no tail to display.");
            return;
        }
        System.out.println("Tail:");
        tail.food.display();
    }

    // Delete a dNode that has the matching Food ID
    public void delete(int matchID) {
        if (this.head == null) {
            System.out.println("Nothing to delete!");
            return;
        }
        this.head = delete(head, matchID);
    }

    // Recursive delete
    private dNode delete(dNode current, int matchID) {
        if (current == null) {
            System.out.println("Match not found!\n");
            return current;
        }
        if (current.compareID(matchID)) {
            // One node in list
            if (current.getPrev() == null && current.getNext() == null) {
                this.tail = null;
                current.delete();
                return null;
            }
            // Beginning of list
            if (current.getPrev() == null) {
                current = current.getNext();
                current.getPrev().delete();
                current.setPrev(null);
                return current;
            }
            //End of list
            if (current.getNext() == null) {
                this.tail = current.getPrev();
                current.delete();
                return null;
            }
            // Middle of list
            if (current.getNext() != null && current.getPrev() != null) {
                dNode temp = current;
                current.getNext().setPrev(current.getPrev());
                current = current.getNext();
                temp.delete();
                return current;
            }
        }
        current.setNext(delete(current.getNext(), matchID));
        return current;
    }

}
