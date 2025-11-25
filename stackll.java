package Linklist;

public class stackll {

    static class Node {
        int Data;
        Node next;

        public Node(int data) {
            this.Data = data;
            this.next = null;
        }
    }

    static class stack {
        static Node head;

        public static boolean isEmpty() {
            return head == null;
        }

        public static void push(int data) {
            Node newnode = new Node(data);
            if (isEmpty()) {
                head = newnode;
                return;
            }
            newnode.next = head;
            head = newnode;
        }

        public static int pop() {
            if (isEmpty()) {
                System.out.println("List is Empty");
                return -1;
            }
            int front = head.Data;
            head = head.next;
            return front;
        }

        public static int peek() {
            if (isEmpty()) {
                System.out.println("List is empty");
                return -1;
            }
            return head.Data;

        }

        public static void pushAtBottom(int d, stack s) {
            if (s.isEmpty()) {
                s.push(d);
                return;
            }
            int data = s.pop();
            pushAtBottom(data, s);
            s.push(data);
            System.out.println(s.peek());

        }

    }

    // public static void pushAtBottom(int d, Stack<Integer> s) {
    // if (s.isEmpty()) {
    // s.push(d);
    // return;
    // }
    // int data = s.pop();
    // pushAtBottom(data, s);
    // s.push(data);
    // System.out.println(s.peek());

    // }

    public static void main(String[] args) {
        stack s = new stack();
        // Stack<Integer> st = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        System.out.println(s.pop());
        s.push(5);
        // while (!s.isEmpty()) {
        // System.out.println(s.peek());
        // s.pop();
        // }
        // System.out.println("");
        s.pushAtBottom(6, s);
        // System.out.println(s.peek());
        while (!s.isEmpty()) {
            System.out.println(s.peek());
            s.pop();
        }
        System.out.println(s.peek());
        // st.push(1);
        // st.push(2);
        // st.push(3);
        // st.push(4);
        // st.pushAtBottom(0, st);
        // System.out.println(st.pop());
        // while (!st.isEmpty()) {
        // System.out.println(st.peek());
        // st.pop();
        // }
    }
}
