/**
 *  Carlos Miguel Sayao
 *  LinkedList.java
 *
 *  The LinkedList manages lNodes which hold requests.
 */

package com.company.List;

public class LinkedList extends GenericList {

    protected lNode head;

    // Constructor
    public LinkedList() {
        this.head = null;
    }

    // Copy constructor
    public LinkedList(LinkedList source) {
        copy(source);
    }

    // Copy wrapper function
    public void copy(LinkedList listIn) {
        if (listIn.head != null)
            this.head = copy(listIn.head);
    }

    // Recursive copy call
    private lNode copy(lNode source) {
        if (source == null)
            return null;
        lNode dest = new lNode(source.getData());
        dest.setNext(copy(source.getNext()));
        return dest;
    }

    // Append function wrapper
    public void append(String requestIn) {
        this.head = append(head, requestIn);
    }

    // Recursive append function (add at end)
    public lNode append(lNode head, String requestIn) {
        if (head == null) {
            head = new lNode(requestIn);
            return head;
        }
        head.setNext(append(head.getNext(), requestIn));
        return head;
    }

    // Display function wrapper
    public void displayList() {
        if (this.head == null) {
            System.out.println("No requests for this order.");
            return;
        }
        System.out.println("Requests for this order: ");
        int i = 0;
        displayList(head, i);
    }

    // Recursive display function
    public void displayList(lNode head, int i) {
        if (head == null)
            return;
        ++i;
        System.out.print("Request " + i + ": ");
        head.request.display();
        displayList(head.getNext(), i);
    }

}
