public class Main {
    public static void main(String[] args) {
        LL list = new LL();
        list.insertFirst(5);
        list.insertFirst(7);
        list.insertFirst(9);
        list.insertFirst(11);
        list.insertFirst(15);
        list.insertFirst(17);
        list.InsertLast(19);

        list.InsertRandom(3,1024);
        list.Display();
        System.out.println(list.DeleteFirst());
        list.Display();
        System.out.println(list.DeleteLast());
        list.Display();
        System.out.println(list.DeleteRandom(2));

        list.Display();
    }
}