/**
 *  Carlos Miguel Sayao
 *  lNode.java
 *
 *  This node holds the data for a request. LinkedList
 *  manages the nodes. Wrapper functions are written
 *  to support the data types.
 */

package com.company.List;
import com.company.Request;

public class lNode {

    protected Request request;
    protected lNode next;

    // Constructor passing in a String
    public lNode(String requestIn) {
        this.request = new Request(requestIn);
        this.next = null;
    }

    // Set next
    public void setNext(lNode next) {
        this.next = next;
    }

    // Get next
    public lNode getNext() {
        return this.next;
    }

    // Get data
    public String getData() {
        return request.getRequest();
    }

}
