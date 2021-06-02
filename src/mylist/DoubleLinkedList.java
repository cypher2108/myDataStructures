package mylist;

public class DoubleLinkedList<E> {

    private static class Node<E> {
        /**
         * we're gonna define the data fields for our base class for implementation for
         * doubly linked list
         * 
         * A basic Node for our Doubly linked list contains
         * 
         * 1. a refrence for previous Node 2. Data that actually matters 3. Refrence for
         * the next node
         */
        private Node<E> previousNodeRef;
        private E theData;
        private Node<E> nextNodeRef;

        public Node(E theData) {
            this.theData = theData;
            nextNodeRef = null;
            previousNodeRef = null;
        }

        @Override
        public String toString() {
            return "[" + theData + "]";
        }
    }

    // for our list we need few datafields.
    private int size;
    private Node<E> head;
    private Node<E> tail;

    // Now we need constructor to initialize.
    public DoubleLinkedList() {
        head = tail = null;
        size = 0;
    }

    public int getSize() {
        return size;
    }

    public void add(E anEntry) {
        if (head == null) {
            head = new Node<>(anEntry);
            tail = head;
            size++;
        } else {

            Node<E> temp = head;
            while (temp.nextNodeRef != null) {
                temp = temp.nextNodeRef;
            }

            Node<E> lastNode = temp;
            temp.nextNodeRef = new Node<>(anEntry);
            tail = temp.nextNodeRef;
            tail.previousNodeRef = lastNode;
            size++;
        }
    }

    public void add(E anEntry, int index) {

        if (index >= 0 || index < size) {

            if (index == 0) {
                Node<E> temp = head;
                Node<E> newNode = new Node<>(anEntry);
                newNode.nextNodeRef = temp;
                temp.previousNodeRef = newNode;
                head = newNode;
                size++;
            } else if (index == size - 1) {
                Node<E> temp = tail;
                Node<E> newNode = new Node<>(anEntry);
                newNode.previousNodeRef = temp;
                tail = newNode;
                temp.nextNodeRef = newNode;
                size++;
            } else {
                Node<E> temp = head;
                for (var i = 0; i < index - 1; i++) {
                    temp = temp.nextNodeRef;
                }
                Node<E> newNode = new Node<>(anEntry);
                Node<E> nextNode = temp.nextNodeRef;

                temp.nextNodeRef = newNode;
                newNode.previousNodeRef = temp;

                newNode.nextNodeRef = nextNode;
                nextNode.previousNodeRef = newNode;

                size++;
            }
        } else {
            System.out.println("There is no such index you're trying to access.");
        }
    }

    public void remove(int index) {

        /**
         * so let's disciss the scenerio there are two possibilities here too, 1. if
         * user removes the first element 2. if user removes the element at specific
         * index.
         */

        if (index == 0) {
            head = head.nextNodeRef;
            head.previousNodeRef = null;
            size--;
        } else if (index == size - 1) {
            tail = tail.previousNodeRef;
            tail.nextNodeRef = null;
            size--;
        } else {
            Node<E> temp = head;
            for (var i = 0; i < index - 1; i++) {
                temp = temp.nextNodeRef;
            }

            Node<E> previousNode = temp;

            temp = temp.nextNodeRef;
            temp = temp.nextNodeRef;

            previousNode.nextNodeRef = temp;
            temp.previousNodeRef = previousNode;
            size--;
        }
    }

    public E get(int index) {
        Node<E> temp = head;
        for (var i = 0; i < index; i++) {
            temp = temp.nextNodeRef;
        }
        return temp.theData;
    }

    public void set(int index, E anEntry) {
        Node<E> temp = head;
        for (var i = 0; i < index; i++) {
            temp = temp.nextNodeRef;
        }
        temp.theData = anEntry;
    }

    public int indexOf(E target) {
        Node<E> temp = head;
        for (int i = 0; i < size; i++) {
            if (temp.theData == target) {
                return i;
            } else {
                temp = temp.nextNodeRef;
            }
        }
        return -1;
    }

    public void printList(){
        Node<E> temp = head;
        for (var i = 0; i < size; i++) {
            System.out.println(temp.theData);
            temp = temp.nextNodeRef;
        }
    }
}
