import linkedList.SingleLinkedList;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello, World!");

        //now wee're testing our own custom ArrayList class.

        SingleLinkedList<Integer> list = new SingleLinkedList<>();

        for (var i = 0; i < 20; i++) {
            list.add(i);
        }

        list.printList();

        list.add(20, 10);

        list.printList();

    }
}
