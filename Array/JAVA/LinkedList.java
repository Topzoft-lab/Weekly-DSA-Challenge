/**
 * Implement a Node class and a LinkedList class.
 * Write a method to insert a node at the end or any position.
 * Traverse the list and print the node values.
 */
public class LinkedList {
    Node head;

    public LinkedList() {
        this.head = null;
    }

    public void insertAtEnd(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = newNode;
            return;
        }
        Node current = head;
        while (current.next != null) {
            current = current.next;
        }
        current.next = newNode;
    }

    public void insertAtPosition(int data, int position) {
        Node newNode = new Node(data);
        if (position == 1) {
            newNode.next = head;
            head = newNode;
            return;
        }
        Node current = head;
        int count = 1;
        while (count < position - 1 && current.next != null) {
            current = current.next;
            count++;
        }
        if (current.next == null) {
            System.out.println("Invalid position");
            return;
        }
        newNode.next = current.next;
        current.next = newNode;
    }

    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.insertAtEnd(1);
        list.insertAtEnd(2);
        list.insertAtEnd(3);
        System.out.println("Linked List after insertion at end: ");
        list.printList();
        list.insertAtPosition(4, 2);
        System.out.println("Linked List after insertion at position 2: ");
        list.printList();
    }
}

class Node {
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }
}