public class MainForDll {
    public static void main(String[] args) {
        DLL list = new DLL();
        list.insertFirst(5);
        list.insertFirst(7);
        list.insertFirst(9);
        list.insertFirst(11);
        list.insertFirst(15);
        list.insertFirst(17);
        list.Reverse();
        list.Display();

    }
}
