/*
 *  Carlos Miguel Sayao
 *  Main.java
 *
 *  To use main, read the orders along with what store to
 *  go to, the food item(s) to get, and any special requests.
 *  "Complete" orders by answering "y" or "Y" and the list
 *  of orders will be updated to reflect the update.
 *  Main is more of a test file.
 *
 *  In main, we read in a list of orders from an external
 *  text file "text.txt". We invoke the DoublyLinkedList
 *  constructor, ReadFile constructor, open the file,
 *  read the file into the DoublyLinkedList, then close it.
 *  We then display the initial list, then simulate "completing"
 *  orders by receiving input and deleting the matching order.
 *  I display the tail after every delete to show that tail
 *  is at the correct place.
 */

package com.company;
import com.company.List.DoublyLinkedList;
import com.company.Tree.BalancedTree;

import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Main {

    public static void main(String[] args) {

        // Read in list of orders and show deletion
        //*

        System.out.println("\"Uber Eats\"");

        // Create instance of our orders
        DoublyLinkedList d = new DoublyLinkedList();
        // ReadFile class that handles the reading of data
        // from an external file and reads into our classes
        ReadFile f = new ReadFile();
        f.openFile("/src/com/company/",
                    "test.txt");
        f.readOrders(d);
        f.closeFile();

        System.out.println("Our list of orders:");
        d.displayList();

        Scanner input = new Scanner(System.in);
        System.out.println("Let's simulate deleting an order.");
        String response;
        int i;
        do {
            System.out.println("What order number would you like to delete? ");
            i = input.nextInt();
            input.nextLine();

            d.delete(i);

            System.out.println("Resulting list:");
            d.displayList();
            System.out.println("Our tail pointer:");
            d.getTail();

            System.out.println("Again? (Y or N)");
            response = input.nextLine();
        } while(response.toUpperCase().equals("Y") || response.equals(""));
        //*/

        // Sleep for 3 seconds
        /*
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //*/

        // Balanced tree test by manually entering ints
        //*
        BalancedTree b = new BalancedTree();
        Scanner input1 = new Scanner(System.in);
        System.out.println("Tree test.");
        String response1;
        int i1;
        do {
            System.out.println("Enter int to be inserted:");
            i1 = input1.nextInt();
            input1.nextLine();

            b.insert(i1);

            System.out.println("Resulting tree:");
            b.displayTree();

            System.out.println("Again? (Y or N)");
            response1 = input1.nextLine();
        } while(response1.toUpperCase().equals("Y") || response1.equals(""));
        b.inorder();
        //*/

        // Balanced tree for driver proximities to stores (unfinished)
        /*
        BalancedTree t = new BalancedTree();
        ReadFile f = new ReadFile();
        f.openFile("/src/com/company/",
                    "test1.txt");
        f.readStoresAndDrivers(t);
        //*/
    }


}
