package com.groupon.dayToDay.dataStructure;

import com.groupon.dayToDay.models.Company;

public class MyLinkedList {

    Node head; // head of list

    /* Linked list Node*/
    class Node {
        Company data;
        Node next;

        // Constructor to create a new node
        // Next is by default initialized
        // as null
        Node(Company d) { data = d; }
    }





//    Node head;
//
//    class Node {
//        Company data;
//        Node next;
//        Node(int d) {data = d; next = null; }
//    }
//
//    /* function to insert a new_node in a list. */
//    void sortedInsert(Node new_node) {
//        Node current;
//
//        /* Special case for head node */
//        if (head == null || head.data >= new_node.data) {
//            new_node.next = head;
//            head = new_node;
//        }
//        else {
//
//            /* Locate the node before point of insertion. */
//            current = head;
//
//            while (current.next != null &&
//                    current.next.data < new_node.data)
//                current = current.next;
//
//            new_node.next = current.next;
//            current.next = new_node;
//        }
//    }
//
//    // delete by node value
//            public void deleteNodeValue(int value){
//            Node temp = head;
//            Node prev = null;
//
//            if(temp != null && temp.data == value){
//                head = temp.next;
//                return;
//            }
//
//            while(temp != null && temp.data != value){
//                prev = temp;
//                temp = temp.next;
//            }
//
//            if(temp == null) return;
//            prev.next = temp.next;
//        }
//
//
//            // Delete by position V1
//        public void deletePosition(int position){
//            if(head == null){
//                return;
//            }
//
//            Node temp = head;
//            if(position == 0){
//                head = temp.next;
//                return;
//            }
//
//            for(int i=0; temp != null && i<position-1; i++){
//                temp = temp.next;
//            }
//
//            if(temp == null || temp.next == null){
//                return;
//            }
//
//            Node next = temp.next.next;
//            temp.next = next;
//
//        }
//
//
//    /*Utility functions*/
//
//    /* Function to create a node */
//    Node newNode(int data) {
//        Node x = new Node(data);
//        return x;
//    }
//
//    /* Function to print linked list */
//    void printList() {
//        Node temp = head;
//        while (temp != null)
//        {
//            System.out.print(temp.data+" ");
//            temp = temp.next;
//        }
//    }


}

