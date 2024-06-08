package fifoqueues;

public class QueueUsingArray<T>{
	
	    private T[] queue;
	    private int front;
	    private int rear;
	    private int size;
	    private int capacity;

	    @SuppressWarnings("unchecked")
	    public QueueUsingArray(int capacity) {
	        this.capacity = capacity;
	        queue = (T[]) new Object[capacity];
	        front = 0;
	        rear = 0;
	        size = 0;
	    }

	    // Enqueue operation
	    public void enqueue(T item) {
	        if (size == capacity) {
	            throw new IllegalStateException("Queue is full");
	        }
	        queue[rear] = item;
	        rear = (rear + 1) % capacity;
	        size++;
	    }

	    // Dequeue operation
	    public T dequeue() {
	        if (size == 0) {
	            throw new IllegalStateException("Queue is empty");
	        }
	        T item = queue[front];
	        queue[front] = null; // Help with garbage collection
	        front = (front + 1) % capacity;
	        size--;
	        return item;
	    }

	    // Check if the queue is empty
	    public boolean isEmpty() {
	        return size == 0;
	    }

	    // Get the size of the queue
	    public int size() {
	        return size;
	    }

	    // Peek at the front of the queue without removing it
	    public T peek() {
	        if (size == 0) {
	            throw new IllegalStateException("Queue is empty");
	        }
	        return queue[front];
	    }

	    public static void main(String[] args) {
	    	QueueUsingArray<Integer> queue = new QueueUsingArray<>(5);

	        // Test the queue
	        queue.enqueue(1);
	        queue.enqueue(2);
	        queue.enqueue(3);

	        System.out.println("Dequeue: " + queue.dequeue()); 
	        System.out.println("Peek: " + queue.peek());      
	        System.out.println("Dequeue: " + queue.dequeue()); 
	        System.out.println("IsEmpty: " + queue.isEmpty());
	        System.out.println("Size: " + queue.size());      

	        queue.enqueue(4);
	        queue.enqueue(5);
	        queue.enqueue(6);
	        System.out.println("Dequeue: " + queue.dequeue());
	        System.out.println("Dequeue: " + queue.dequeue()); 
	        System.out.println("Dequeue: " + queue.dequeue());
	        System.out.println("IsEmpty: " + queue.isEmpty()); 
	    }
	}



		  	