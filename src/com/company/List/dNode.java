/**
 *  Carlos Miguel Sayao
 *  dNode.java
 *
 *  Node to hold Food instances. DoublyLinkedList
 *  manages these nodes.
 */

package com.company.List;
import com.company.Food;

public class dNode {

    protected Food food;
    protected dNode next;
    protected dNode prev;

    // Constructor passing in two Strings,
    // a Store Name and a Food Name.
    public dNode(String storeIn, String foodIn) {
        this.food = new Food(storeIn, foodIn);
        this.next = null;
        this.prev = null;
    }

    // Constructor passing in two Strings a Store Name
    // and a Food Name, and a LinkedList
    public dNode(String storeIn, String foodIn,
                 LinkedList listIn) {
        this.food = new Food(storeIn, foodIn, listIn);
        this.next = null;
        this.prev = null;
    }

    // Set next
    public void setNext(dNode next) {
        this.next = next;
    }

    // Set previous
    public void setPrev(dNode prev) {
        this.prev = prev;
    }

    // Get next
    public dNode getNext(){
        return this.next;
    }

    // Get previous
    public dNode getPrev() {
        return this.prev;
    }

    // Compare Food ID
    public boolean compareID(int i) {
        return this.food.compareID(i);
    }

    // Set our reference to null
    public void delete() {
        this.food = null;
    }
}