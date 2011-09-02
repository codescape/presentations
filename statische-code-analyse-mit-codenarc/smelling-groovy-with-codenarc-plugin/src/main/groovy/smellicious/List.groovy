package smellicious

import groovy.swing.factory.ActionFactory;
import java.util.ArrayList
import java.util.Collection

class List {

    private Object[] elements = new Object[10]
    private int size
    private boolean readOnly

    public boolean isEmpty() {
        if (size == 0)
            return true
        else
            return false
    }

    public int size() {
        size
    }

    public int capacity() {
        elements.length
    }

    public void add(Object newElement) {
        if (readOnly)
            return

        int increasedSize = size + 1
        if (increasedSize > elements.length) {
            Object[] grownElements = new Object[elements.length + 10];
            for (int i = 0; i < size; i++) {
                def nextElement = elements[i]
                grownElements[i] = nextElement
            }
            elements = grownElements
        }

        elements[size++] = newElement;
    }

    public void set(int i, Object newValue) {
        if (!readOnly) {
            if (i >= size)
                throw new ArrayIndexOutOfBoundsException()
            elements[i] = newValue;
        }
    }

    public boolean contains(Object element) {
        (boolean) elements.each { it.equals element }
    }

    public Object get(int i) {
        try {
            def elementAtPos = elements[i]
            elements[i]
        } catch (IndexOutOfBoundsException e) {
            return null
        }
    }

    public void setReadonly(boolean b) {
        readOnly = b
    }

    public boolean remove(Object element) {
        if (readOnly)
            return new Boolean(true)
        else
            for (int i = 0; i < size; i++)
                if (elements[i].equals(element)) {
                    elements[i] = null

                    Object[] newElements = new Object[size - 1];
                    int k = 0;
                    for (int j = 0; j < size; j++) {
                        if (elements[j] != null)
                            newElements[k++] = elements[j]
                    }

                    decreaseSize()
                    elements = newElements;
                    return true
                }
        false
    }

    private def decreaseSize() {
        size--
    }

    public void setReadOnly(boolean b) {
        readOnly = (b == true ? true : false);
    }
}
