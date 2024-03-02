package com.labwork3;

/**
 * Concrete Aggregate representing a linear list of objects
 * @param <T> Type of elements in the list
 */
class LinearList<T> implements Aggregate<T>
{
    private Object[] elements;
    private int size;
    /**
     * Constructor for LinearList
     * @param capacity The initial capacity of the list
     */
    LinearList(int capacity)
    {
        elements = new Object[capacity];
        size = 0;
    }
    /**
     * Add an element to the list.
     * @param element The element to add
     */
    public void add(T element)
    {
        if (size < elements.length)
        {
            elements[size++] = element;
        }
        else
        {
            System.out.println("Linear list is full.");
        }
    }
    /**
     * Get the element at a specified index.
     * @param index The index of the element to retrieve
     * @return The element at the specified index
     * @throws IndexOutOfBoundsException if the index is out of bounds
     */
    public T get(int index)
    {
        if (index < 0 || index >= size)
        {
            throw new IndexOutOfBoundsException("Index out of bounds");
        }
        return (T) elements[index];
    }
    /**
     * Get the size of the list.
     * @return The size of the list
     */
    public int size()
    {
        return size;
    }
    @Override
    public Iterator<T> createForwardIterator()
    {
        return new ForwardIterator<>(this);
    }
    @Override
    public Iterator<T> createReverseIterator()
    {
        return new ReverseIterator<>(this);
    }
}