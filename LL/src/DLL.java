public class DLL {
    private Node head;
    private Node tail;
    private int size;

    public DLL(){
        this.size = 0;
    }

    private class Node{
        int value;
        Node next;
        Node prev;

        Node(int value){
            this.value = value;
        }
        Node(int value,Node next){
            this.value = value;
            this.next = next;


        }
        Node(int value,Node next,Node prev){
            this.value = value;
            this.next = next;
            this.prev  = prev;
        }
    }
    public void insertFirst(int value){
        Node node = new Node(value);
        node.next = head;
        node.prev = null;
        if(head != null){
            head.prev = node;
        }
        head = node;
    }
    public void Display(){
        Node temp = head;
        while(temp != null){
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("End");
    }
    public void Reverse(){
        Node temp = head;
        Node start = null;
        while(temp != null){
            start = temp;
            temp  =temp.next;
        }
        while(start != null){
            System.out.print(start.value + " -> ");
            start = start.prev;
        }
        System.out.println("End");
    }
}
