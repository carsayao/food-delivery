/**
 *  Carlos Miguel Sayao
 *  Request.java
 *
 *  A Request is a special instruction particular to
 *  the order of a customer. The description of the
 *  request is held in a String, "desc". This class
 *  is held in a LinkedList node, "lNode".
 */

package com.company;

public class Request {

    // A description of the request, "desc" for short
    protected String desc;

    // Constructor
    public Request() {
        desc = null;
    }

    // Constructor for String
    public Request(String desc) {
        this.desc = desc;
    }

    // Get request
    public String getRequest() {
        return this.desc;
    }

    // Display desc
    public void display() {
        System.out.println(desc);
    }

}
