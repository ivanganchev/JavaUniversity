package com.company;



public class LinkedList {
    Node head;

    public LinkedList(){

    }

    public LinkedList add(LinkedList list, String item){
        Node newNode = new Node(item);
        newNode.next = null;

        if(list.head == null){
            list.head = newNode;
        }else{
            Node last = list.head;
            while(last.next != null){
                last = last.next;
            }

            last.next = newNode;
        }
        return list;
    }

    public static void printList(LinkedList list)
    {
        Node currNode = list.head;

        System.out.print("LinkedList: ");

        while (currNode != null) {
            System.out.print(currNode.data + " ");
            currNode = currNode.next;
        }

    }
}
