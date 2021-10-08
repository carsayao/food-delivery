/**
 *  Carlos Miguel Sayao
 *  Store.java
 *
 *  Store class that holds a name. Every Food comes from
 *  a store so it makes sense to have this class.
 */

package com.company;
import java.io.*;
import java.util.Scanner;

public class Store {

    // Declare Scanner, set null
    protected Scanner input = null;

    // Declare a Name
    protected Name myName = null;

    // Constructor prompting input
    public Store(){
        System.out.println("Enter store name:");
        this.myName = new Name();
    }

    // Constructor with String arg to set myName
    public Store(String s) {
        this.myName = new Name(s);
    }

    // Copy constructor
    public Store(Store s){
        this.myName = new Name(s.getName());
    }

    // Set store name
    public void setName(){
        input = new Scanner(System.in);
        System.out.println("Enter store name:");
        this.myName.setName();
    }

    // Return name
    public String getName(){
        return this.myName.getName();
    }

    // Call our Name display member function
    public void display(){
        System.out.print("Store:\t");
        this.myName.display();
    }

    /* Compare Store names
     * s1==s2, equal
     * s1>s2, positive
     * s1<s2, negative
     */
    public int compare(Store s){
        return this.myName.compare(s.myName);
    }
}
