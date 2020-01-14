package com.company;

public class Main {

    public static void main(String[] args) {
        LinkedList list = new LinkedList();

        list = list.add(list, "Ivan");
        list = list.add(list, "Kiro");
        list = list.add(list, "Gosho");
        list = list.add(list, "Genadi");

        LinkedList.printList(list);
    }
}
