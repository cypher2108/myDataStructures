package myArrayList;

/**
 * MyArrayList This is a Implementation for Array List A custom Implementation
 * for learning purpose
 */
public class MyArrayList <E> {

    // Data Fields

    // The default initial capacity for our Arraylist to initialize with.
    private static final int INITIAL_CAPACITY = 10;

    // the data array wich we're going to use.
    private E[] theData;

    // The current size
    private int size = 0;

    // The current capacity
    private int capacity = 0;

    //constructor for custom arraylist class.
    public MyArrayList() {
        capacity = INITIAL_CAPACITY;
        theData = (E[]) new Object[capacity];
    }

    
}