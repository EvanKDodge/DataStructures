class Node {
    Character data;
    Node next;

    public Node(Character d) {
        data = d;
        next = null;
    }
}

public class StackCustom {
    Node head;

    public StackCustom() {
        // start with an empty stack
        head = null;
    }

    public Character peek() {
        if(head != null) {
            return head.data;
        }
        else
        {
            return null;
        }
    }

    public Character pop() {
        if(head != null) {
            Character t = head.data;
            head = head.next;
            return t;
        }
        else {
            return null;
        }
    }

    public void push(Character d) {
        Node n = new Node(d);
        if(head != null) {
            n.next = head;
            head = n;
        }
        else {
            head = n;
        }
    }

    public void printStack() {
        Node current = head;
        while(current != null) {
            System.out.println(current.data);
            current = current.next;
        }
    }
}