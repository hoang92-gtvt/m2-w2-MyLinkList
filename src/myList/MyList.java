package myList;

import java.util.Arrays;

public class MyList<E>  {
    private int size=0 ;
    private  final int DEFAULT_CAPACITY=10;

    private E[] elements;

    public MyList() {
        elements = (E[]) new Object[DEFAULT_CAPACITY];
    }

    public void ensureCapa() {
        int newSize = elements.length * 2;
        Object[] newElement = new Object[newSize];
        for (int i = 0; i < elements.length ; i++) {
            newElement[i]=elements[i];
        }
        for (int i = 0; i < elements.length; i++) {
            newElement[elements.length+i]= elements[i];
        }
        elements= (E[]) newElement;
    }

    public void add(E e) {
        if (size == elements.length) {
            ensureCapa();
        }
        elements[size++] = e;
    }

    public E get(int i) {
        if (i>= size || i <0) {
            throw new IndexOutOfBoundsException("Index: " + i + ", Size " + i );
        }
        return (E) elements[i];
    }

    @Override
    public String toString() {
        return "MyList{" +
                "size=" + size +
                ", DEFAULT_CAPACITY=" + DEFAULT_CAPACITY +
                ", elements=" + Arrays.toString(elements) +
                '}';
    }
}
