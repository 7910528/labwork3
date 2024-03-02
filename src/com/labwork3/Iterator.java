package com.labwork3;

import java.util.NoSuchElementException;

/**
 * Interface for Iterator
 * @param <T> Type of elements in the collection
 */
interface Iterator<T>
{
    /**
     * Check if there are more elements to iterate over.
     * @return true if there are more elements, false otherwise
     */
    boolean hasNext();
    /**
     * Get the next element in the iteration.
     * @return the next element
     * @throws NoSuchElementException if there are no more elements to iterate over
     */
    T next();
}