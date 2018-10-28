class CreateLL {
    public static void main(String[] args) {
        LinkedListCustom ll = new LinkedListCustom();

        ll.append(1);
        ll.append(2);
        ll.append(3);
        ll.append(4);

        ll.printList();

        System.out.println(ll.search(1));
        System.out.println(ll.search(2));
        System.out.println(ll.search(3));
        System.out.println(ll.search(4));

        ll.delete(4);
        ll.prepend(4);
        ll.printList();

        System.out.println(ll.search(1));
        System.out.println(ll.search(2));
        System.out.println(ll.search(3));
        System.out.println(ll.search(4));

        ll.printList();
        System.out.println(ll.delete(25));
    }
}