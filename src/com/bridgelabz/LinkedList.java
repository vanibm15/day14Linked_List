package com.bridgelabz;

public class LinkedList<T> {
    Node<T> head;
    Node<T> tail;

    public void add(T data) {
        Node<T> obj2 = new Node<>(data);
        if (head == null) {
            head = obj2;
            tail = obj2;
        } else {
            tail.next = obj2;
            tail = obj2 ;
        }
    }
    public void insertBetween(T insertData){
        Node<T> obj2=new Node<>(insertData);
        head.next=obj2;
        obj2.next=tail;
    }

    public void print() {
        Node<T> temp = head;
        while (temp != null) {
            System.out.print(temp.data + "=>");
            temp = temp.next;
        }
    }


}