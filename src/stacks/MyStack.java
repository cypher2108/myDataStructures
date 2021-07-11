package stacks;

import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class MyStack <E> implements StackInt<E> {

    // the datastructure we need to implememt our stack.
    private List<E> theData;

    // constructor that initialize our list to arraylist.
    public MyStack() {
        this.theData = new ArrayList<>();
    }

    @Override
    public E push(E obj) {
        theData.add(obj);
        return obj;
    }

    @Override
    public E peek() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return theData.get(theData.size()-1);
    }

    @Override
    public E pop() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }
        return theData.remove(theData.size() - 1);
    }

    @Override
    public boolean isEmpty() {
        return theData.isEmpty();
    }
    
}
