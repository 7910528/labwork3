package com.labwork3;

import java.util.NoSuchElementException;

/**
 * Concrete Iterator for forward traversal
 * @param <T> Type of elements in the collection
 */
class ForwardIterator<T> implements Iterator<T>
{
    private LinearList<T> list;
    private int index;
    /**
     * Constructor for ForwardIterator
     * @param list The linear list to iterate over
     */
    ForwardIterator(LinearList<T> list)
    {
        this.list = list;
        index = 0;
    }
    @Override
    public boolean hasNext()
    {
        while (index < list.size() && list.get(index) == null)
        {
            index++;
        }
        return index < list.size();
    }
    @Override
    public T next()
    {
        if (!hasNext())
        {
            throw new NoSuchElementException();
        }
        return list.get(index++);
    }
}