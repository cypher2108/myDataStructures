package myArraylist;

import java.util.Arrays;

/**
 * MyArrayList This is a Implementation for Array List A custom Implementation
 * for learning purpose
 */
public class MyArrayList<E> {

    // Data Fields

    // The default initial capacity for our Arraylist to initialize with.
    private static final int INITIAL_CAPACITY = 10;

    // the data array wich we're going to use.
    private E[] theData;

    // The current size
    private int size = 0;

    // The current capacity
    private int capacity = 0;

    // constructor for custom arraylist class.
    @SuppressWarnings("unchecked")
    public MyArrayList() {
        capacity = INITIAL_CAPACITY;
        theData = (E[]) new Object[capacity];
    }

    // now we're going to add methods for our ArrayList class

    // reacllocate method which we're going to use when our array gets full of space
    // and we need to change its size.

    private void reallocate() {
        capacity = capacity * 2;
        theData = Arrays.copyOf(theData, capacity);
    }

    /**
     * add method bascially gonna add an entry to the next of last used index of the
     * array theData and if the size of the array is equals to the capacity of the
     * array, it means that the array is full and need to resize, which means we're
     * gonna create another array of bigger size and copy all the array entries to
     * the newer array and change our primary array to new array.
     */

    public boolean add(E anEntry) {
        if (size == capacity) {
            // this function is gonna do the creation and resizing of the array.
            reallocate();
        }
        theData[size++] = anEntry;
        return true;
    }

    // now an add method for place the data at specific index
    public void add(int index, E anEntry) {
        if (index < 0 || index >= size) {
            throw new ArrayIndexOutOfBoundsException(index);
        }
        if (size == capacity) {
            reallocate();
        }
        // now we're gonna shift the data from given index to (size -1)th index.

        // =========== main work ==============
        for (int i = size; i > index; i--) {
            theData[i] = theData[i - 1];
        }
        // ====================================

        // now we can insert item at desired index.
        theData[index] = anEntry;
        size++;
    }

    public E get(int index) {
        if (index < 0 || index >= size) {
            throw new ArrayIndexOutOfBoundsException(index);
        }
        return theData[index];
    }

    public E set(int index, E newValue) {
        if (index < 0 || index >= size) {
            throw new ArrayIndexOutOfBoundsException(index);
        }
        var oldValue = theData[index];
        theData[index] = newValue;
        return oldValue;
    }

    //now we're gonna implement remove method for our Arraylist.
    public E remove(int index){
        if (index < 0 || index >= size) 
            throw new ArrayIndexOutOfBoundsException(index);
        
        var returnValue = theData[index];

        for (int i = index + 1; i < size; i++) {
            theData[i-1] = theData[i];
        }
        size--;
        return returnValue;
    }

    @Override
    public String toString() {
        return "theData=" + Arrays.toString(theData);
    }
}