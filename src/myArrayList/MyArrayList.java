package myarraylist;

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
    @SuppressWarnings("unchecked")
    public MyArrayList() {
        capacity = INITIAL_CAPACITY;
        theData = (E[]) new Object[capacity];
    }

    //now we're going to add methods for our ArrayList class

    /**
     * add method bascially gonna add an entry to the next of last used
     * index of the array theData and if the size of the array is equals to the capacity of the
     * array, it means that the array is full and need to resize, which means we're gonna create another array of bigger size
     * and copy all the array entries to the newer array and change our primary array to new array.
     */

    public boolean add(E anEntry) {
        if (size == capacity) {
            //this function is gonna do the creation and resizing of the array.
            reallocate();
        }
        theData[size] = anEntry;
        size++;
        return true;
    }
    
}