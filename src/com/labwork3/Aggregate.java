package com.labwork3;

/**
 * Interface for Aggregate
 * @param <T> Type of elements in the collection
 */
public interface Aggregate<T>
{
    /**
     * Create an iterator for forward traversal.
     * @return an iterator for forward traversal
     */
    Iterator<T> createForwardIterator();
    /**
     * Create an iterator for reverse traversal.
     * @return an iterator for reverse traversal
     */
    Iterator<T> createReverseIterator();
}