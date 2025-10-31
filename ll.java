package Linklist;

import java.util.Scanner;

class LL {
    Node head;
    private int size;

    class Node {
        int Data;
        Node next;

        public Node(int data) {
            this.Data = data;
            this.next = null;
            size++;
        }
    }

    public LL() {
        size = 0;
    }

    public void addfirst(int data) {
        Node newnode = new Node(data);
        if (head == null) {
            head = newnode;
            return;
        }
        newnode.next = head;
        head = newnode;
    }

    public void addlast(int data) {
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
        System.out.print("Null");
        System.out.println();
    }

    // void search(char ch) {
    // if (head == null) {
    // System.out.println("List is empty");
    // return;
    // }
    // Node c = head;
    // int i = 0;
    // while (c.Data.charAt(0) != ch) {
    // c = c.next;
    // i++;
    // }
    // System.out.println("Index is :" + i);
    // }

    int size() {
        return size;
    }

    void reverseIterate() {
        if (head == null || head.next == null)
            return;
        Node previous = null;
        Node current = head;
        while (current != null) {
            Node nexrNode = current.next;
            current.next = previous;
            // update
            previous = current;
            current = nexrNode;
        }
        head = previous;
    }

    public Node reverserecursive(Node head) {
        if (head == null || head.next == null)
            return head;
        Node newnode = reverserecursive(head.next);
        head.next.next = head;
        head.next = null;
        return newnode;
    }

    public void deletenode(int n) {
        if (head == null)
            return;
        n = size - n;
        size--;
        if (n == 0) {
            head = head.next;
            return;
        }
        if (head.next == null) {
            head = null;
            return;
        }
        int i = 1;
        Node current = head;
        while (i != n) {
            current = current.next;
            i++;
        }
        current.next = current.next.next;

    }

    public Boolean ispalindrome() {
        return true;

    }

    void searchint(int ch) {
        if (head == null) {
            System.out.println("List is empty");
            return;
        }
        Node c = head;
        int i = 0;
        while (c.Data != ch) {
            c = c.next;
            i++;
        }
        System.out.println("Index is :" + i);
    }

    public void checkpalin() {
        int n = size / 2;
        Node rev = head, lasth;
        while (n-- != 1) {
            rev = rev.next;
        }
        if (size % 2 == 0)
            lasth = reverserecursive(rev.next);
        else
            lasth = reverserecursive(rev.next.next);
        rev = head;
        n = size / 2;
        while (n-- >= 1 && rev.Data == lasth.Data) {
            rev = rev.next;
            lasth = lasth.next;
        }
        if (n == -1) {
            System.out.println("List is Palindromic");
            return;
        }
        System.out.println("List is not Palindromic");
    }

    public static void main(String[] args) {
        LL list = new LL();
        Scanner sc = new Scanner(System.in);
        list.addfirst(1);
        list.addfirst(2);
        list.addfirst(1);
        list.addfirst(2);
        list.addfirst(1);
        list.addfirst(1);
        list.addfirst(1);

        list.printlist();
        // list.dellast();
        // list.printlist();
        // list.delfirst();
        // list.printlist();
        // System.out.println("Enter the num to search ");
        // char ch = sc.next().charAt(0);
        // int n = sc.nextInt();
        // list.searchint(n);
        // System.out.println("Size is :" + list.size());
        // list.reverseIterate();
        // list.printlist();
        // // // list.head = list.reverserecursive(list.head);
        // // list.printlist();
        // System.out.println(list.size);
        // // System.out.println(list.head.Data);
        // list.deletenode(2);
        // list.printlist();
        // System.out.println(list.size);
        list.checkpalin();
        list.printlist();
    }
}