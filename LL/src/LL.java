public class LL {

    private Node head;
    private Node tail;
    private int size;

    public LL() {
        this.size = 0;
    }

    private class Node {


        private int value;
        private Node next;

        Node(int value) {
            this.value = value;
        }

        Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }

    }

    public void insertFirst(int val) {
        Node node = new Node(val);
        node.next = head;
        head = node;
        if (tail == null) {
            tail = head;
        }
        size += 1;
    }

    public void Display() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.print("End");
    }

    public void InsertLast(int value) {
        Node node = new Node(value);

        if (tail == null) {
            insertFirst(value);
        } else {
            tail.next = node;
            tail = node;
            size += 1;
        }

    }

    public void InsertRandom(int index, int value) {
        Node node = new Node(value);

        if (head == null) {
            insertFirst(value);
        } else {
            Node temp = head;
            for (int i = 1; i < index; i++) {
                temp = temp.next;

            }
            Node currNext = temp.next;
            temp.next = node;
            node.next = currNext;
        }
    }

    public int DeleteFirst() {
        int value = head.value;
        head = head.next;
        if (head == null) {
            tail = null;
        }
        size--;
        return value;


    }

    public int DeleteLast() {
        Node temp = head;
        if(head == null){
            return -1223;
        }
        while (temp.next != null && temp.next.next != null) {
            temp = temp.next;

        }
        int value = temp.next.value;
        System.out.println(value);
        temp.next = null;
        return  value;

    }
}
