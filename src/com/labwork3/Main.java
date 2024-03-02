package com.labwork3;

/**
 * Main class to demonstrate usage of LinearList with iterators.
 */
public class Main
{
    public static void main(String[] args)
    {
        LinearList<String> list = new LinearList<>(5);
        list.add("A");
        list.add(null);
        list.add("B");
        list.add(null);
        list.add("C");
        Iterator<String> forwardIterator = list.createForwardIterator();
        while (forwardIterator.hasNext())
        {
            System.out.print(forwardIterator.next() + " ");
        }
        System.out.println();
        Iterator<String> reverseIterator = list.createReverseIterator();
        while (reverseIterator.hasNext())
        {
            System.out.print(reverseIterator.next() + " ");
        }
        System.out.println();
    }
}