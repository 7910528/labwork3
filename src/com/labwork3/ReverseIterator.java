package com.labwork3;

import java.util.NoSuchElementException;

/**
 * Concrete Iterator for reverse traversal
 * @param <T> Type of elements in the collection
 */
class ReverseIterator<T> implements Iterator<T>
{
    private LinearList<T> list;
    private int index;
    /**
     * Constructor for ReverseIterator
     * @param list The linear list to iterate over
     */
    ReverseIterator(LinearList<T> list)
    {
        this.list = list;
        this.index = list.size() - 1;
    }
    @Override
    public boolean hasNext()
    {
        while (index >= 0 && list.get(index) == null)
        {
            index--;
        }
        return index >= 0;
    }
    @Override
    public T next()
    {
        if (!hasNext())
        {
            throw new NoSuchElementException();
        }
        return list.get(index--);
    }
}