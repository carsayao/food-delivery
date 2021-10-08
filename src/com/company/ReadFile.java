/**
 *  Carlos Miguel Sayao
 *  Readfile.java
 *
 *  ReadFile will handle all our file reading methods.
 *  The structure of the text file is the following:
 *      - int: number of orders to be read into the DLL
 *      - String: name of a store
 *      - String: name of the food
 *      - int: number of requests attached to the order
 *      - String: requests
 */

package com.company;
import com.company.List.DoublyLinkedList;
import com.company.List.LinkedList;
import com.company.Tree.BalancedTree;

import java.io.*;
import java.util.Scanner;

public class ReadFile {

    // Use Scanner to read from file
    protected Scanner input;
    protected String path;
    protected String fileName;

    // Set Scanner to open, handle errors
    public void openFile(String p, String f) {
        this.path = p;
        this.fileName = f;

        // Handle FileNotFoundException
        try {
            this.input = new Scanner(new File(path + fileName));
        }
        catch(FileNotFoundException exception) {
            System.out.println(
                    "Unable to open file '" +
                            fileName + "'");
        }
    }

    // Close file
    public void closeFile() {
        this.input.close();
    }

    // As long as there are Strings to read in, loop.
    // Build the DoublyLinkedList in the argument.
    public void readOrders(DoublyLinkedList d) {
        // Keep track of number
        int i;
        // Number of orders
        int j = this.input.nextInt();
        // Keep track of request number (k)
        // Number of requests (l)
        int k, l;
        // Ignore newline
        this.input.nextLine();
        while(this.input.hasNext()) {

            // Read in food orders
            for (i = 0; i < j; ++i) {
                String s1 = this.input.nextLine();
                String s2 = this.input.nextLine();
                l = this.input.nextInt();
                this.input.nextLine();
                LinkedList list = new LinkedList();

                // Read in requests specific to the order
                for (k = 0; k < l; ++k) {
                    String s3 = this.input.nextLine();
                    list.append(s3);
                }

                d.append(s1, s2, list);
            }
        }
    }

    // Read in stores and drivers
    public void readStoresAndDrivers(BalancedTree t) {
        // Keep track of store number
        int i;
        // Number of stores
        int j = this.input.nextInt();
        // Keep track of driver number (k)
        // Number of drivers (l)
        int k, l;
        // Ignore newline
        this.input.nextLine();
        while(this.input.hasNext()) {
            // Read in stores
            for (i = 0; i < j; ++i) {
                String s1 = this.input.nextLine();
            }
        }
    }

}
