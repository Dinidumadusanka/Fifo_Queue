package fifoqueues;
import java.util.Deque;
import java.util.LinkedList;
public class QueueUsingDeque<T>{
	    private Deque<T> deque;

	    public QueueUsingDeque() {
	        deque = new LinkedList<>(); 
	    }

	    // Enqueue operation
	    public void enqueue(T item) {
	        deque.addLast(item);
	    }

	    // Dequeue operation
	    public T dequeue() {
	        if (deque.isEmpty()) {
	            throw new IllegalStateException("Queue is empty");
	        }
	        return deque.removeFirst();
	    }

	    // Check if the queue is empty
	    public boolean isEmpty() {
	        return deque.isEmpty();
	    }

	    // Get the size of the queue
	    public int size() {
	        return deque.size();
	    }

	    // Peek at the front of the queue without removing it
	    public T peek() {
	        if (deque.isEmpty()) {
	            throw new IllegalStateException("Queue is empty");
	        }
	        return deque.peekFirst();
	    }

	    public static void main(String[] args) {
	        QueueUsingDeque<Integer> queue = new QueueUsingDeque<>();

	        // Test the queue
	        queue.enqueue(50);
	        queue.enqueue(60);
	        queue.enqueue(70);

	        System.out.println("Dequeue: " + queue.dequeue());
	        System.out.println("Peek: " + queue.peek());       
	        System.out.println("Dequeue: " + queue.dequeue()); 
	        System.out.println("IsEmpty: " + queue.isEmpty()); 
	        System.out.println("Size: " + queue.size());      

	        queue.enqueue(80);
	        queue.enqueue(90);
	        System.out.println("Dequeue: " + queue.dequeue());
	        System.out.println("Dequeue: " + queue.dequeue()); 
	        System.out.println("Dequeue: " + queue.dequeue());
	        System.out.println("IsEmpty: " + queue.isEmpty()); 
	    }
	}


