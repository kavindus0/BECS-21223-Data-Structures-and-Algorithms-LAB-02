package Question04;

public class QueueRotator {
    LinkedQueue queue;
    int rotateBy;
    
    public QueueRotator(int[] elements, int rotateBy) {
        this.queue = new LinkedQueue();
        this.rotateBy = rotateBy;
        
        // Initialize queue with elements
        for (int element : elements) {
            queue.enqueue(element);
        }
    }
    
    public void rotate() {
        if (queue.isEmpty() || rotateBy <= 0 || rotateBy % queue.size() == 0) {
            return;
        }
        
        // Ensure rotateBy is within bounds
        rotateBy = rotateBy % queue.size();
        
        // Perform rotation operation
        for (int i = 0; i < rotateBy; i++) {
            int temp = queue.dequeue();
            queue.enqueue(temp);
        }
    }
    
    public void displayQueue() {
        queue.display();
    }
}