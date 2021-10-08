/**
 *  Carlos Miguel Sayao
 *  CS202
 *  Program 4
 *  Food.java
 *
 *  Food class that holds a Name, ID number, and LinkedList.
 *  Name is the name of the food. ID number is created with
 *  a static int. Whenever a new instance of Food is created,
 *  "COUNT" is incremented. This COUNT is assigned to every
 *  new instance of Food as to have a unique ID number. The
 *  LinkedList holds the requests associated with the order.
 */

package com.company;

import com.company.List.LinkedList;

public class Food extends Store {

    // Food order int to keep track of ID
    protected static int COUNT;
    // Individual Food order int
    protected int ID;
    // Food's name set to null
    protected Name foodName;
    // The list of specific orders
    protected LinkedList requests;

    // Food constructors
    /*
     * NOTE: If you write a constructor with args
     * then the default constructor is not provided
     * automatically and you cannot create objects
     * without args specified.
     */

    // Constructor that invokes base class and foodName
    public Food() {
        super();
        this.foodName = null;
        this.requests = null;
    }

    // Copy constructor
    public Food(Food foodIn){
        this.foodName = foodIn.foodName;
    }

    // Constructor with args to initialize foodName
    public Food(String foodIn){
        super();
        this.foodName = new Name(foodIn);
    }

    // Constructor with more args to initialize
    // foodName and super (Store name)
    public Food(String storeIn, String foodIn) {
        super(storeIn);
        this.foodName = new Name(foodIn);
        this.requests = null;
    }

    // Constructor with more args to initialize foodName,
    // requests, super (Store name), and set ID
    public Food(String storeIn, String foodIn,
                LinkedList listIn) {
        super(storeIn);
        ++COUNT;
        this.ID = COUNT;
        this.foodName = new Name(foodIn);
        this.requests = new LinkedList(listIn);
    }

    // Set foodName (name of food)
    public void setName(){
        System.out.println("Enter name of food:");
        this.foodName.setName();
    }

    // Add requests to list
    public void addRequest(String requestIn) {
        this.requests.append(requestIn);
    }

    // Return food name
    public String getName(){
        return this.foodName.getName();
    }

    // Display all members and Store name
    public void display(){
        super.display();
        System.out.println("Order " + ID);
        System.out.print("Food:\t");
        this.foodName.display();
        this.requests.displayList();
        System.out.println();
    }

    // Return true if ID match
    public boolean compareID(int i) {
        if (this.ID == i)
            return true;
        return false;
    }

}