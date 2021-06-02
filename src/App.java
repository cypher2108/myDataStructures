import mylist.DoubleLinkedList;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        //now wee're testing our own custom ArrayList class.

        DoubleLinkedList<Integer> list = new DoubleLinkedList<>();

        for (var i = 0; i < 20; i++) {
            list.add(i);
        }
        list.printList();

        list.remove(0);

        list.printList();

        System.out.println(list.indexOf(10));
    }
}
