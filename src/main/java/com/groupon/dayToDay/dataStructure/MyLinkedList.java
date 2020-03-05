package com.groupon.dayToDay.dataStructure;

import com.groupon.dayToDay.models.Company;

class Node {

    Company data;
    Node next, prev;
}

public class MyLinkedList {

    Node head;

    // function to create and return a new node
    // of a doubly linked list
    static Node getNode(Company data) {

        // allocate node
        Node newNode = new Node();

        // put in the data
        newNode.data = data;
        newNode.prev = newNode.next = null;
        return newNode;

    }

    // function to insert a new node in sorted way in
    // a sorted doubly linked list
    static Node sortedInsert(Node head, Node newNode) {
        Node current;

        // if list is empty
        if (head == null)
            head = newNode;

            // if the node is to be inserted at the beginning
            // of the doubly linked list
        else if (head.data.compareTo(newNode.data) > 0) {

            newNode.next = head;
            newNode.next.prev = newNode;
            head = newNode;
        }
        else
        {
            current = head;

            // locate the node after which the new node
            // is to be inserted
            while (current.next != null &&
                    current.next.data.compareTo(newNode.data) < 0)
                current = current.next;

            /* Make the appropriate links */
            newNode.next = current.next;

            // if the new node is not inserted
            // at the end of the list
            if (current.next != null)
                newNode.next.prev = newNode;

            current.next = newNode;
            newNode.prev = current;

        }
        return head;
    }

    public static void deleteCompany(Node head, String deleteCompany){

        while(head != null){

            if(head.data.equals(deleteCompany)){

                if(head.prev != null){
                    head.prev.next = head.next;
                }

                if(head.next != null){
                    head.next.prev = head.prev;
                }
                return;
            }
            head = head.next;

        }
    }

    public static void updateCompany(Node head, String nameCompany, Company newName){

        deleteCompany(head, nameCompany);
        sortedInsert(head, getNode(newName));

    }

    // function to print the doubly linked list
    static void printList(Node head) {
        while (head != null)
        {
            System.out.print(head.data + " ");
            head = head.next;
        }
    }


//    // Driver code
//    public static void main(String args[])
//    {
//        /* start with the empty doubly linked list */
//        Node head = null;
//
//        // insert the following nodes in sorted way
//        Node new_node = getNode("Health");
//        head = sortedInsert(head, new_node);
//        new_node = getNode("Groupon");
//        head = sortedInsert(head, new_node);
//        new_node = getNode("Wellness");
//        head = sortedInsert(head, new_node);
//        new_node = getNode("Yago");
//        head = sortedInsert(head, new_node);
//        new_node = getNode("Fintess");
//        head = sortedInsert(head, new_node);
//        new_node = getNode("Almas");
//        head = sortedInsert(head, new_node);
//
//        deleteCompany(head, "Fintess");
//
//        updateCompany(head, "Health","Apple");
//
//        System.out.println("Created Doubly Linked List");
//        printList(head);
//    }
}
