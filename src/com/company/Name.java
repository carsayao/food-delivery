/**
 *  Carlos Miguel Sayao
 *  Name.java
 *
 *  Name class that manages a string. Name handles the String.
 *  This class was made with BSTs in mind.
 */

package com.company;
import java.util.Scanner;

public class Name {

    // Declare Scanner, set null
    protected Scanner input = null;
    // Declare aName, set null
    protected String aName = null;

    // Constructor initializing a new String
    public Name() {
        this.aName = null;
    }

    // Constructor setting aName to s
    public Name(String s){
        aName = new String(s);
    }

    // setName reads in a name
    public void setName() {
        input = new Scanner(System.in);
        this.aName = input.nextLine();
    }

    // Return aName
    public String getName(){
        return this.aName;
    }

    // Display the name
    public void display(){
        System.out.println(this.aName);
    }

    /* String compare:
     * s1 == s2: 0
     * s1 > s2: positive
     * s1 < s2: negative
     */
    public int compare(Name s){
        return this.aName.compareTo(s.aName);
    }

}