package fifoqueues;
import java.util.Stack;
public class QueueUsingTwoStack<T> {
	 private Stack<T> stack1; // Stack for enqueue operations
	    private Stack<T> stack2; // Stack for dequeue operations

	    public QueueUsingTwoStack() {
	        stack1 = new Stack<>();
	        stack2 = new Stack<>();
	    }

	    // Enqueue operation
	    public void enqueue(T item) {
	        stack1.push(item);
	    }

	    // Dequeue operation
	    public T dequeue() {
	        if (stack2.isEmpty()) {
	            if (stack1.isEmpty()) {
	                throw new IllegalStateException("Queue is empty");
	            }
	            while (!stack1.isEmpty()) {
	                stack2.push(stack1.pop());
	            }
	        }
	        return stack2.pop();
	    }

	    // Check if the queue is empty
	    public boolean isEmpty() {
	        return stack1.isEmpty() && stack2.isEmpty();
	    }

	    // Get the size of the queue
	    public int size() {
	        return stack1.size() + stack2.size();
	    }

	    // Peek at the front of the queue without removing it
	    public T peek() {
	        if (stack2.isEmpty()) {
	            if (stack1.isEmpty()) {
	                throw new IllegalStateException("Queue is empty");
	            }
	            while (!stack1.isEmpty()) {
	                stack2.push(stack1.pop());
	            }
	        }
	        return stack2.peek();
	    }

	    public static void main(String[] args) {
	        QueueUsingTwoStack<Integer> queue = new QueueUsingTwoStack<>();

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
	        System.out.println("Dequeue: " + queue.dequeue()); 
	        System.out.println("Dequeue: " + queue.dequeue()); 
	        System.out.println("IsEmpty: " + queue.isEmpty()); 
	    }
	}

