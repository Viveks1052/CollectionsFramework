package com.Queue;


import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

/* Methods used is Queue interface is
* 1. Insertion Methods:
boolean add(E e)
Inserts the specified element into the queue. Throws an exception if the queue is full.
boolean offer(E e)
Inserts the specified element into the queue. Returns false if the queue is full.
2. Removal Methods:
E remove()
Retrieves and removes the head of the queue. Throws an exception if the queue is empty.
E poll()
Retrieves and removes the head of the queue. Returns null if the queue is empty.
3. Inspection Methods:
E element()
Retrieves, but does not remove, the head of the queue. Throws an exception if the queue is empty.
E peek()
Retrieves, but does not remove, the head of the queue. Returns null if the queue is empty.
Additional Methods (Inherited from Collection Interface):
boolean isEmpty()

Checks if the queue is empty.
int size()

Returns the number of elements in the queue.
boolean contains(Object o)

Checks if the queue contains the specified element.
Iterator<E> iterator()

Returns an iterator over the elements in the queue.
boolean remove(Object o)

Removes a single instance of the specified element from the queue, if present.
boolean containsAll(Collection<?> c)

Checks if the queue contains all of the elements in the specified collection.
boolean addAll(Collection<? extends E> c)

Adds all of the elements in the specified collection to the queue.
void clear()

Removes all elements from the queue.
This list includes the primary methods in the Queue interface along with some methods inherited from the Collection interface.*/
public class PriorityQueueExample {

    public static void main(String[] args) {

        Queue<Integer> qu = new PriorityQueue<>();

        qu.add(20);
        qu.add(10);
        qu.add(11);
        qu.add(16);
        qu.add(19);
        qu.add(125);
//        qu.add(null);

        System.out.println(qu);

        Iterator<Integer> itr = qu.iterator();

        while (itr.hasNext()){
            System.out.println("Values are "+itr.next());
        }



    }
}
