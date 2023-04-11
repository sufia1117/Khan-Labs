public class LinkedQueue<T> implements Queue<T> {

    /**
     * Construct a new LinkedQueue
     */
    public LinkedQueue(){
    }

    /**
     * Inner class to hold the data of our stack.
     */
    private class Node {
        T data;
        Node next;
    }

    private Node head; // refers to the first node of the linked queue
    private Node tail;  // refers to back of linked queue

    @Override
    public void enqueue(T value) {
        Node newNode = new Node();
        newNode.data = value;
        while (tail != null) {
            newNode.next = tail;
            tail = newNode;
        }
    }

    @Override
    public T dequeue() {
        if (head == null) {
            return null;
        }
        T data = head.data;
        head = head.next;
        return data;
    }

    @Override
    public T front() {
        if (head == null) {
            return null;
        }
        return head.data;
    }

    @Override
    public boolean empty() {
        return head == null;
    }

    public static void main(String[] args) {
        int sum = 0;
        // Instantiate a new LinkedQueue
        Queue<Integer> queue1 = new LinkedQueue<>();

        // Enqueue integers onto queue
        queue1.enqueue(Integer.valueOf(5));
        queue1.enqueue(Integer.valueOf(2));
        queue1.enqueue(Integer.valueOf(8));
        queue1.enqueue(Integer.valueOf(13));
        queue1.enqueue(Integer.valueOf(6));
        queue1.enqueue(Integer.valueOf(11));

        // In a loop, add head to sum variable, then dequeue
        while (!queue1.empty()) {
            sum += queue1.front(); // add value of head to sum
            queue1.dequeue();  // dequeue head
        }
        System.out.println("The sum of all elements in the queue is " + sum);
    }
}
