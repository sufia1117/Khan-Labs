public interface Queue<T>{
    /**
     * Pushes an element onto the back of queue
     * @param value is the element to be added to the queue
     */
    void enqueue(T value);

    /**
     * Removes the head element of the queue
     * @return value of the removed head
     */
    T dequeue();

    /**
     * Peeks at the value of the current head element
     * @return value of the current head
     */
    T front();

    /**
     * Peeks at the value of the current head element
     * @return value of the current head
     */
    boolean empty();
}
