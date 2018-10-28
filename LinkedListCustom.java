class Node {
    int data;
    Node next;

    public Node(int d) {
        data = d;
        next = null;
    }
}

public class LinkedListCustom {
    Node head;

    public LinkedListCustom() {
        // start with an empty list
        head = null;
    }

    public void append(int d) {
        Node n = new Node(d);

        if(head == null) {
            head = n;
        }
        else {
            Node current = head;
            while(current.next != null) {
                current = current.next;
            }
            current.next = n;
        }
    }

    public void prepend(int d) {
        Node n = new Node(d);

        if(head == null) {
            head = n;
        }
        else {
            n.next = head;
            head = n;
        }
    }

    public boolean delete(int d) {
        if(head != null) {
            if(head.data == d) {
                head = head.next;
            }
            else {
                Node current = head.next;
                Node last = head;
                while(current != null) {
                    if(current.data == d) {
                        last.next = current.next;
                    }
                    last = current;
                    current = current.next;
                }
            }
        }

        return false;
    }

    public boolean search(int d) {
        Node current = head;
        while(current != null) {
            if(current.data == d) {
                return true;
            }
            current = current.next;
        }
        
        return false;
    }

    public void printList() {
        Node current = head;
        while(current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }
}