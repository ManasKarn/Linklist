package Linklist;

import java.util.Scanner;

class LL {
    Node head;
    private int size;

    class Node {
        String Data;
        Node next;

        public Node(String data) {
            this.Data = data;
            this.next = null;
            size++;
        }
    }

    public LL() {
        size = 0;
    }

    public void addfirst(String data) {
        Node newnode = new Node(data);
        if (head == null) {
            head = newnode;
            return;
        }
        newnode.next = head;
        head = newnode;
    }

    public void addlast(String data) {
        Node newnode = new Node(data);
        if (head == null) {
            head = newnode;
            return;
        }
        Node currNode = head;
        while (currNode.next != null) {
            currNode = currNode.next;
        }
        currNode.next = newnode;
    }

    public void delfirst() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        size--;
        head = head.next;
    }

    public void dellast() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        size--;
        if (head.next == null) {
            head = null;
            return;
        }
        Node sl = head;
        Node l = head.next;
        while (l.next != null) {
            l = l.next;
            sl = sl.next;
        }
        sl.next = null;
    }

    void printlist() {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Node c = head;
        while (c != null) {
            System.out.print(c.Data + "->");
            c = c.next;
        }
        System.out.println();
    }

    void search(char ch) {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Node c = head;
        int i = 0;
        while (c.Data.charAt(0) != ch) {
            c = c.next;
            i++;
        }
        System.out.println("Index is :" + i);
    }

    int size() {
        return size;
    }

    public static void main(String[] args) {
        LL list = new LL();
        Scanner sc = new Scanner(System.in);
        list.addfirst("s");
        list.addfirst("a");
        list.addfirst("n");
        list.addfirst("a");
        list.addfirst("M");
        list.printlist();
        list.dellast();
        list.printlist();
        list.delfirst();
        list.printlist();
        System.out.println("Enter the char to search ");
        char ch = sc.next().charAt(0);
        System.out.println("Size is :" + list.size());
    }
}