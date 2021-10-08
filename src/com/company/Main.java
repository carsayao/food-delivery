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
 *  We then display the intial list, then simulate "completing"
 *  orders by receiving input and deleting the matching order.
 *  I display the tail after every delete to show that tail
 *  is at the correct place.
 */

package com.company;
import com.company.List.DoublyLinkedList;
import com.company.Tree.BalancedTree;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        /*

        System.out.println("\"Uber Eats\"");

        // Create instance of our orders
        DoublyLinkedList d = new DoublyLinkedList();
        // ReadFile class that handles the reading of data
        // from an external file and reads into our classes
        ReadFile f = new ReadFile();
        f.openFile("/Program4/src/com/company/test.txt",
                    "test.txt");
        f.readFile(d);
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
        } while(response.toUpperCase().equals("Y"));
        //*/

        /*
        BalancedTree b = new BalancedTree();
        Scanner input = new Scanner(System.in);
        System.out.println("Tree test.");
        String response;
        int i;
        do {
            System.out.println("Enter int to be inserted:");
            i = input.nextInt();
            input.nextLine();

            b.insert(i);

            System.out.println("Resulting tree:");
            b.displayTree();

            System.out.println("Again? (Y or N)");
            response = input.nextLine();
        } while(response.toUpperCase().equals("Y"));
        b.inorder();
        //*/

        BalancedTree t = new BalancedTree();
        ReadFile f = new ReadFile();
        f.openFile("/Program4/src/com/company/",
                    "test1.txt");
        f.readStoresAndDrivers(t);
    }


}
