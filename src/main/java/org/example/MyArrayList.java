package org.example;

import java.io.ObjectInput;
import java.util.Arrays;
import java.util.List;

public class MyArrayList<T> {

    private Object[] internalArray;
    private int capacity;

    private int size = 0;
    private static final int DEFAULT_CAPACITY = 10;

    public MyArrayList() {
        internalArray = new Object[DEFAULT_CAPACITY];
    }

    public MyArrayList(int capacity) {
        this.capacity = capacity;
        internalArray = new Object[capacity];
    }

    // add methode
    public void add(Object item) {
        size++;
        if (size <= capacity) {
            internalArray[size - 1] = item;
        } else {
            // placing the internal array values in another array
            Object[] secondInternalArray = new Object[capacity];
            for (int i = 0; i < size -1 ; i++) {
                secondInternalArray[i] = internalArray[i];
            }

            // creating new Array whit double the size
            capacity = capacity * 2;
            internalArray = new Object[capacity]; // in this example the resizing factor is 2

            // inserting the old data in the new array
            for (int i = 0; i < size -1; i++) {
                internalArray[i] = secondInternalArray[i];
            }

            // inserting the item
            internalArray[size - 1] = item;
        }

    }

    // get methode

    public T get(int index) {
        return (T) internalArray[index]; // casting
    }


    // getters and setters

    public Object[] getInternalArray() {
        return internalArray;
    }

    public void setInternalArray(Object[] internalArray) {
        this.internalArray = internalArray;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }


}
